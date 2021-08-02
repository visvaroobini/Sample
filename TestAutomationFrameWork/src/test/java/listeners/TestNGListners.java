package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("*******=-Test started=-*******" + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*******=-Test sucessfull=-*******" + result.getName());
		
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("*******=-Test Failed=-*******" + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*******=-Test Skipped=-*******" + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("*******=-All Tests completed=-*******" + context.getName());
		
	}
}
