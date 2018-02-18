package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by hugh1 on 11/27/2016.
 */
public class MyFirstTest {
	@Test
	public void canAddTwoPlusTwo() {
		int answer = 2 + 2;
		assertEquals("2+2=4", 4, answer);
	}

	@Test
	public void negativeTwoPlusTwoNot5() {
		int answer = 2 + 2;
		assertNotEquals("2+2!=5", 5, answer);
	}

	@Test
	public void canSubtractTwoFromTwo() {
		int answer = 2 - 2;
		assertEquals("2-2=0", 0, answer);
	}

	@Test
	public void negativeTwoMinusTwoNot1() {
		int answer = 2 - 2;
		assertNotEquals("2-2!=1", 1, answer);
	}

	@Test
	public void canDivideFourByTwo() {
		int answer = 4 / 2;
		assertEquals("4/2=2", 2, answer);
	}

	@Test
	public void negativeFourDividedByTwoNot1() {
		int answer = 4 / 2;
		assertNotEquals("4/2!=1", 1, answer);
	}

	@Test
	public void canMultiplyTwoTimesTwo() {
		int answer = 2 * 2;
		assertEquals("2*2=4", 4, answer);
	}

	@Test
	public void negativeTwoTimesTwoNot5() {
		int answer = 2 * 2;
		assertNotEquals("2*2!=5", 5, answer);
	}
}
