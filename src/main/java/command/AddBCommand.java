package main.java.command;


import main.java.service.LibraryService;

public class AddBCommand implements Command {
    @Override
    public void execute() {
        new LibraryService().addRandomBook(5);
        System.out.println("Complete returnCommand add Book!");

    }
}
