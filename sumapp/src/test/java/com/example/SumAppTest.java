package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumAppTest {

    @Test
    public void testSumPositiveNumbers() {
        assertEquals(5, SumApp.sum(2, 3));
    }

    @Test
    public void testSumZero() {
        assertEquals(0, SumApp.sum(0, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumNegativeNumber() {
        SumApp.sum(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumBothNegative() {
        SumApp.sum(-2, -3);
    }
}
