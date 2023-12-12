package com.programaprueba.Prueba;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {
	   @Test
	    public void testSum() {
	        assertEquals(4, MyApp.sum(2, 2));
	    }

	    @Test
	    public void testSumNegative() {
	        assertEquals(-2, MyApp.sum(2, -4));
	    }

	    @Test
	    public void testSumZero() {
	        assertEquals(0, MyApp.sum(0, 0));
	    }
}