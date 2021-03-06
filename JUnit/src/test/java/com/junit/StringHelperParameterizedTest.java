package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]>testConditions() {
		String expectedOutputs[][] =
			{
					{"AACD","CD"},
					{"ACD","CD"}
			};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateInFirst2Positions_Ainfirst2Positions() {
		//expected,actual
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));	
	}
	
}
