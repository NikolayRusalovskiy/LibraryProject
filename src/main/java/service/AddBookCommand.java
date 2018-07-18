package main.java.service;

import main.java.model.Command;
import main.java.service.LibraryService;

public class AddBookCommand implements Command {
    public AddBookCommand() {
        System.out.println("Init AddBook!");
    }

    @Override
    public void execute(String command) {
        new LibraryService().addBook();
        System.out.println("Complete execute add Book!");
    }
}
