package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before Test Executed");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1 Executed");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 Executed");
	}

	@After
	public void teardown() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
