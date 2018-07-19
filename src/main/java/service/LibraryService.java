package main.java.service;

import main.java.dao.BooksDao;
import main.java.model.Book;

import java.util.Comparator;
import java.util.Iterator;
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

    public void addRandomBook(int numberLoop) {
        for (int i = 0; i <= numberLoop; i++) {
            bl.add(new Book("" + i, "Шевченко" + i, "Проминь" + i, 1980 + i, "Киев" + i, 2000 + i, 200 + 10 * i, "Драма" + i));
        }
        new BooksDao().putBooksToLibrary(bl);
    }

    public void removeBookByName() {
        System.out.print("Enter Author of Book ->");
        String name = sc.nextLine();


        Iterator<Book> iterator = bl.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equals(name)) {
                System.out.println("DELETE " + book);
                bl.remove(book);
            }
        }

        setBookList(bl);
    }

    public void sort() {
        String sortBy ;
        System.out.print("Choose your sort BY author, titlePublisher, genre->");
        sortBy = sc.nextLine();
        switch (sortBy) {
            case "author":
                sortedByAuthor();
                break;
            case "titlePublisher":
                sortedByTitlePublisher();
                break;
            case "genre":
                sortedByGenre();
                break;
            default:
                System.out.println("Printed Library as IS ");
        }
        printLibrary();
        System.out.println("Complete sort By " + sortBy);
    }

    public void sortedByAuthor() {
        bl.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
    }

    public void sortedByTitlePublisher() {
        bl.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitlePublisher().compareTo(o2.getTitlePublisher());
            }
        });
    }

    public void sortedByGenre() {
        bl.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getGenre().compareTo(o2.getGenre());
            }
        });
    }

    public void setBookList(List<Book> bookList) {
        new BooksDao().putBooksToLibrary(bookList);
    }
}
