package com.implementation.seleniumUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.implementation.selenium.Factory.DriverFactory;

public class Inputs extends Elements{
	
	static String noData="";
	public static WebElement clear(By by,int timeOutInSeconds)
	{
		Wait.elementEnabledandVisible(by, timeOutInSeconds);
		DriverFactory.getDriver().findElement(by).clear();
		return DriverFactory.getDriver().findElement(by);
	}
	
	public static void enterText(WebElement element,String val,int timeOutInSeconds)
{
	Wait.elementEnabledandVisible(element, timeOutInSeconds);
	if(val.equalsIgnoreCase(noData))
	{
		element.sendKeys(val);
	}
}
	public static void sendEnter(WebElement element ,int timeOutInSeconds)
	{
		Wait.elementEnabledandVisible(element, timeOutInSeconds);
		element.sendKeys(Keys.ENTER);
	}
	
	//Select for Checkbox and Radio buttons
	
	public static void select(WebElement element,int timeOutInSeconds)
	{
		Wait.elementEnabledandVisible(element, timeOutInSeconds);
		if(!element.isSelected())
			element.click();
	}

	//UnSelect Checkbox and Radio button

	public static void unSelect(WebElement element,int timeOutInSeconds)
	{
		Wait.elementEnabledandVisible(element, timeOutInSeconds);
		if(element.isSelected())
			element.click();
	}
}