package main.java.controller;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryController {


    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Start Menu");
        System.out.println(Arrays.toString(CommandManager.values()));

        while (true) {
            System.out.print("Write command and press Enter->");
            String str = sc.nextLine();
            CommandManager commandManager = null;
            try {
                commandManager = CommandManager.valueOf(str);
                commandManager.returnCommand().execute();

            } catch (IllegalArgumentException e) {
                System.out.println("Try Another Command");
            }
        }
    }
}

