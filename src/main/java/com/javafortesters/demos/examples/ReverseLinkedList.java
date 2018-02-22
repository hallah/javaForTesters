package com.javafortesters.demos.examples;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
	public enum ReverseType {
		odd,
		even
	}

	public static LinkedList reverseLinkedList(LinkedList linkedList, ReverseType type) {
		for (int i = 0; i < linkedList.size(); i++) {
			switch (type) {
			case odd:
				if (((Integer) linkedList.get(i) & 1) == 0) {
					linkedList.remove(i);
				}
				break;
			case even:
				if (!(((Integer) linkedList.get(i) & 1) == 0)) {
					linkedList.remove(i);
				}
				break;
			default:
				break;
			}
		}
		Collections.reverse(linkedList);
		return linkedList;
	}
}
