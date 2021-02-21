package com.implementation.seleniumUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.implementation.selenium.Factory.DriverFactory;

public class Elements {

	//Returns element occurences in a List
	public static WebElement getElementOccurence(By by,int index)
	{
		return DriverFactory.getDriver().findElements(by).get(index);
	}
	public static WebElement getElementOccurence(List<WebElement> element, int index)
	{
		return element.get(index);
	}
	
	//Returns inner text for an Element 
	
	public static String getText(By by)
	{
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	public static String getText(WebElement element)
	{
		return element.getText();
	}
	
	//Returns if element is enabled
	public static boolean isEnabled(By by)
	{
		return DriverFactory.getDriver().findElement(by).isEnabled();
	}
	
	public static boolean isEnabled(WebElement element)
	{
		return element.isEnabled();
	}

	//Returns if element is visible
	public static boolean isVisible(By by)
	{
		return DriverFactory.getDriver().findElement(by).isDisplayed();
	}
	
	public static boolean isVisible(WebElement element)
	{
		return element.isDisplayed();
	}
	//Returns if element is selected
		public static boolean isSelected(By by)
		{
			return DriverFactory.getDriver().findElement(by).isSelected();
		}
		
		public static boolean isSelected(WebElement element)
		{
			return element.isSelected();
		}
		
		public static WebElement searchElement(By element)
		{
			return DriverFactory.getDriver().findElement(element);
		}
			
		}
			
		

