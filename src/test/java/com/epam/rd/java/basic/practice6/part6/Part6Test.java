package com.epam.rd.java.basic.practice6.part6;

import org.junit.Assert;
import org.junit.Test;

public class Part6Test {
    @Test
    public void inputFromConsole_inputNotOk() {
        Part6 part6 = new Part6();
        Assert.assertFalse(part6.inputFromConsole("-inputs", "part6.txt", "-t", "frequency"));
    }

    @Test
    public void inputFromConsole_taskNotOk() {
        Part6 part6 = new Part6();
        Assert.assertFalse(part6.inputFromConsole("-i", "part6.txt", "--tasks", "frequency"));
    }

    @Test
    public void inputFromConsole_frequencyNotOk() {
        Part6 part6 = new Part6();
        Assert.assertFalse(part6.inputFromConsole("-i", "part6.txt", "-t", "frequencys"));
    }

    @Test
    public void inputFromConsole_lengthNotOk() {
        Part6 part6 = new Part6();
        Assert.assertFalse(part6.inputFromConsole("-i", "part6.txt", "-t", "lengths"));
    }

    @Test
    public void inputFromConsole_duplicatesNotOk() {
        Part6 part6 = new Part6();
        Assert.assertFalse(part6.inputFromConsole("-i", "part6.txt", "-t", "duplicateses"));
    }

    @Test
    public void inputFromConsole_frequencyOk() {
        Part6 part6 = new Part6();
        Assert.assertTrue(part6.inputFromConsole("-i", "part6.txt", "-t", "frequency"));
    }

    @Test
    public void inputFromConsole_lengthOk() {
        Part6 part6 = new Part6();
        Assert.assertTrue(part6.inputFromConsole("-i", "part6.txt", "-t", "length"));
    }

    @Test
    public void inputFromConsole_duplicatesOk() {
        Part6 part6 = new Part6();
        Assert.assertTrue(part6.inputFromConsole("-i", "part6.txt", "-t", "duplicates"));
    }
}
