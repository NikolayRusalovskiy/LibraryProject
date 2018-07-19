package main.java.controller;

import main.java.service.*;
import main.java.model.Command;

public enum CommandManager {

    addBook {
        @Override
        public Command returnCommand() {
            System.out.println("add book");

            return new AddBookCommand();
        }

    },
    deleteBook{
        @Override
        public Command returnCommand() {
            System.out.println("delete book");
            return new RemoveBookCommand();
        }
    },
    addBCommand{
        @Override
        public Command returnCommand() {
            System.out.println("Add random 5 books");
            return new AddBCommand();
        }
    },
    sortedCommand{
        @Override
        public Command returnCommand() {
            return new SortedCommand();
        }
    },
    showAll{
        @Override
        public Command returnCommand() {
            return new ShowAllCommand();
        }
    },
    exit{
        @Override
        public Command returnCommand() {
            return new ExitSystemCommand();
        }
    };

    public abstract Command returnCommand();


}
