package com.codereview.slackmessagingspringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codereview.slackmessagingspringboot.dto.SlackMessage;
import com.codereview.slackmessagingspringboot.service.SlackComponent;

@SpringBootTest
class SlackMessagingSpringbootApplicationTests {

	@Autowired
	private SlackComponent slackUtils;

	@Test
	void testSendMessage() {
		var message = "Hola mundo desde junit :heart: :smile:";
		SlackMessage slackMessage = new SlackMessage();
		slackMessage.setText(message);
		slackMessage.setChannel("varios");
		// slackMessage.setIcon_emoji(":smiley:");
		var response = slackUtils.sendMessageNative(slackMessage);
		assertEquals("ok", response);
	}

}
