package main.java.controller;

import main.java.model.AddBookCommand;
import main.java.model.Command;

public enum CommandManager {

    addBook {
        @Override
        public Command execute() {
            System.out.println("add book");

            return new AddBookCommand();
        }

    };

    public abstract Command execute();
}
