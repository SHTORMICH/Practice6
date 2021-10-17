package com.epam.rd.java.basic.practice6.part4;

import org.junit.Assert;
import org.junit.Test;

public class RangeTest {
    @Test
    public void createArrayTest() {
        int[] arrayExpected = new int[]{3, 4, 5, 6, 7, 8, 9, 10};
        Range range = new Range(3, 10);
        Assert.assertArrayEquals(arrayExpected, range.createArray(3, 10, false));
    }

    @Test
    public void reverseArrayTest() {
        int[] arrayExpected = new int[]{10, 9, 8, 7, 6, 5, 4, 3};
        Range range = new Range(3, 10, true);
        Assert.assertArrayEquals(arrayExpected, range.createArray(3, 10, true));
    }
}
