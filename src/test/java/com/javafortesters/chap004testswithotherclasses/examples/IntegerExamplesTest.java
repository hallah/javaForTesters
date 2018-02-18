package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Assert;
import org.junit.Test;

public class IntegerExamplesTest {
	@Test
	public void integerExploration() {
		Integer four = 4;
		Assert.assertEquals("intValue returns int 4", 4, four.intValue());
		Integer five = new Integer("5");
		Assert.assertEquals("intValue returns int 5", 5, five.intValue());
	}

	@Test
	public void integerToHexExploration() {
		Assert.assertEquals("toHexString of 11 returns b", "b", Integer.toHexString(11));
		Assert.assertEquals("toHexString of 10 returns a", "a", Integer.toHexString(10));
		Assert.assertEquals("toHexString of 3 returns 3", "3", Integer.toHexString(3));
		Assert.assertEquals("toHexString of 21 returns 15", "15", Integer.toHexString(21));
	}

	@Test
	public void integerConstantsExploration() {
		Assert.assertEquals("Integer min value returns -2147483648", -2147483648, Integer.MIN_VALUE);
		Assert.assertEquals("Integer min value returns 2147483647", 2147483647, Integer.MAX_VALUE);
	}
}
