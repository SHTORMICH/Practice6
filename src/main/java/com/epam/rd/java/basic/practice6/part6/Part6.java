package com.epam.rd.java.basic.practice6.part6;

import java.util.Scanner;

public class Part6 {

    public static void main(String[] args) {
        StringBuilder input = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        input.append(command).append(" ");
        for (int i = 0; i < 3; i++) {
            command = scanner.nextLine();
            input.append(command).append(" ");
        }
        String[] text = input.toString().split(" ");
        new Part6().inputFromConsole(text[0], new String[]{text[1]}, text[2], text[3]);

    }

    private boolean inputFromConsole(String input, String[] fileName, String task, String operation) {
        if (!("--input".equals(input) || ("-i".equals(input)))) {
            System.err.println("Wrong input");
            return false;
        }
        if (!("--task".equals(task) || ("-t".equals(task)))) {
            System.err.println("Wrong task");
            return false;
        }
        switch (operation) {
            case "frequency":
                Part61.main(fileName);
                break;
            case "length":
                Part62.main(fileName);
                break;
            case "duplicates":
                Part63.main(fileName);
                break;
            default:
                System.err.println("Wrong method!");
                return false;
        }
        return true;
    }
}
