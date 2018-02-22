package com.javafortesters.demos.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedListTest {
	@Test
	public void evenLinkeListTeet() {
		LinkedList evenList = new LinkedList();
		for (int i = 20; i >= 0; i--) {
			evenList.add(i);
		}
		Integer expeected[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		LinkedList expectedList = new LinkedList(Arrays.asList(expeected));
		evenList = ReverseLinkedList.reverseLinkedList(evenList, ReverseLinkedList.ReverseType.even);
		Assert.assertEquals("Reversed list does not match expected", expectedList, evenList);
	}

	@Test
	public void oddLinkeListTeet() {
		LinkedList oddList = new LinkedList();
		for (int i = 20; i >= 0; i--) {
			oddList.add(i);
		}
		Integer expeected[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		LinkedList expectedList = new LinkedList(Arrays.asList(expeected));
		oddList = ReverseLinkedList.reverseLinkedList(oddList, ReverseLinkedList.ReverseType.odd);
		Assert.assertEquals("Reversed list does not match expected", expectedList, oddList);
	}
}
