package main.java.model;

import java.util.List;

public class Library {
    private List<Book> books[];

    public List<Book>[] getBooks() {
        return books;
    }

    public void setBooks(List<Book>[] books) {
        this.books = books;
    }
}
