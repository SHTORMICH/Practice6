package com.epam.rd.java.basic.practice6.part6;

public class Part6 {
    //private static final Logger logger = Logger.getLogger(Part6.class.getName());

    public static void main(String[] args) {
        new Part6().inputFromConsole(args[0], args[1], args[2], args[3]);

    }
    private boolean inputFromConsole(String input, String fileName, String task, String operation) {
        if (!("--input".equals(input) || ("-i".equals(input)))) {
            System.err.println("Wrong input");
        }
        if (!("--task".equals(task) || ("-t".equals(task)))) {
            System.err.println("Wrong task");
        }
        switch (operation) {
            case "frequency":
                new Part61(fileName);
                break;
            case "length":
                new Part62(fileName);
                break;
            case "duplicates":
                new Part63(fileName);
                break;
            default:
                System.err.println("Wrong method!");
                return false;
        }
        return true;
    }
    
}
