package com.sub.day12;

public class PDFMessageConverter implements IMessageConveter {
	public PDFMessageConverter() {
	}

	public String convertTo(String message) {
		return "<pdf>" + message + "</pdf>";
	}
}
