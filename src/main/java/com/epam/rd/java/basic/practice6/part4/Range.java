package com.epam.rd.java.basic.practice6.part4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Range implements Iterable<Integer>{
    private int[] arr;
    private int index = 0;

    public Range(int n, int m) {
        this(n, m, false);
        arr = createArray(n, m, false);
    }

    public Range(int firstBound, int secBound, boolean reversedOrder) {
        arr = createArray(firstBound, secBound, reversedOrder);
    }

    public int[] createArray(int n, int m, boolean reversedOrder) {
        int[] array = new int[m - n + 1];
        int j = 0;
        for (int i = n; i < m + 1; i++) {
            array[j++] = i;
        }
        if (reversedOrder) {
            return reverseArray(array);
        }
        return array;
    }

    private int[] reverseArray(int[] arr) {
        return IntStream.range(0, arr.length).map(i -> arr[arr.length - i - 1]).toArray();
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
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return arr[index++];
        }
    }
}
