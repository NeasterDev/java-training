package com.fullstackproject.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MySQLUserDetailsService implements UserDetailsService {

	// instance of out user repository 
	@Autowired
	private UserRepository userRepository;
	
	// instance of springs password encoder
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	// method to retrieve user information from userRepository
	@Override
	public UserDetails loadUserByUsername(String username) {
		// searches the repository for a user with a matching username
		// and sets it to user
		User user = userRepository.findByUsername(username);
		// if the user was not found
		if (user == null) { 
			// throw error
			throw new UsernameNotFoundException(username);
		}
		// returns a new user with the values of their username password
		// and authority level
		return new  org.springframework.security.core.userdetails.
					User(user.getUsername(), user.getPassword(), getAuthorities());
	}
	
	// creates a new user and adds it to the repository (database)
	public UserDetails Save(User newUser) {
		// encodes(encrypts) the password for the new user before saving it to the database
		newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
		// save the new user to the database
		User savedUser = userRepository.save(newUser);
		// returns a new user with the information of the user we just created
		// plus an authorization level
		return new org.springframework.security.core.userdetails.
				User(savedUser.getUsername(), savedUser.getPassword(), getAuthorities());
	}
	
	// setting the authority level of the user (for now only one authority level)
	private List<SimpleGrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authList = new ArrayList<>();
		authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		return authList;
	}
}
