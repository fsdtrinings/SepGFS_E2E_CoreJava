package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class MySecurityConfigurationClass extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// responsible for user creations and providing roles to the user
		
		auth.inMemoryAuthentication().withUser("mike").password(passwordEncoder().encode("mike123")).roles("admin","employee");
		auth.inMemoryAuthentication().withUser("jenny").password(passwordEncoder().encode("jenny123")).roles("employee");
		auth.inMemoryAuthentication().withUser("min").password(passwordEncoder().encode("min123")).roles("admin");
		
		System.out.println("---- user created "+auth);
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests()
		.antMatchers("/public/**").permitAll()
		.antMatchers("/admin/**").hasRole("admin")
		.antMatchers("/emp/**").hasRole("employee")
		
		.anyRequest()
		.authenticated()
		
		
		.and()
		.httpBasic();  // htto basic 
		
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
		//return NoOpPasswordEncoder.getInstance(); // avoid 
	}
	
}//end class


