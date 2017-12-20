package io.pivotal.spring.cloud.service.config;

import org.springframework.web.client.RestTemplate;

public class ConfigClientRestTemplateHolder {
	private final RestTemplate restTemplate;

	public ConfigClientRestTemplateHolder(final RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}
}
