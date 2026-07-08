package com.sub.program09;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {

    private List<String> books;

    private Set<String> members;

    private Map<String, Integer> copies;

    public Library() {
        super();
    }

    public Library(List<String> books, Set<String> members, Map<String, Integer> copies) {
        super();
        this.books = books;
        this.members = members;
        this.copies = copies;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Set<String> getMembers() {
        return members;
    }

    public void setMembers(Set<String> members) {
        this.members = members;
    }

    public Map<String, Integer> getCopies() {
        return copies;
    }

    public void setCopies(Map<String, Integer> copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Library [books=" + books + ", members=" + members + ", copies=" + copies + "]";
    }

}
