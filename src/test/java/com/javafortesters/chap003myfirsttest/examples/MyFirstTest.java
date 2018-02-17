package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hugh1 on 11/27/2016.
 */
public class MyFirstTest {
	@Test
	public void canAddTwoPlusTwo() {
		int answer = 2 + 2;
		assertEquals("2+2=4", 4, answer);

	}
}
