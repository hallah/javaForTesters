package com.javafortesters.demos.examples;

import org.junit.Assert;
import org.junit.Test;

public class MyIntSetTest {
	@Test
	public void primativeSetTest() {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		int expected[] = { 34, 22, 10, 60, 30 };
		int actual[] = SetDemo.integerSet(count);
		Assert.assertArrayEquals("Expected set of ints does not match actual.", expected, actual);
	}
}
