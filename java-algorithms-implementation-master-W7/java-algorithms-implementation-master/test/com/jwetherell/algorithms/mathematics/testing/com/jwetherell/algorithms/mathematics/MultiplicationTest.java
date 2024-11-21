package com.jwetherell.algorithms.mathematics;

import junit.framework.TestCase;
import org.junit.Assert;

public class MultiplicationTest extends TestCase {

    public void testMultiplication() {
        Assert.assertEquals(20, Multiplication.multiplication(4, 5));
        assertEquals(0, Multiplication.multiplication(0, 5));
        assertEquals(-20, Multiplication.multiplication(-4, 5));
    }

    public void testMultiplyUsingLoop() {
        assertEquals(20, Multiplication.multiplyUsingLoop(4, 5));
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 5));
        assertEquals(-20, Multiplication.multiplyUsingLoop(-4, 5));
    }

    public void testMultiplyUsingRecursion() {
        assertEquals(20, Multiplication.multiplyUsingRecursion(4, 5));
        assertEquals(0, Multiplication.multiplyUsingRecursion(0, 5));
        assertEquals(-20, Multiplication.multiplyUsingRecursion(-4, 5));
    }

    public void testMultiplyUsingShift() {
        assertEquals(20, Multiplication.multiplyUsingShift(4, 5));
        assertEquals(0, Multiplication.multiplyUsingShift(0, 5));
        assertEquals(-20, Multiplication.multiplyUsingShift(-4, 5));
    }

    public void testMultiplyUsingLogs() {
        assertEquals(20, Multiplication.multiplyUsingLogs(4, 5));
        assertEquals(0, Multiplication.multiplyUsingLogs(0, 5));
        assertEquals(-20, Multiplication.multiplyUsingLogs(-4, 5));
    }

    public void testMultiplyUsingFFT() {
        assertEquals("20", Multiplication.multiplyUsingFFT("4", "5"));
        assertEquals("0", Multiplication.multiplyUsingFFT("0", "5"));
        assertEquals("-20", Multiplication.multiplyUsingFFT("-4", "5"));
    }

    public void testMultiplyUsingLoopWithStringInput() {
        assertEquals("20", Multiplication.multiplyUsingLoopWithStringInput("4", "5"));
        assertEquals("0", Multiplication.multiplyUsingLoopWithStringInput("0", "5"));
        assertEquals("-20", Multiplication.multiplyUsingLoopWithStringInput("-4", "5"));
    }

    public void testMultiplyUsingLoopWithIntegerInput() {
        assertEquals(20, Multiplication.multiplyUsingLoopWithIntegerInput(4, 5));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(0, 5));
        assertEquals(-20, Multiplication.multiplyUsingLoopWithIntegerInput(-4, 5));
    }
}