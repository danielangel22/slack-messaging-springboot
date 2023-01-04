package com.codereview.slackmessagingspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codereview.slackmessagingspringboot.dto.SlackMessage;
import com.codereview.slackmessagingspringboot.service.SlackComponent;

@RestController
public class SlackController {

	@Autowired
	private SlackComponent slackComponent;

	@PostMapping("/send")
	public ResponseEntity<String> sendMesssage(@RequestBody SlackMessage slackRequest) {
		return ResponseEntity.ok(slackComponent.sendMessageNative(slackRequest));
	}

}