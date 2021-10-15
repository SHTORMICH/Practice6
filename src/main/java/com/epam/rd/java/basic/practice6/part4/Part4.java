package com.epam.rd.java.basic.practice6.part4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Part4 {
    private static final Logger logger = Logger.getLogger(Part4.class.getName());

    public static void main(String[] args) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        Range range = new Range(3, 10);
        for (Integer el : range) {
            result1.append(el).append(" ");
        }
        logger.log(Level.INFO, result1::toString);

        range = new Range(3, 10, true);
        for (Integer el : range) {
            result2.append(el).append(" ");
        }
        logger.log(Level.INFO, result2::toString);
    }

}
