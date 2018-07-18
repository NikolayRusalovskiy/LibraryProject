package main.java.controller;

import main.java.service.*;
import main.java.model.Command;

public enum CommandManager {

    addBook {
        @Override
        public Command execute() {
            System.out.println("add book");

            return new AddBookCommand();
        }

    },
    deleteBook{
        @Override
        public Command execute() {
            System.out.println("delete book");
            return new RemoveBookCommand();
        }
    },
    showAll{
        @Override
        public Command execute() {
            return new ShowAllCommand();
        }
    },
    exit{
        @Override
        public Command execute() {
            return new ExitSystemCommand();
        }
    };

    public abstract Command execute();


}
