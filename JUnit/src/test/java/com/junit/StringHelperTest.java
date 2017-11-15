package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateInFirst2Positions_Ainfirst2Positions() {
		//expected,actual
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));	
	}

	@Test
	public void testTruncateInFirst2Positions_AinFirstPosition() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}

	//ABCD -> false, ABAB -> true, AB -> true, A -> false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_FalseTest() {
		assertFalse("Test Failed",helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_TrueTest() {
		assertTrue("Test Failed",helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
