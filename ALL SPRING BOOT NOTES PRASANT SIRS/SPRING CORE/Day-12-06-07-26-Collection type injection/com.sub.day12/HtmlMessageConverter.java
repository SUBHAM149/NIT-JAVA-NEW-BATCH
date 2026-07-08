package com.sub.day12;

public class HtmlMessageConverter implements IMessageConveter {
	public HtmlMessageConverter() {
	}

	public String convertTo(String message) {
		return "<html>" + message + "</html>";
	}
}
