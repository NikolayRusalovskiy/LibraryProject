package main.java.command;

import main.java.service.LibraryService;

public class SortedCommand implements Command{
    @Override
    public void execute() {
        new LibraryService().sort();
    }
}
