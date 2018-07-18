package main.java.service;

import main.java.dao.BooksDao;
import main.java.model.Book;

import java.util.List;
import java.util.Scanner;

public class LibraryService {

    List<Book> bl = new BooksDao().getBookList();
    Scanner sc = new Scanner(System.in);

    public void printLibrary() {
        for (Book book : bl) {
            System.out.println(book);
        }
    }

    public void addBook() {
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

    public void removeBookByName() {
        System.out.print("Enter Name of Book ->");
        String name = sc.nextLine();
        for (Book book : bl) {
            if (book.getAuthor().equals(name)) {
                System.out.println("DELETE " + book);
                bl.remove(book);
            }
        }
        setBookList(bl);
    }

    public boolean checkToAction() {
        return true;
    }


    public void setBookList(List<Book> bookList) {
        new BooksDao().putBooksToLibrary(bookList);
    }
}
