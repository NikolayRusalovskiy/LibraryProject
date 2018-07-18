package main.java.model;

import main.java.controller.CommandManager;
import main.java.controller.LibraryController;

public class HomeManager implements Command {
private final LibraryController  libraryController;

    public HomeManager(LibraryController libraryController) {
        this.libraryController = libraryController;
    }
public void init(){

}
    @Override
    public void execute(String command) {
        if (command != null&& CommandManager.valueOf(command)!= null){
            init();
            libraryController.setCommand( CommandManager.valueOf(command).execute());
        }else System.out.println("Unexpected command!");

    }
}
