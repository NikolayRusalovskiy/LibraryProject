package main.java.command;

import main.java.service.LibraryService;

public class RemoveBookCommand implements Command {
    @Override
    public void execute() {
        new LibraryService().removeBookByName();

    }
}
