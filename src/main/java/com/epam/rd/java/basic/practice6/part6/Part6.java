package com.epam.rd.java.basic.practice6.part6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Part6 {
    private static final Logger logger = Logger.getLogger(Part6.class.getName());

    public static void main(String[] args) {
        new Part6().inputFromConsole(args[0], args[1], args[2], args[3]);

    }
    private boolean inputFromConsole(String input, String fileName, String task, String operation) {
        if (!("--input".equals(input) || ("-i".equals(input)))) {
            logger.warning("Wrong input");
        }
        if (!("--task".equals(task) || ("-t".equals(task)))) {
            logger.warning("Wrong task");
        }
        switch (operation) {
            case "frequency":
                Part61 frequency = new Part61(fileName);
                logger.log(Level.INFO, () -> frequency + "");
                break;
            case "length":
                Part62 length = new Part62(fileName);
                logger.log(Level.INFO, () -> length + "");
                break;
            case "duplicates":
                Part63 duplicates = new Part63(fileName);
                logger.log(Level.INFO, () -> duplicates + "");
                break;
            default:
                logger.warning("Wrong method!");
                return false;
        }
        return true;
    }
    
}
