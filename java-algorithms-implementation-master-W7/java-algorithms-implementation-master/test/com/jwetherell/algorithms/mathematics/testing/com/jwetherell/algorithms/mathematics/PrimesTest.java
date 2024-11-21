package com.jwetherell.algorithms.mathematics;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Map;

public class PrimesTest extends TestCase {


    public void testGetPrimeFactorization() {

        Map<Long, Long> factors = Primes.getPrimeFactorization(60);
        assertEquals(2, (long) factors.get(2L)); // 60 = 2^2 * 3 * 5
        assertEquals(1, (long) factors.get(3L));
        assertEquals(1, (long) factors.get(5L));
        assertEquals(0, (long) factors.get(7L));
    }

    public void testIsPrime() {
        assertTrue(Primes.isPrime(2));
        assertTrue(Primes.isPrime(3));
        assertFalse(Primes.isPrime(4));
        assertTrue(Primes.isPrime(17));
        assertFalse(Primes.isPrime(18));
    }

    public void testSieveOfEratosthenes() {
        assertTrue(Primes.sieveOfEratosthenes(5));
        assertFalse(Primes.sieveOfEratosthenes(6));
        assertTrue(Primes.sieveOfEratosthenes(7));
    }

    public void testMillerRabinTest() {
        assertTrue(Primes.millerRabinTest(11));
        assertFalse(Primes.millerRabinTest(12));
        assertTrue(Primes.millerRabinTest(13));
    }
}