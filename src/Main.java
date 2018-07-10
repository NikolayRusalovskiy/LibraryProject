import main.java.dao.BooksDao;
import main.java.model.Book;
import main.java.service.LibraryService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean endFlag=true;
        LibraryService libraryService =  new LibraryService();
while (endFlag){
    System.out.println("Menu:\n" +
            "-addBook\n" +
            "-deleteBook\n" +
            "-showBooksBy\n" +
            "-sortedAndPrintBy\n" +
            "-showAll");
    System.out.print("Write command and press Enter->");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    switch (str){
        case "addBook": libraryService.addBook(); break;
        case"delete": break;
        case"showBooksBy": break;
        case"sortedAndPrintBy": break;
        case"showAll": break;
        case"exit": endFlag=false;break;
        default:
            System.err.println("Incorrect command");

    }

}
        System.out.println("----------");
          List<Book> bl = new BooksDao().getBookList();
          for (Book book:bl
             ) {
            System.out.println(book);
        }
    }
}
