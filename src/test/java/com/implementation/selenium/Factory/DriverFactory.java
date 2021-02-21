package com.implementation.selenium.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.implementation.selenium.Setup.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	public static WebDriver int_driver(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Suvadeep_Workspace\\OrangeHRDemo\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.geckodriver","C:\\Suvadeep_Workspace\\OrangeHRDemo\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		
		} else {
			System.out.println("Please pass correct browser : " + browser);
		}
		return getDriver();
	}

	
	public static WebDriver getDriver()
	{
		return driver;
	
	}
}
