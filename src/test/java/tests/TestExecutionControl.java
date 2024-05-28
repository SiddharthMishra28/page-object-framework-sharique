package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.Hooks;

public class TestExecutionControl extends Hooks{
	
	@Test
	public void test1(String browser) {
		System.out.println("I am test 1 executing in "+browser);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		System.out.println("I am test 1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		System.out.println("I am test 1");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test4() {
		System.out.println("I am test 1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test5() {
		System.out.println("I am test 1");
		Assert.assertTrue(false);
	}
}
