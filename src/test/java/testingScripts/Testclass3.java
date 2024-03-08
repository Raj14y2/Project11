package testingScripts;

import org.testng.annotations.Test;

public class Testclass3 
{

	@Test(groups = {"Regression","smoke"})
	public void testcase3()
	{
		System.out.println("--execute test case 3---");
	}
}
