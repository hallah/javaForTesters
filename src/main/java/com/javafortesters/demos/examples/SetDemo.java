package com.javafortesters.demos.examples;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static int[] integerSet(int integers[]) {

		Set<Integer> tempSet = new HashSet<Integer>();

		for (int i : integers) {
			tempSet.add(i);
		}
		int returnSet[] = new int[tempSet.size()];
		int i = 0;
		for (Integer x : tempSet) {
			returnSet[i] = x.intValue();
			i++;
		}
		return returnSet;
	}
}
