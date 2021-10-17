package com.epam.rd.java.basic.practice6.part2;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Part2Test {
    @Test
    public void testArray_removeByIndex() {
        List<Integer> listExpected = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            listExpected.add(i);
        }
        Assert.assertTrue(Part2.removeByIndex(listExpected, 3) < 10);
    }

    @Test
    public void testLinkedList_removeByIndex() {
        List<Integer> linkedListExpected = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedListExpected.add(i);
        }
        Assert.assertTrue(Part2.removeByIndex(linkedListExpected, 3) < 40);
    }

    @Test
    public void testArray_removeByIterator() {
        List<Integer> listExpected = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            listExpected.add(i);
        }
        Assert.assertTrue(Part2.removeByIterator(listExpected, 3) < 20);
    }

    @Test
    public void testLinkedList_removeByIterator() {
        List<Integer> linkedListExpected = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedListExpected.add(i);
        }
        Assert.assertTrue(Part2.removeByIterator(linkedListExpected, 3) < 10);
    }
}