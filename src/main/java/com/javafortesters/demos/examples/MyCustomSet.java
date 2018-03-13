package com.javafortesters.demos.examples;

import java.util.Collection;

public class MyCustomSet {
	private transient Object array[];

	public MyCustomSet() {
		array = new Object[0];
	}

	public MyCustomSet(Collection<Object> c) {
		array = new Object[0];
		for (Object o : c) {
			boolean exists = false;
			for (Object i : array) {
				if (o.equals(i)) {
					exists = true;
				}
			}
			if (!exists) {
				Object arrayCopy[] = array.clone();
				array = new Object[arrayCopy.length + 1];
				for (int j = 0; j < arrayCopy.length; j++) {
					array[j] = arrayCopy[j];
				}
				array[arrayCopy.length] = o;
			}
		}
	}

	public Object[] toArray() {
		return array;
	}
}
