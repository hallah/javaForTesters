package com.javafortesters.demos.examples;

import org.junit.Assert;
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
		Assert.assertArrayEquals("Expected array does not equal actual.", expected, actual);
	}
}
