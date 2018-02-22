package com.javafortesters.demos.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedListTest {
	@Test
	public void evenLinkedListTeet() {
		LinkedList<Integer> evenList = new LinkedList<>();
		for (int i = 20; i >= 0; i--) {
			evenList.add(i);
		}
		Integer expected[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		LinkedList expectedList = new LinkedList(Arrays.asList(expected));
		evenList = ReverseLinkedList.reverseLinkedList(evenList, ReverseLinkedList.ReverseType.even);
		Assert.assertEquals("Reversed list does not match expected", expectedList, evenList);
	}

	@Test
	public void oddLinkedListTeet() {
		LinkedList oddList = new LinkedList();
		for (int i = 20; i >= 0; i--) {
			oddList.add(i);
		}
		Integer expected[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		LinkedList<Integer> expectedList = new LinkedList<>(Arrays.asList(expected));
		oddList = ReverseLinkedList.reverseLinkedList(oddList, ReverseLinkedList.ReverseType.odd);
		Assert.assertEquals("Reversed list does not match expected", expectedList, oddList);
	}
}
