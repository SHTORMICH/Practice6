package com.epam.rd.java.basic.practice6.part2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Part2Test {
    @Test
    public void testArray_removeByIndex() {
        List<Integer> listActual = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            listActual.add(i);
        }
        Assert.assertTrue(Part2.removeByIndex(listActual, 3) > 10);
    }

    @Test
    public void testLinkedList_removeByIndex() {
        List<Integer> linkedListActual = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedListActual.add(i);
        }
        Assert.assertTrue(Part2.removeByIndex(linkedListActual, 3) > 30);
    }

    @Test
    public void testArray_removeByIterator() {
        List<Integer> listActual = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            listActual.add(i);
        }
        Assert.assertTrue(Part2.removeByIterator(listActual, 3) < 10);
    }

    @Test
    public void testLinkedList_removeByIterator() {
        List<Integer> linkedListActual = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedListActual.add(i);
        }
        Assert.assertTrue(Part2.removeByIterator(linkedListActual, 3) < 10);
    }
}