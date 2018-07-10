package main.java.controller;

import main.java.service.LibraryService;

import java.util.Scanner;

public class LibraryController {
    public static void run(){
        boolean endFlag=true;
        LibraryService libraryService =  new LibraryService();
        while (endFlag){
            System.out.println("Menu:\n" +
                    "-addBook\n" +
                    "-deleteBook\n" +
                    "-showBooksBy\n" +
                    "-sortedAndPrintBy\n" +
                    "-showAll\n" +
                    "-exit");
            System.out.print("Write command and press Enter->");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            switch (str){
                case "addBook": libraryService.addBook(); break;
                case"delete": break;
                case"showBooksBy": break;
                case"sortedAndPrintBy": break;
                case"showAll": libraryService.printLibrary();break;
                case"exit": endFlag=false;break;
                default:
                    System.err.println("Incorrect command");

            }

        }

    }
}
