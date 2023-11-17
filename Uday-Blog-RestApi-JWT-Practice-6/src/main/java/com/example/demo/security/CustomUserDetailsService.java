package com.example.demo.security;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
		
		User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found With UserName with Email: " +usernameOrEmail));
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(),
				user.getPassword() , mapRolesToAuthorites(user.getRoles()));
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorites(Set<Role> roles){
		
	return	roles.stream().map((role) -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
		
	}

}