package main.java.service;

import main.java.model.Command;

public class ExitSystemCommand implements Command {
    @Override
    public void execute() {
System.exit(1);
    }
}
