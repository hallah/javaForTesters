package com.javafortesters.demos.examples;

import java.util.Collection;

public class MyCustomSet {
	private transient Object array[];

	public MyCustomSet() {
		array = new Object[0];
	}

	public MyCustomSet(Collection<Object> c) {
		array = c.toArray(new Object[c.size()]);
	}

	public Object[] toArray() {
		return array;
	}
}
