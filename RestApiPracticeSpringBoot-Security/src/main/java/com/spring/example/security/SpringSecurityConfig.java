package com.spring.example.security;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class SpringSecurityConfig {
	
	//InMemoryUserDetailsManager security login user roles
	
/*	@Bean
	public InMemoryUserDetailsManager  configInMemoryUsers() {
		
		//create userdetails
		UserDetails user1 = User.builder().username("uday").password("{noop}uday").roles("ADMIN").build();
		UserDetails user2 = User.builder().username("kiran").password("{noop}kiran").roles("manager").build();
		UserDetails user3 = User.builder().username("Ashok").password("{noop}Ashok").roles("Admin", "manager").build();
		
		//create inMemorydetailsManager object
		InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user1,user2, user3);
		
		return inMemoryUserDetailsManager;	
		
	} */
	
	//Database Security login user roles
	@Bean
	public UserDetailsManager configDataSource(DataSource datasource) {
		
		UserDetailsManager userDetailsManager = new JdbcUserDetailsManager(datasource);
		
		return userDetailsManager;
	}

}
