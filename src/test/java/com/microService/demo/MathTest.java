package com.microService.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {
	Math mObj = new Math();
	@Test
	void test() {
		int expected = 3;
		int actual = mObj.sum(1, 2);
		assertEquals(expected, actual,"Developer - Pls check sum is incorrect");
	}
	
	@Test
	void circleAreaTest() {
		double expected = 254.34;
		double actual = mObj.circleArea(9);
		assertEquals(expected, actual,"Developer - Pls check AREA is incorrect");
	}
}
