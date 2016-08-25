package com.a.boopp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DTest {

	@Test
	public void t1()
	{
		System.out.println("Hi I am test t1");
		Assert.assertTrue(true, " ");
	}
	@Test
	public void t2()
	{
		System.out.println("Hi I am test t2");
		Assert.assertTrue(false, " ");
	}
	
	@Test
	public void t3()
	{
		System.out.println("Hi I am test t3");
		Assert.assertTrue(false, " ");
	}
}
