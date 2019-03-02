package com.tz4cloud.tz.monitor.config;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

/**
 * WebSecurityConfigurer
 *
 * @author lishangbu
 * @date 2019/2/1
 */
@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
	private final String adminContextPath;

	public WebSecurityConfigurer(AdminServerProperties adminServerProperties) {
		this.adminContextPath = adminServerProperties.getContextPath();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
		successHandler.setTargetUrlParameter("redirectTo");
		successHandler.setDefaultTargetUrl(adminContextPath + "/");

		http
			.headers().frameOptions().disable()
			.and().authorizeRequests()
			.antMatchers(adminContextPath + "/assets/**"
				, adminContextPath + "/login"
				, adminContextPath + "/actuator/**"
			).permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin().loginPage(adminContextPath + "/login")
			.successHandler(successHandler).and()
			.logout().logoutUrl(adminContextPath + "/logout")
			.and()
			.httpBasic().and()
			.csrf()
			.disable();
		// @formatter:on
	}
}
