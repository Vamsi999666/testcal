package com.myproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculatortest {
	Calculator c;

	@Before
	public void setUp() throws Exception {
		c=new Calculator ();
	}

	@After
	public void tearDown() throws Exception {
		c=null;
	}

	@Test
	public void testAddition() {
		int result= c.addition(4, 5);
		assert result>5: "value should be greater than 5" ;
	}

	@Test
	public void testSubstraction() {
		int result= c.substraction(4, 5);
		assert result<5: "value should be greater than 5" ;
	}

	@Test
	public void testMultiplication() {
		int result= c.Multiplication(4, 5);
		assert result>5: "value should be greater than 5" ;
	}

	@Test
	public void testDivision() {
		int result= c.division(4, 5);
		assert result<5: "value should be greater than 5" ;
	}

}
