package com.fullstackproject.auth;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.*;
import static com.fullstackproject.auth.AuthConstants.*;

//Several components are being brought together in this class. The MySQLUserDetailsService is being Autowired, the PasswordEncoder 
//is using BCrypt to provide password encryption and used in the JWTAuthorizationFilter, the JWTAuthorizationFilter and JWTAuthenticationFilter 
//are being added to the request pipeline in the configure method. There's even an added 
//element of CORS to this class. WebSecurityConfig is the class which takes all the components and configures them for use in our application.


//The first item to take note of is this class extends the WebSecurityConfigurerAdapter class. There is also an annotation of 
//@EnableWebSecurity that lets Spring Boot know that this class should be a part of the security infrastructure.
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  private MySQLUserDetailsService mySQLUserDetailsService;

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

//  The configureGlobal method is receiving an instance of the AuthenticationManagerBuilder
//  and configuring it to use the MySQLUserDetailsService as well as the BCrypt password encoder.
  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(mySQLUserDetailsService).passwordEncoder(passwordEncoder());
  }

//  Next the configure method is where most of the important configuration takes place. 
//  Let's break down each method that'sbeing chained as part of this configure method.
//
//  First, the cors() method is activating the CORS capability to allow cross origin requests.
//  Next, the csrf().disable() methods are disabling a protection called Cross Site Request Forgery. 
//  It's a way for a malicious attacker to piggyback on a user session that has been authenticated. 
//  Since you are not using user sessions to manage user requests and their identity, this isn't a concern.
//  Then the .authorizeRequests().antMatchers().permitAll() chained methods allow any user to access the api/user/register route. 
//  Later you will add this route so you can create users. Since new users who have not registered are not authenticated, you should 
//  go ahead and let them have access to register.
//  Next is the .anyRequest().authenticated() followed by the addition of the JWTAuthenticationFilter and JWTAuthorizationFilter. 
//  These are the functions that configure all other parts of the RESTful api should require authentication with the two filters as 
//  the method of authentication and authorization.
//  Lastly the .sessionManagement().sessionCreationPolicy() is where the session state management by Spring is set to Stateless. 
//  That means the Java Spring application will not hold onto any user information about their session. It is up to the client to 
//  authorize themselves each time and remember what actions have happened.
@Override
  protected void configure(HttpSecurity http) throws Exception {
    http.cors()
      .and()
      .csrf().disable()
      .authorizeRequests().antMatchers(HttpMethod.POST, SIGN_UP_URL).permitAll()
      .anyRequest().authenticated()
      .and()
      .addFilter(new JWTAuthenticationFilter(authenticationManager()))
      .addFilter(new JWTAuthorizationFilter(authenticationManager()))
      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  }
//At the end of the WebSecurityConfig class, you added a corsConfigurationSource method that will configure 
//the way CORS is handled. When a CORS request is received the application must determine if the IP address is 
//allowed to access the application, as well as which headers to permit sending the client, and which routes are they allowed to access.
//
//In the code example provided, all IP addresses are allowed to connect to all routes in the application.
//This is done through the combination of the .applyPermitDefaultValues() method being called on the corsConfig variable, 
//and the .registerCorsConfiguration() method that registers all routes in the application to use this configuration.

//There is also the addition of the "Authorization" header as an exposed header. 
//By default CORS does not allow the Authorization header to be sent to the client.
//You must specify it within the array of headers to be exposed using the .setExposedHeaders() method on the Cors Configuration object.
  @Bean
  CorsConfigurationSource corsConfigurationSource() {
    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration corsConfig = new CorsConfiguration();
    corsConfig.applyPermitDefaultValues();
    corsConfig.setExposedHeaders(Arrays.asList("Authorization"));
    source.registerCorsConfiguration("/**", corsConfig);
    return source;
  }
  
//  You may have noticed the use of the annotation @Bean on some of the methods provided within the configuration files of Spring.
//  A @Bean method is used to provide an instance of an object when needed for dependency injection with the @Autowired annotation. 
//  For example, within the MySQLUserDetailsService there was an @Autowired property for the PasswordEncoder. Later in the WebSecurityConfig 
//  class you defined the @Bean for PasswordEncoder to use an instance of BCryptPasswordEncoder.

//  Many other annotations can be used to create an instance of an object to be injected using @Autowired. 
//  @Component, @Service, @Repository, @Configuration, and others can be used to indicate a class 
//  or method should be used for dependency injection where called upon by @Autowired.
}