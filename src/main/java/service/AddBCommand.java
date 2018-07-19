package main.java.service;


import main.java.model.Command;

public class AddBCommand implements Command {
    @Override
    public void execute() {
        new LibraryService().addRandomBook(5);
        System.out.println("Complete returnCommand add Book!");

    }
}
