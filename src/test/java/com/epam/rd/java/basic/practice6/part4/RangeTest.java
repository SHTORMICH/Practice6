package com.epam.rd.java.basic.practice6.part4;

import org.junit.Assert;
import org.junit.Test;

public class RangeTest {
    @Test
    public void createArrayTest() {
        int[] arrayActual = new int[]{3, 4, 5, 6, 7, 8, 9, 10};
        Range range = new Range(3, 10);
        Assert.assertArrayEquals(range.createArray(3, 10, false), arrayActual);
    }

    @Test
    public void reverseArrayTest() {
        int[] arrayActual = new int[]{10, 9, 8, 7, 6, 5, 4, 3};
        Range range = new Range(3, 10, true);
        Assert.assertArrayEquals(range.createArray(3, 10, true), arrayActual);
    }
}
