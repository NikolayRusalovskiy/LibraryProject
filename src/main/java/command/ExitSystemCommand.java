package main.java.command;

public class ExitSystemCommand implements Command {
    @Override
    public void execute() {
System.exit(0);
    }
}
