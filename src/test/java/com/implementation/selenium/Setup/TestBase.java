package com.implementation.selenium.Setup;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.implementation.selenium.Factory.DriverFactory;
import com.implementation.selenium.ObjectRepository.TestEssentials;

import com.implementation.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestBase {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	
	static Properties prop;
	
	@Before(order=0)
	public void getProperty()
	{
	configReader=new ConfigReader();
	prop=configReader.int_prop();
	}
	
	@Before(order=1)
	public static void launchBrowser()
	{
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		DriverFactory.int_driver(browserName);
		
		
	}
	
	@After(order=0)
	public void quitBrowser()
	{
		DriverFactory.getDriver().quit();
	}
	
	@After(order=1)
	public void failure(Scenario scenario)
	{
		if(scenario.isFailed())
		{//take screenshot
			String screenshotName=scenario.getName().replaceAll(" ","_");
			byte[] sourcePath=((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}
