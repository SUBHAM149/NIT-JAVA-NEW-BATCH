package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Library {

	@Value("Central Library")
	private String libraryName;

	@Value("Bhubaneswar")
	private String address;

	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", address=" + address + "]";
	}
}
