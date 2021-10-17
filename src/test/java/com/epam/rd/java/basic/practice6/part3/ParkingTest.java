package com.epam.rd.java.basic.practice6.part3;

import org.junit.Assert;
import org.junit.Test;

public class ParkingTest {
    @Test
    public void arriveTest_Ok() {
        Parking parking = new Parking(4);
        Assert.assertTrue(parking.arrive(1));
    }

    @Test
    public void arriveTest_NotOk() {
        Parking parking = new Parking(4);
        parking.arrive(1);
        parking.arrive(1);
        parking.arrive(1);
        parking.arrive(1);
        Assert.assertFalse(parking.arrive(1));
    }

    @Test
    public void departTest_Ok() {
        Parking parking = new Parking(4);
        parking.arrive(1);
        parking.arrive(1);
        parking.arrive(1);
        parking.arrive(1);
        Assert.assertTrue(parking.depart(1));
    }

    @Test
    public void departTest_NotOk() {
        Parking parking = new Parking(4);
        parking.arrive(2);
        parking.arrive(3);
        parking.arrive(0);
        Assert.assertFalse(parking.depart(1));
    }
}