package com.javafortesters.demos.examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MyCustomSetTest {
	private Set actualSet = null;
	private final Collection collection =
			Arrays.asList(new String[] { "hello", "world", "hello", "moon", "hello", "cow", "jumping", "over", "the", "moon" });

	@Test
	public void constructorTest() {
		actualSet = new HashSet(collection);
		Object expected[] = actualSet.toArray(new String[actualSet.size()]);
		MyCustomSet customSet = new MyCustomSet(collection);
		Object actual[] = customSet.toArray();
		assertArrayEquals("Expected array does not equal actual.", expected, actual);
	}

	private boolean assertArrayEquals(String message, Object[] expected, Object[] actual) {
		if (expected == null && actual == null) {
			return true;
		}
		if (expected == null || actual == null) {
			return false;
		}
		if (expected.length != actual.length) {
			return false;
		}
		for (Object o : expected) {
			boolean found = false;
			for (Object i : actual) {
				if (o.equals(i)) {
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}
}
