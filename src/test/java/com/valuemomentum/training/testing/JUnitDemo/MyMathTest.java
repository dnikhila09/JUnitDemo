package com.valuemomentum.training.testing.JUnitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest
{
    MyMath mymath = new MyMath();
    //MyMath.sum
    //1,2,3 => 6
    @Test
    public void sum_with3numbers() {
    	System.out.println("Test1");
		assertEquals(6, mymath.sum(new int[] { 1, 2, 3 }));
	}
	@Test
	public void sum_with1number() {
		System.out.println("Test2");
		assertEquals(3, mymath.sum(new int[] { 3 }));
	}
}
    

