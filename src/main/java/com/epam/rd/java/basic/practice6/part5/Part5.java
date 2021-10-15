package com.epam.rd.java.basic.practice6.part5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Part5 {
    private static final String SEPARATOR = "~~~~~~~";
    private static final Logger logger = Logger.getLogger(Part5.class.getName());
    
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        logger.log(Level.INFO, () -> tree.add(3) + "");
        logger.log(Level.INFO, () -> tree.add(3) + "");

        logger.log(Level.INFO, SEPARATOR);
        tree.add(new Integer[] { 1, 2, 5, 4, 6, 0 });
        tree.print();

        logger.log(Level.INFO, SEPARATOR);
        logger.log(Level.INFO, () -> tree.remove(5) + "");
        logger.log(Level.INFO, () -> tree.remove(5) + "");

        logger.log(Level.INFO, SEPARATOR);
        tree.print();
    }
    
}
