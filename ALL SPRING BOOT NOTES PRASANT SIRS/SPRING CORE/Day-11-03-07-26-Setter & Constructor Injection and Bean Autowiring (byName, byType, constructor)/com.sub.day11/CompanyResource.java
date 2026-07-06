package com.sub.day11;

import java.util.Properties;

public class CompanyResource {
	private Properties database;

	public CompanyResource() {
// default constructor
	}

	public CompanyResource(Properties database) {
		super();
		this.database = database;
	}

	public Properties getDatabase() {
		return database;
	}

	public void setDatabase(Properties database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "CompanyResource [database=" + database + "]";
	}
}
