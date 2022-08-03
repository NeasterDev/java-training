package com.fullstackproject.auth;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import static com.fullstackproject.auth.AuthConstants.*;

//In this JWTAuthorizationFilter you are extending the BasicAuthenticationFilter which is a class used by Spring 
//Security to perform the authorization. Later in this lesson you will be configuring both this JWTAuthorizationFilter 
//and the JWTAuthenticationFilter to be used by Spring Security instead of these default classes.

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {
  public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
    super(authenticationManager);
  }
  
//  The doFilterInternal method is reading the headers and looking for one called Authorization. 
//  The HEADER_STRING is a constant you set in the AuthConstants.java file. The same goes for the 
//  TOKEN_PREFIX identifier. The value set for TOKEN_PREFIX is Bearer. This is a prefix set in front 
//  of the token. The use of "Bearer" as part of the Authentication header is to help the receiver of 
//  the request understand the method of authorization taking place. In some cases the Authorization header 
//  could contain login credentials, or other information not relevant to JWT authorization.
  @Override
  protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
    String header = req.getHeader(HEADER_STRING);
    if (header == null || !header.startsWith(TOKEN_PREFIX)) {
      chain.doFilter(req, res);
      return;
    }
    UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
    SecurityContextHolder.getContext().setAuthentication(authentication);
    chain.doFilter(req, res);
  }
//  Finally, the dofilterInternal function is passing the JWT through the helper function called
//  getAuthentication. This function is comparing the JWT against the encrypted secret key (also set 
//  in the AuthConstants.java file) and verifying it's authenticity. If everything is good, then a new 
//  UsernamePasswordAuthenticationToken is generated with the user credentials and authorities. This is 
//  where you would query the database for the authorities granted by the application, but since your 
//  application has no extra levels of security this is an unnecessary step and leaving it a blank ArrayList() is acceptable.
  private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
    String token = request.getHeader(HEADER_STRING);
    if (token != null) {
      String user = JWT.require(Algorithm.HMAC512(SECRET.getBytes()))
      .build()
      .verify(token.replace(TOKEN_PREFIX, ""))
      .getSubject();
      
  	  if (user != null) {
        return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
      }
      return null;
    }
    return null;
  }
}