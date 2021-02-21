package com.implementation.selenium.PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.implementation.selenium.Factory.DriverFactory;

public class DashboardPage {

	private WebDriver driver;
	
	@FindBy(className="quickLaungeContainer")
	public static By quickLaunch;


public DashboardPage(WebDriver driver) {
	this.driver=driver;	
}

public List<String> getLaunchList()
{
	List<String> qklauchList=new ArrayList<String>();
	List<WebElement> qklaunch=driver.findElements(quickLaunch);
	
	for(WebElement e:qklaunch)
	{
		String text=e.getText();
		System.out.println(text);
		qklauchList.add(text);
	}
	return qklauchList;
}

public String getTitleofPage()
{
	return DriverFactory.getDriver().getTitle();
}
}
