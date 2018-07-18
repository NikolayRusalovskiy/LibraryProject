package main.java.service;

import main.java.model.Command;

public class ShowAllCommand implements Command {
    @Override
    public void execute() {
        new LibraryService().printLibrary();
    }
}
