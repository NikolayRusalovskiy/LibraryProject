import main.java.dao.BooksDao;
import main.java.model.Book;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean endFlag=true;
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
        case "addBook": break;
        case"delete": break;
        case"showBooksBy": break;
        case"sortedAndPrintBy": break;
        case"showAll": break;
        case"exit": endFlag=false;break;
        default:
            System.err.println("Incorrect command");

    }

}

          List<Book> bl = new BooksDao().getBookList();
          for (Book book:bl
             ) {
            System.out.println(book);
        }
    }
}
