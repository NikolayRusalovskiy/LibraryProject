package main.java.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import main.java.model.Command;
import main.java.model.HomeManager;
import main.java.service.LibraryService;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryController {

    private Command command;
    private HomeManager homeManager;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public LibraryController() {

        HomeManager homeManager = new HomeManager(this);
        this.homeManager = homeManager;
        this.command = homeManager;
    }

    public void run() {
        boolean endFlag = true;
        LibraryService libraryService = new LibraryService();

        Scanner sc = new Scanner(System.in);
        System.out.println("Start Menu");
        System.out.println(Arrays.toString(CommandManager.values()));

        while (sc.hasNext() && endFlag) {

            System.out.print("Write command and press Enter->");

            String str = sc.nextLine();
            CommandManager commandManager = CommandManager.valueOf(str);

            if (str.equals("home") && homeManager != command) {
                homeManager.execute(str);
            } else command.execute(str);

            if (commandManager != null) {
                Command com = commandManager.execute();
                System.out.println("=======---------->>>>>>>>>>>>>>");
                com.execute(str);
            }
        }


    }

}

