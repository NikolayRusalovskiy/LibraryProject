package main.java.controller;

import main.java.service.AddBookCommand;
import main.java.model.Command;
import main.java.service.LibraryService;
import main.java.service.RemoveBookCommand;
import main.java.service.ShowAllCommand;

public enum CommandManager {

    addBook {
        @Override
        public Command execute() {
            System.out.println("add book");

            return new AddBookCommand();
        }

    },
    deleteBook{
        @Override
        public Command execute() {
            System.out.println("delete book");
            return new RemoveBookCommand();
        }
    },
    showAll{
        @Override
        public Command execute() {
            return new ShowAllCommand();
        }
    };

    public abstract Command execute();

    public void init() {
        System.out.println("Menu:\n" +
                "-addBook\n" +
                "-deleteBook\n" +
                "-showBooksBy\n" +
                "-sortedAndPrintBy\n" +
                "-showAll\n" +
                "-exit");
    }
}
