package com.tcs.poc.app.configuration;

import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

public class BankPrincipalExtractor implements PrincipalExtractor{

	@Override
	public Object extractPrincipal(Map<String, Object> map) {
		
		return map.get("username");
	}

}
