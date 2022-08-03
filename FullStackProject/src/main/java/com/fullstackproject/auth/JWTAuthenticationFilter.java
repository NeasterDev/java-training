package com.fullstackproject.auth;

import com.auth0.jwt.JWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;
import static com.auth0.jwt.algorithms.Algorithm.HMAC512;
import static com.fullstackproject.auth.AuthConstants.*;

// In order for this AuthenticationFilter class to be implemented it must extend that class and override it;s methods.
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
  private AuthenticationManager authenticationManager;
  
  // constructor 
  public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
    this.authenticationManager = authenticationManager;
  }

  // Called by Spring security to authenticate the user and return a fully populated Authentication object
  @Override
  public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res) throws AuthenticationException {
    try {
      com.fullstackproject.auth.User creds = new ObjectMapper()
        .readValue(req.getInputStream(), com.fullstackproject.auth.User.class);

      return authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
          creds.getUsername(),
          creds.getPassword(),
          new ArrayList<>())
      );
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

//  The successfulAuthentication method is describing what should be done 
//  if the authentication was successful. In this case we want to generate 
//  a JSON Web Token and add that token as a header on the response. The front end 
//  application can then receive this JWT and store it for later use
  @Override
  protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain, Authentication auth) throws IOException, ServletException {
    String token = JWT.create()
      .withSubject(((User) auth.getPrincipal()).getUsername())
      .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
      .sign(HMAC512(SECRET.getBytes()));
    res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
  }

  // default action of the superclass if authentication unsuccessful
  @Override
  protected void unsuccessfulAuthentication(HttpServletRequest req, HttpServletResponse res, AuthenticationException failed) throws IOException, ServletException {
    super.unsuccessfulAuthentication(req, res, failed);
  }
}

