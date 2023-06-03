package com.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestingHook {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before all test method");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After all test method");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test method");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("After each test method");
	}
	@Test
	public void test1() {
		System.out.println("While 1st test");
	}
	@Test
	public void test2() {
		System.out.println("While 2nd test");
	}
}
