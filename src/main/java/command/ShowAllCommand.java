package main.java.command;

import main.java.service.LibraryService;

public class ShowAllCommand implements Command {
    @Override
    public void execute() {
        new LibraryService().printLibrary();
    }
}
