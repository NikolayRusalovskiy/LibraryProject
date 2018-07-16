package main.java.controller;

import main.java.model.Command;
import main.java.service.LibraryService;

import java.util.Scanner;

public class LibraryController {
//    public void setLineHandller(LineHandller lineHandller) {
//        this.lineHandller = lineHandller;
//    }
//
//    public LibraryController(LineHandller lineHandller) {
//        this.lineHandller = lineHandller;
//    }
//
//    private LineHandller lineHandller;

    public void run() {
        boolean endFlag = true;
        LibraryService libraryService = new LibraryService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Start");
        while (sc.hasNext() && endFlag) {
            System.out.println("Menu:\n" +
                    "-addBook\n" +
                    "-deleteBook\n" +
                    "-showBooksBy\n" +
                    "-sortedAndPrintBy\n" +
                    "-showAll\n" +
                    "-exit");
            System.out.print("Write command and press Enter->");

            String str = sc.nextLine();
            CommandManager commandManager =  CommandManager.valueOf(str);
            if (commandManager != null){
                Command com = commandManager.execute();
                System.out.println("=======---------->>>>>>>>>>>>>>");
                com.execute();
            }
//            switch (str) {
//                case "addBook":
//                    libraryService.addBook();
//                    break;
//                case "delete":
//                    break;
//                case "showBooksBy":
//                    break;
//                case "sortedAndPrintBy":
//                    break;
//                case "showAll":
//                    libraryService.printLibrary();
//                    break;
//                case "exit":
//                    endFlag = false;
//                    break;
//                default:
//                    System.err.println("Incorrect command");
//
//            }
        }


    }

}

