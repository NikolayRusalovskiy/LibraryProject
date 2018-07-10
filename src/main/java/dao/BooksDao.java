package main.java.dao;

import main.java.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BooksDao {
    private List<Book> bookList= new ArrayList<>();


    public List<Book> getLibraryList() {
        Book book = new Book("Шевченко", "Кобзар", "Проминь", 1990,"Киев", 2001, 343, "Поезия");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\NRusalovskiy\\Auto\\LibraryProject\\src\\Books.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\NRusalovskiy\\Auto\\LibraryProject\\src\\Books.txt"))
            )
        {
            oos.writeObject(bookList);
            ArrayList<Book> ss = (ArrayList)ois.readObject();
            System.out.println(ss);

        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return bookList;
    }

    public void putBooksToLibrary(){
        try (ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("D:\\NRusalovskiy\\Auto\\LibraryProject\\src\\Books.txt"))
            )
        {
            oos.writeObject(bookList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Book> getBookList(){
        try (
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\NRusalovskiy\\Auto\\LibraryProject\\src\\Books.txt"))
        )
        {
            ArrayList<Book> ss = (ArrayList)ois.readObject();
            bookList=ss;

        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return bookList;
    }




}



