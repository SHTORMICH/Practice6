package com.epam.rd.java.basic.practice6.part6;

public class Part6 {
    

    public static void main(String[] args) {

        if (args[2].equals("frequency")) {
            Part61 frequency = new Part61(args[1]);
            System.out.println(frequency);
        } else if (args[2].equals("length")) {
            Part62 length = new Part62(args[1]);
            System.out.println(length);
        } else if (args[2].equals("duplicates")) {
            Part63 duplicates = new Part63(args[1]);
            System.out.println(duplicates);
        }
    }
    
}
