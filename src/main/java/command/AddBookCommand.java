package main.java.command;

import main.java.service.LibraryService;

public class AddBookCommand implements Command {
    public AddBookCommand() {
        System.out.println("Init AddBook!");
    }

    @Override
    public void execute() {
        new LibraryService().addBook();
        System.out.println("Complete returnCommand add Book!");
    }
}
