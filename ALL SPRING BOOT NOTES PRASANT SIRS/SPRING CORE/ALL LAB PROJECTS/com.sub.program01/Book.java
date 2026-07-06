package com.sub.program01;

public class Book {

    private String title;
    private int price;
    private int pages;

    // Default Constructor
    public Book() {
        System.out.println("Book Object Created");
    }

    // Getter & Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("Book title setter called");
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Book price setter called");
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        System.out.println("Book pages setter called");
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [title=" + title +
                ", price=" + price +
                ", pages=" + pages + "]";
    }

}
