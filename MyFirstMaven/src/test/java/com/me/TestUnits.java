package com.me;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnits {
	
	@Test
	public void checkFindBig()
	{
		assertEquals(20, Calculator.findBig(10, 20));
	}
	
	@Test
	public void checkFindBiggest()
	{
		assertEquals(300, Calculator.findBiggest(200, 300, 100));
	}
	
	@Test
	public void checkCC()
	{
		assertEquals(true, Calculator.checkCCNum("0123456789098765"));
	}
}
