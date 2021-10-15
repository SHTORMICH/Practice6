package com.epam.rd.java.basic.practice6.part3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Parking {
    private final int[] arr;
    //private static final Logger logger = Logger.getLogger(Parking.class.getName());

    public Parking(int capacity) {
        arr = new int[capacity];
    }

    public boolean arrive(int k) {
         if (k < 0 || k > arr.length - 1) {
             throw new IllegalArgumentException();
         }
         int start = k;
         while (arr[k] != 0) {
             k = (k + 1) % arr.length;
             if (k == start) {
                 System.out.println(printArr(arr) + ", false");
                 return false;
             }
         }
         arr[k] = 1;
        System.out.println(printArr(arr) + ", true");
         return true;
    }

    public boolean depart(int k) {
        if (k < 0 || k > arr.length - 1) {
            throw new IllegalArgumentException();
        }
        if (arr[k] == 1) {
            arr[k] = 0;
            System.out.println(printArr(arr) + ", true");
            return true;
        }
        System.out.println(printArr(arr) + ", false");
        return false;
    }
    
    public void print() {
        StringBuilder text = new StringBuilder();
        for (int el : arr) {
            text.append(el);
        }
        System.out.println(text);
    }

    public static String printArr(int[] arr) {
        StringBuilder text = new StringBuilder();
        for (int el : arr) {
            text.append(el);
        }
        return text.toString();
    }
}
