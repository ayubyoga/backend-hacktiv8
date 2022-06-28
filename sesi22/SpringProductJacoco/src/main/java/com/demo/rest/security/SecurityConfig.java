package com.demo.rest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private UserDetailsService userPrincipalDetailsService;

	public SecurityConfig(UserDetailsService userPrincipalDetailsService) {
		this.userPrincipalDetailsService = userPrincipalDetailsService;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/api/index").permitAll().antMatchers("/api/profile/**")
				.authenticated().antMatchers("/api/product/**").hasRole("ADMIN").antMatchers("/api/management/**")
				.hasAnyRole("ADMIN", "MANAGER").antMatchers("/api/user/test1").hasAuthority("ACCESS_TEST1")
				.antMatchers("/api/user/test2").hasAuthority("ACCESS_TEST2").and().logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/api/logout")).deleteCookies("JSESSIONID")
				.invalidateHttpSession(true).and().csrf().disable();
	}

	@Bean
	DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		daoAuthenticationProvider.setUserDetailsService((UserDetailsService) this.userPrincipalDetailsService);
		return daoAuthenticationProvider;
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
