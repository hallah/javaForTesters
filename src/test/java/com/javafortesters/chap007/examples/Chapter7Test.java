package com.javafortesters.chap007.examples;

import org.junit.Assert;
import org.junit.Test;

public class Chapter7Test {
	@Test
	public void aJavaDocComment() {
		Assert.assertTrue("4 plus 3 equals 7", addTwoNumbers(4, 3) == 7);
	}

	/**
	 * @param first  First number for sum.
	 * @param second Second number for sum.
	 *
	 * @return Sum of the two numbers.
	 */
	private int addTwoNumbers(int first, int second) {
		return first + second;
	}
}
