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

	@Test
	public void negativePrimativeSetDifferentLengthTest() {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		int expected[] = { 34, 22, 10, 60, 30, 99 };
		int actual[] = SetDemo.integerSet(count);
		if (assertArraysEqual(expected, actual)) {
			Assert.fail("Expected set of ints matches actual when it shouldn't.");
		}
	}

	@Test
	public void negativePrimativeSetDifferentElementTest() {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		int expected[] = { 34, 22, 10, 60, 99 };
		int actual[] = SetDemo.integerSet(count);
		if (assertArraysEqual(expected, actual)) {
			Assert.fail("Expected set of ints matches actual when it shouldn't.");
		}
	}

	private boolean assertArraysEqual(int expected[], int actual[]) {
		if (expected == null && actual == null) {
			return true;
		}

		if (expected == null) {
			return false;
		}

		if (actual == null) {
			return false;
		}

		if (!(expected.length == actual.length)) {
			return false;
		}
		int i = 0;
		for (int x : expected) {
			if (!(x == actual[i])) {
				return false;
			}
			i++;
		}
		return true;
	}
}
