package main.java.service;

import main.java.model.Command;

public class SortedCommand implements Command{
    @Override
    public void execute() {
        new LibraryService().sort();
    }
}
