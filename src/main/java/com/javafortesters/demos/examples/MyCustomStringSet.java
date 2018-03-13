package com.javafortesters.demos.examples;

import java.util.Collection;

public class MyCustomStringSet {
	private transient String array[];

	public MyCustomStringSet() {
		array = new String[0];
	}

	public MyCustomStringSet(Collection<String> c) {
		array = c.toArray(new String[c.size()]);
	}

}
