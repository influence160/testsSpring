package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{
	
	/**			TEST1 		**/
	
	/**
	 * http://localhost:8080/welcome.html => 200
	 * http://localhost:8080/user/logined.html => /login form 
	 * http://localhost:8080/user/basic/using.html => 200 for authenticated
	 * http://localhost:8080/admin/admining.html => 403
	 */
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("configure HttpSecurity");
//		http
//		.authorizeRequests(authorize -> authorize.antMatchers("/static/**", "/welcome.html").permitAll())
//		.authorizeRequests(authorize -> authorize.antMatchers("/user/**").authenticated())
//		.authorizeRequests(authorize -> authorize.antMatchers("/admin/**").access("hasRole('admin')"))
//		.authorizeRequests()
//				.anyRequest().denyAll()
//				.and()
//			.formLogin()
//			.and().httpBasic();
//	}
	
	
	
	/**
	 * la meme mais avec mvcMatcher
	 * http://localhost:8080/welcome.html => 200
	 * http://localhost:8080/user/logined.html => /login form 
	 * http://localhost:8080/user/basic/using.html => 200 for authenticated
	 * http://localhost:8080/admin/admining.html => 403
	 */
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("configure HttpSecurity");
//		http
//		.authorizeRequests(authorize -> authorize.mvcMatchers("/static/**", "/welcome.html").permitAll())
//		.authorizeRequests(authorize -> authorize.mvcMatchers("/user/**").authenticated())
//		.authorizeRequests(authorize -> authorize.mvcMatchers("/admin/**").access("hasRole('admin')"))
//		.authorizeRequests()
//				.anyRequest().denyAll()
//				.and()
//			.formLogin()
//			.and().httpBasic();
//	}
	

	/**			TEST2 		**/
	
	
	/**
	 * http://localhost:8080/aaa/bbb => 200 for authenticated
	 * http://localhost:8080/user/bbb.html => 200 for authenticated
	 */
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("configure HttpSecurity");
//		http
//		.authorizeRequests(authorize -> authorize.antMatchers("/aaa/*").authenticated())
//		.authorizeRequests(authorize -> authorize.antMatchers("/aaa/bbb.html", "/admin/**").access("hasRole('admin')"))
//		.authorizeRequests()
//				.anyRequest().denyAll()
//				.and()
//			.formLogin()
//			.and().httpBasic();
//	}

	/**
	 * la meme mais avec mvcMatcher
	 * http://localhost:8080/aaa/bbb => 200 for authenticated
	 * http://localhost:8080/user/bbb.html => 200 for authenticated
	 */
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("configure HttpSecurity");
//		http
//		.authorizeRequests(authorize -> authorize.mvcMatchers("/aaa/*").authenticated())
//		.authorizeRequests(authorize -> authorize.mvcMatchers("/aaa/bbb.html", "/admin/**").access("hasRole('admin')"))
//		.authorizeRequests()
//				.anyRequest().denyAll()
//				.and()
//			.formLogin()
//			.and().httpBasic();
//	}
	


	/**			TEST3		**/
	

	/**
	 * http://localhost:8080/aaa/bbb => 200 for authenticated
	 * http://localhost:8080/aaa/bbb/ => 403 for authenticated (user)
	 * http://localhost:8080/user/bbb.html => 403 for authenticated (user)
	 */
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("configure HttpSecurity");
		http
		.authorizeRequests(authorize -> authorize.antMatchers("/welcome.html").anonymous())
		.authorizeRequests(authorize -> authorize.antMatchers("/aaa/bbb").authenticated())
		.authorizeRequests(authorize -> authorize.antMatchers("/aaa/bbb.html", "/admin/**").access("hasRole('admin')"))
		.authorizeRequests()
				.anyRequest().denyAll()
				.and()
			.formLogin()
			.and().httpBasic();
	}

	/**
	 * la meme mais avec mvcMatcher
	 * http://localhost:8080/aaa/bbb => 200 for authenticated
	 * http://localhost:8080/aaa/bbb/ => 403 for authenticated (user)
	 * http://localhost:8080/user/bbb.html => 403 for authenticated (user)
	 */
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("configure HttpSecurity");
//		http
//		.authorizeRequests(authorize -> authorize.mvcMatchers("/aaa/bbb").authenticated())
//		.authorizeRequests(authorize -> authorize.mvcMatchers("/aaa/bbb.html", "/admin/**").access("hasRole('admin')"))
//		.authorizeRequests()
//				.anyRequest().denyAll()
//				.and()
//			.formLogin()
//			.and().httpBasic();
//	}
	
	
	
	/**POUBELLE**/
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("configure HttpSecurity");
//		http
//		.authorizeRequests(authorize -> authorize
//			.antMatchers("/css/**", "/index").permitAll()
//			.antMatchers("/user/**").hasRole("USER")
//		)
//		.formLogin(formLogin -> formLogin
//			.loginPage("/login")
//			.failureUrl("/login-error")
//		);
//	}
	
	
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("configure HttpSecurity");
////		
////	    http
////	        .logout(logout -> logout                                                
////	            .logoutUrl("/logout")                                            
////	            .logoutSuccessUrl("/my/index")                                      
////	            .logoutSuccessHandler(logoutSuccessHandler)                         
////	            .invalidateHttpSession(true)                                        
////	            .addLogoutHandler(logoutHandler)                                    
////	            .deleteCookies(cookieNamesToClear)                                  
////	        );
//			http
//			.authorizeRequests()
//				.anyRequest().authenticated()
//				.and()
//			.formLogin()
//			.and().httpBasic();
////			http.authorizeRequests(authorize -> authorize.authenticated().mvcMatchers("/**/admin*").access("hasRole('admin')"));
//	}
	
	
}
