package com.implementation.seleniumUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.implementation.selenium.Factory.DriverFactory;

public class Wait {

	private final static int defaultWait=60;
	public static final int SHORT_TIMEOUT=10;
	public static final int MIDDLE_TIMEOUT=30;
	public static final int LONG_TIMEOUT=90;
	
	public static int getWaitDuration()
	{
		int duration;
		try {
		duration=Integer.parseInt("defaultWait");
		}
		catch(Exception e)
		{
			duration=defaultWait;
		}
		return duration;
	}
	
	public static void sleep(int seconds)
	{
		try
		{
			Thread.sleep(defaultWait*1000);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	public static WebElement elementEnabledandVisible(By by,int timeOutInSeconds)
	{
		WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(),timeOutInSeconds);
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	public static WebElement elementEnabledandVisible(WebElement element,int timeOutInSeconds)
	{
		WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(),timeOutInSeconds);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static WebElement elementlocatedinDOM(By locator,int timeOutInSeconds)
	{
		WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(),timeOutInSeconds);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement elementInVisible(By by,int timeOutInSeconds)
	{
		WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(),timeOutInSeconds);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
}
