package testGroups;

import org.testng.annotations.Test;

public class GroupingOfTests {
	
	@Test(groups = {"smoke"})
	public void Test1() {
		System.out.println("This Is Test1");
	}

	@Test(groups = {"smoke", "Regression"})
	public void Test2() {
		System.out.println("This Is Test2");
	}

	@Test(groups = { "Regression"})
	public void Test3() {
		System.out.println("This Is Test3");
	}
	
	@Test(groups = { "Regression"})
	public void Test4() {
		System.out.println("This Is Test4");
	}
	
	@Test(groups = { "Regression"})
	public void Test5() {
		System.out.println("This Is Test5");
	}

	
}
