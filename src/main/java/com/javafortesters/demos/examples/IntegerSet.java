package com.javafortesters.demos.examples;

public class IntegerSet {

	private transient int array[];

	/**
	 * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
	 * default initial capacity (16) and load factor (0.75).
	 */
	public IntegerSet() {
		array = new int[0];
	}

	/**
	 * @param integers Array of ints to instantiate the Set
	 */
	IntegerSet(int integers[]) {
		array = new int[0];
		for (int i : integers) {
			add(i);
		}
	}

	/**
	 * @param index Index of the element desired from the set.
	 *
	 * @return int value of the desired element in the set.
	 */
	public int get(int index) {
		return array[index];
	}

	/**
	 * Returns the number of elements in this set (its cardinality).
	 *
	 * @return the number of elements in this set (its cardinality)
	 */
	public int size() {
		return array.length;
	}

	/**
	 * Adds the specified element to this set if it is not already present.
	 * More formally, adds the specified element <tt>e</tt> to this set if
	 * this set contains no element <tt>e2</tt> such that
	 * <tt>(e==null&nbsp;?&nbsp;e2==null&nbsp;:&nbsp;e.equals(e2))</tt>.
	 * If this set already contains the element, the call leaves the set
	 * unchanged and returns <tt>false</tt>.
	 *
	 * @param i element to be added to this set
	 *          element
	 */
	private void add(int i) {
		for (int x : array) {
			if (i == x) {
				return;
			}
		}
		int arrayCopy[] = new int[array.length + 1];
		System.arraycopy(array, 0, arrayCopy, 0, array.length);
		arrayCopy[array.length] = i;
		array = new int[arrayCopy.length];
		System.arraycopy(arrayCopy, 0, array, 0, arrayCopy.length);
	}
}