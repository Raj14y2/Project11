package testingScripts;

import org.testng.annotations.Test;

public class TestClass1 
{

	@Test(groups = "smoke")
	public void testcase1()
	{
		System.out.println("--execute test case 1---");
	}

	@Test(groups = "Regression")
	public void testcase2()
	{
		System.out.println("--execute test case ---");
	}
}
