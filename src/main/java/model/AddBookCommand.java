package main.java.model;

public class AddBookCommand implements Command {
    public AddBookCommand() {
        System.out.println("Init AddBook!");
    }

    @Override
    public void execute() {
        System.out.println("Complete execute add Book!");
    }
}
