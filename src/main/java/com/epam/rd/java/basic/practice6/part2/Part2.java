package com.epam.rd.java.basic.practice6.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Part2 {
    private List<Integer> list;
    private List<Integer> linkedList;
    private static final int SIZE_LIST = 10000;
    private static final Logger logger = Logger.getLogger(Part2.class.getName());

    public List<Integer> getLinkedList() {
        linkedList = new LinkedList<>();
        for (int i = 0; i < SIZE_LIST; i++) {
            linkedList.add(i);
        }
        return new LinkedList<>(linkedList);
    }

    public void setLinkedList() {
        this.linkedList = new LinkedList<>();
    }

    public List<Integer> getList() {
        list = new LinkedList<>();
        for (int i = 0; i < SIZE_LIST; i++) {
            list.add(i);
        }
        return new LinkedList<>(list);
    }

    public void setList() {
        this.list = new ArrayList<>();
    }

    public static void main(String[] args) {
        Part2 part2 = new Part2();
        int k = 4;

        logger.log(Level.INFO,() -> "ArrayList#Index: " + removeByIndex(part2.getList(), k) + " ms");

        logger.log(Level.INFO,() -> "LinkedList#Index: " + removeByIndex(part2.getLinkedList(), k) + " ms");

        logger.log(Level.INFO,() -> "ArrayList#Iterator: " + removeByIterator(part2.getList(), k) + " ms");

        logger.log(Level.INFO,() -> "LinkedList#Iterator: " + removeByIterator(part2.getLinkedList(), k) + " ms");
    }

    public static long removeByIndex(final List<Integer> list, final int k) {
        long startTime = System.currentTimeMillis();
        int index = 0;
        while (list.size() != 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long removeByIterator(final List<Integer> list, int k) {
        long startTime = System.currentTimeMillis();
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
        return System.currentTimeMillis() - startTime;
    }
}
