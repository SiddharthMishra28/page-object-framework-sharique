package reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportManager implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("I'll execute on Test process start!");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I'll execute on Pass!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I'll execute on failure!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I'll execute on Skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("I'll execute on start! at first!");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("I'll execute on Last!");
	}	
	
	
}
