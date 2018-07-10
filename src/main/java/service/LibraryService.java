package main.java.service;

import main.java.dao.BooksDao;
import main.java.model.Book;

import java.util.List;

public class LibraryService {

    List<Book> bl = new BooksDao().getBookList();

    public void printLibrary() {
        for (Book book : bl) {
            System.out.println(book);
        }
    }


    public boolean addBook() {

        return true;
    }

}
