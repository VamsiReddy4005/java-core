package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class D10P08 {

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

    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(5, 3);
        assertEquals(15, result); 
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int result = calculator.div(10, 2);
        assertEquals(5, result); 
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        Calculator calculator = new Calculator();
        calculator.div(10, 0); 
    }
}

