package main.java.service;

import main.java.model.Command;

public class ShowAllCommand implements Command {
    @Override
    public void execute(String command) {
        new LibraryService().printLibrary();
    }
}
