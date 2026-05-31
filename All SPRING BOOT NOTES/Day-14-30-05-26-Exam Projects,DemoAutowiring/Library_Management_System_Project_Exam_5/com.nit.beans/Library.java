package com.nit.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
	private int libraryId;
	private String libraryName;
	private String address;

	private Librarian librarian;
	private List<String> books;
	private Set<String> categories;
	private Map<String, Integer> categoryCount;

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public void setCategories(Set<String> categories) {
		this.categories = categories;
	}

	public void setCategoryCount(Map<String, Integer> categoryCount) {
		this.categoryCount = categoryCount;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", address=" + address
				+ ", librarian=" + librarian + ", books=" + books + ", categories=" + categories + ", categoryCount="
				+ categoryCount + "]";
	}
}
