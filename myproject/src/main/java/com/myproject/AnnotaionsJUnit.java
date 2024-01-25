package com.myproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotaionsJUnit {

	@BeforeClass
	public static void bClass() {
		System.out.println("Before class");
	}
	
	@Test
	public void rMethod() {
		System.out.println("Run Method");
	}
	
	@AfterClass
	public static void aMethod() {
		System.out.println("After class");
	}
}
