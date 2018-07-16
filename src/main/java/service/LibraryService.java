package main.java.service;

import main.java.dao.BooksDao;
import main.java.model.Book;

import java.util.List;
import java.util.Scanner;

public class LibraryService {

    List<Book> bl = new BooksDao().getBookList();

    public void printLibrary() {
        for (Book book : bl) {
            System.out.println(book);
        }
    }


    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write Book author->");
        String author = sc.nextLine();
        System.out.print("Write Book name->");
        String name = sc.nextLine();
        System.out.print("Write Publisher Title->");
        String titlePublisher = sc.nextLine();
        System.out.print("Write Publisher creation year->");
        int yearOfCreationPublisher = sc.nextInt();
        System.out.print("Write Publisher city ->");
        String cityPublisher = sc.nextLine();
        System.out.print("Write Book publishing year->");
        int publishingYear = sc.nextInt();
        System.out.print("Write Book pages->");
        int pages = sc.nextInt();
        System.out.print("Write Book genre->");
        String genre = sc.nextLine();

        bl.add(new Book(author, name, titlePublisher, yearOfCreationPublisher, cityPublisher, publishingYear, pages, genre));
    }

}
