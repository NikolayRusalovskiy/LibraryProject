package main.java.service;

import main.java.model.Command;

public class RemoveBookCommand implements Command {
    @Override
    public void execute() {
        new LibraryService().removeBookByName();

    }
}
