package main.java.dao;

import main.java.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BooksDao {
    private List<Book> bookList= new ArrayList<>();


    public List<Book> getLibraryList() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Books.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Books.txt"))
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

    public void putBooksToLibrary(List<Book> bookList){
        try (ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("src/Books.txt"))
            )
        {
            oos.writeObject(bookList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Book> getBookList(){
        try (
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Books.txt"))
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



