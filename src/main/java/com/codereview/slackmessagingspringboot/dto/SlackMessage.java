package com.codereview.slackmessagingspringboot.dto;

import java.io.Serializable;

public class SlackMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username; // usuario directo al que enviaras el mensaje
	private String text; // mensaje
	private String icon_emoji; // icono parametrizable del boot slack
	private String channel; // channel a enviar el message

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIcon_emoji() {
		return icon_emoji;
	}

	public void setIcon_emoji(String icon_emoji) {
		this.icon_emoji = icon_emoji;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SlackMessage [username=");
		builder.append(username);
		builder.append(", text=");
		builder.append(text);
		builder.append(", icon_emoji=");
		builder.append(icon_emoji);
		builder.append(", channel=");
		builder.append(channel);
		builder.append("]");
		return builder.toString();
	}

}
