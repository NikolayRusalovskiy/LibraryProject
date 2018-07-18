package main.java.controller;

import main.java.service.LibraryService;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryController {


    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Start Menu");
        System.out.println(Arrays.toString(CommandManager.values()));

        while (sc.hasNext()) {
            System.out.print("Write command and press Enter->");
            String str = sc.nextLine();
            CommandManager commandManager = CommandManager.valueOf(str);
            commandManager.execute();
        }
    }
}

