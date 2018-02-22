package com.javafortesters.demos.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyIntSetTest {
	@Test
	public void primativeSetTest() {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		int expected[] = getExpectedArrayFromActualSet(count);
		int actual[] = getArrayFromIntegerSet(new IntegerSet(count));
		Assert.assertArrayEquals("Expected set of ints does not match actual.", expected, actual);
	}

	@Test
	public void negativePrimativeSetDifferentLengthTest() {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		int expected[] = { 34, 22, 10, 60, 30, 99 };
		int actual[] = getArrayFromIntegerSet(new IntegerSet(count));
		if (assertArraysEqual(expected, actual)) {
			Assert.fail("Expected set of ints matches actual when it shouldn't.");
		}
	}

	@Test
	public void negativePrimativeSetDifferentElementTest() {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		int expected[] = { 34, 22, 10, 60, 99 };
		int actual[] = getArrayFromIntegerSet(new IntegerSet(count));
		if (assertArraysEqual(expected, actual)) {
			Assert.fail("Expected set of ints matches actual when it shouldn't.");
		}
	}

	/**
	 * @param set The Integer Set object from which we get the array.
	 *
	 * @return Int array from the input IntegerSet.
	 */
	private int[] getArrayFromIntegerSet(IntegerSet set) {
		int returnArray[] = new int[set.size()];
		for (int i = 0; i < set.size(); i++) {
			returnArray[i] = set.get(i);
		}
		return returnArray;
	}

	/**
	 * @param expected The array representing the expected result.
	 * @param actual   The array representing the actual result.
	 *
	 * @return boolean representing whether the arrays are equal
	 */
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

	private int[] getExpectedArrayFromActualSet(int[] intArray) {
		Set<Integer> expectedSet = new HashSet<>(Arrays.asList(toObject(intArray)));
		Integer objects[] = expectedSet.toArray(new Integer[expectedSet.size()]);
		return toPrimitive(objects);
	}

	private Integer[] toObject(int[] intArray) {

		Integer[] result = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			result[i] = Integer.valueOf(intArray[i]);
		}
		return result;
	}

	private int[] toPrimitive(Integer[] IntegerArray) {

		int[] result = new int[IntegerArray.length];
		for (int i = 0; i < IntegerArray.length; i++) {
			result[i] = IntegerArray[i].intValue();
		}
		return result;
	}
}
