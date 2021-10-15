package com.epam.rd.java.basic.practice6.part4;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Range implements Iterable<Integer>{
    private int[] arr;
    private int index = 0;

    public Range(int n, int m) {
        this(n, m, false);
        arr = new int[m - n + 1];
        int j = 0;
        for (int i = n; i < m + 1; i++) {
            arr[j++] = i;
        }
    }

    public Range(int firstBound, int secBound, boolean reversedOrder) {
        arr = new int[secBound - firstBound + 1];
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = firstBound; i < secBound + 1; i++) {
            arr[j++] = i;
        }
        if (reversedOrder == true) {
            arr2 = IntStream.range(0, arr.length).map(i -> arr[arr.length - i - 1]).toArray();
        }
        arr = arr2;
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new IteratorImpl();
    }
    
    private final class IteratorImpl implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return index < arr.length;
        }

        @Override
        public Integer next() {
            return arr[index++];
        }
        
    }

}
