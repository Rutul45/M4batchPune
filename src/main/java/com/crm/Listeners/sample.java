package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class sample implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		org.testng.Reporter.log("onTestStart",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		org.testng.Reporter.log("onTestSuccess",true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		org.testng.Reporter.log("onTestFailure",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		org.testng.Reporter.log("onTestSkipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		org.testng.Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		org.testng.Reporter.log("onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		org.testng.Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		org.testng.Reporter.log("onTestFinish",true);
	}
	

}