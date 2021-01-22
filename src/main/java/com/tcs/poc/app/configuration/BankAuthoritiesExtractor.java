package com.tcs.poc.app.configuration;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class BankAuthoritiesExtractor implements AuthoritiesExtractor {

	@Override
	public List<GrantedAuthority> extractAuthorities(Map<String, Object> map) {
		List<LinkedHashMap<String, String>> autorityList = (List<LinkedHashMap<String, String>>) map.get("authorities");
		String role = "ROLE_USER";
		if (autorityList != null && !autorityList.isEmpty()) {
			LinkedHashMap<String, String> roleMap = autorityList.get(0);
			role = roleMap.get("authority");

		}
		GrantedAuthority authority = new SimpleGrantedAuthority(role);

		return Arrays.asList(authority);
	}

}
