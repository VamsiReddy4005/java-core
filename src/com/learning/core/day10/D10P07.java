package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class D10P07 {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result); 
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(5, 3);
        assertEquals(2, result); 
    }
}



