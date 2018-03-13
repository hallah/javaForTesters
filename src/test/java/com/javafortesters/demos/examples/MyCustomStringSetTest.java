package com.javafortesters.demos.examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MyCustomStringSetTest {
	@Test
	public void CustomSetCollectionConstructorTest() {
		Collection<String> collection = Arrays.asList(new String[] { "hello", "world", "hello", "moon", "goodbye", "moon" });
		Set realSet = new HashSet(collection);
		MyCustomStringSet customSet = new MyCustomStringSet(collection);
		//Assert Something
	}

}
