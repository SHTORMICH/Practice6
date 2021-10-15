package com.epam.rd.java.basic.practice6.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Part2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int k = 4;

        for (int i = 0; i < 10000; i++) {
            list.add(i);
            linkedList.add(i);
        }

        long startTime = System.currentTimeMillis();
        removeByIndex(list, k);
        long endTime = System.currentTimeMillis() - startTime;

        System.out.println("ArrayList#Index: " + endTime + " ms");

        long startTimeL = System.currentTimeMillis();
        removeByIndex(linkedList, k);
        long endTimeL = System.currentTimeMillis() - startTimeL;

        System.out.println("LinkedList#Index: " + endTimeL + " ms");

        long startTimeI = System.currentTimeMillis();
        removeByIterator(list, k);
        long endTimeI = System.currentTimeMillis() - startTimeI;

        System.out.println("ArrayList#Iterator: " + endTimeI + " ms");

        long startTimeLI = System.currentTimeMillis();
        removeByIterator(linkedList, k);
        long endTimeLI = System.currentTimeMillis() - startTimeLI;

        System.out.println("LinkedList#Iterator " + endTimeLI + " ms");
    }

    public static long removeByIndex(final List<Integer> list, final int k) {
        int index = 0;
        while (list.size() != 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    public static long removeByIterator(final List<Integer> list, int k) {
        Iterator<Integer> iterator = list.iterator();
        int counter = 0;
        while (list.size() != 1) {
            if (iterator.hasNext()) {
                iterator.next();
                counter++;
                if (counter == k) {
                    iterator.remove();
                    counter = 0;
                }
            } else {
                iterator = list.iterator();
            }
        }
        return list.get(0);
    }
}
