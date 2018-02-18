package com.javafortesters.demos.examples;

public class IntegerSet {

	private transient int array[];

	// Dummy value to associate with an Object in the backing Map
	private static final Object PRESENT = new Object();

	/**
	 * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
	 * default initial capacity (16) and load factor (0.75).
	 */
	public IntegerSet() {
		array = new int[0];
	}

	/**
	 * @param integers
	 */
	public IntegerSet(int integers[]) {
		array = new int[0];
		for (int i : integers) {
			add(i);
		}
	}

	/**
	 * @param index
	 *
	 * @return
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
	 *
	 * @return <tt>true</tt> if this set did not already contain the specified
	 * element
	 */
	public boolean add(int i) {
		int y = 0;
		for (int x : array) {
			if (i == array[y]) {
				return false;
			}
			y++;
		}
		int z = array.length;
		int arrayCopy[] = new int[array.length + 1];
		System.arraycopy(array, 0, arrayCopy, 0, array.length);
		arrayCopy[array.length] = i;
		array = new int[arrayCopy.length];
		System.arraycopy(arrayCopy, 0, array, 0, arrayCopy.length);
		return true;
	}
}