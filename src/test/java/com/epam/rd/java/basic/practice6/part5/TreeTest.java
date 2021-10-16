package com.epam.rd.java.basic.practice6.part5;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
    @Test
    public void testAddWithOneValue() {
        Tree<Integer> tree = new Tree<>();
        Assert.assertTrue(tree.add(1));
    }

    @Test
    public void testAddWithArray() {
        Tree<Integer> tree = new Tree<>();
        Assert.assertFalse(tree.remove(1));
    }


}
