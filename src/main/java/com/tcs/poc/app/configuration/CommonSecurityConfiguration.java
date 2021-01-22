package com.tcs.poc.app.configuration;

import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonSecurityConfiguration {
	@Bean
	public PrincipalExtractor bankPrincipalExtractor() {
		return new BankPrincipalExtractor();
	}

	@Bean
	public AuthoritiesExtractor bankAuthoritiesExtractor() {
		return new BankAuthoritiesExtractor();
	}
}
