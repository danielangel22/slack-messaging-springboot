package com.codereview.slackmessagingspringboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.codereview.slackmessagingspringboot.dto.SlackMessage;

@Component
public class SlackComponent {

	@Value("${slack.bot.token}")
	private String slackWebhookUrl;

	public String sendMessageNative(SlackMessage message) {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<SlackMessage> request = new HttpEntity<>(message, headers);

		return restTemplate.postForObject(slackWebhookUrl, request, String.class);
	}

}
