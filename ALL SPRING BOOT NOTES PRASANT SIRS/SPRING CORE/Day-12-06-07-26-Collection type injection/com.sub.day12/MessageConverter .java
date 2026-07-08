package com.sub.day12;

public class MessageConverter {
	IMessageConveter converter;
	String message;

	public MessageConverter() {
		System.out.println("Message Converter object created");
	}

	public void convert(String message) {
		String result = converter.convertTo(message);

		System.out.println(result);
	}

	public IMessageConveter getConverter() {
		return converter;
	}

	public void setConverter(IMessageConveter converter) {
		System.out.println("setter executed for converter");
		this.converter = converter;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Setter executed for message");
		this.message = message;
	}

	public void init() {
		System.out.println("Init method called");
		this.convert(message);
	}

	public void destroy() {
		System.out.println("Destruction method called");
		converter = null;
		message = null;
	}
}
