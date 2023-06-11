package com.manish.rest.webservices.restfulwebservices.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	/*
	 * This @Bean annotation indicates that a bean named filterChain is being
	 * defined. It returns a SecurityFilterChain object and accepts an HttpSecurity
	 * object as an argument.
	 * 
	 */
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		/*
		 * This configuration specifies how HTTP requests should be authorized. In this
		 * case, it allows OPTIONS requests (preflight requests) for all paths (/**) and
		 * permits them without authentication. For any other request, authentication is
		 * required.
		 */

		http.authorizeHttpRequests(
				auth -> auth.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest().authenticated());

		/*
		 * httpBasic() method is used to configure Basic Authentication for the
		 * application. Basic Authentication is a simple authentication scheme that uses
		 * a username and password combination.
		 * 
		 * The Customizer.withDefaults() method is a convenience method that provides
		 * default configuration options for Basic Authentication. It sets up the
		 * following:
		 * 
		 * HTTP Basic Authentication: It enables Basic Authentication for the
		 * application.
		 * 
		 * User Interface: It automatically generates a login form or prompt for
		 * username and password when authentication is required. This default behavior
		 * is based on the browser's capabilities.
		 * 
		 * User Details Service: It uses the default UserDetailsService provided by
		 * Spring Security, which is typically configured separately to retrieve user
		 * details and perform authentication.
		 */

		http.httpBasic(Customizer.withDefaults());

		/*
		 * This configuration specifies the session management strategy. In this case,
		 * it sets the session creation policy to STATELESS, which means that the
		 * application will not create an HTTP session.
		 */

		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		/*
		 * This disables CSRF protection. CSRF is a security feature that prevents
		 * unauthorized requests from being made on behalf of a user.
		 */

		http.csrf().disable();

		/*
		 * This returns the built HttpSecurity object.
		 */

		return http.build();

	}

}
