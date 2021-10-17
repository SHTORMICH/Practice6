package com.epam.rd.java.basic.practice6.part3;

public class Parking {
    private final int[] arr;

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
                 return false;
             }
         }
         arr[k] = 1;
         return true;
    }

    public boolean depart(int k) {
        if (k < 0 || k > arr.length - 1) {
            throw new IllegalArgumentException();
        }
        if (arr[k] == 1) {
            arr[k] = 0;
            return true;
        }
        return false;
    }
    
    public void print() {
        StringBuilder text = new StringBuilder();
        for (int el : arr) {
            text.append(el);
        }
        System.out.println(text);
    }
}
