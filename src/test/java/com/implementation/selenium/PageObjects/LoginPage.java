package com.implementation.selenium.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.implementation.selenium.Factory.DriverFactory;
import com.implementation.selenium.ObjectRepository.TestEssentials;
import com.implementation.seleniumUtilities.Elements;
import com.implementation.seleniumUtilities.Inputs;
import com.implementation.seleniumUtilities.Wait;

public class LoginPage {
	
	private  WebDriver driver;
	
	@FindBy(id="txtUsername")
	public static By username;
	
	@FindBy(id="txtPassword")
	public static By  passowrd;
	
	@FindBy(id="btnLogin")
	public static By LoginBtn;
	
	@FindBy(linkText="Forgot your password?")
	public static By frgtpassword;

	public LoginPage(WebDriver driver)
	{this.driver=driver;	
	}
	
	public static String getPageTitle()
	{
		return DriverFactory.getDriver().getTitle();
	}
	
	public boolean isForgotPwdLinkExist(WebElement frgtpassword) {
		return DriverFactory.getDriver().findElement((By) frgtpassword).isDisplayed();
	}
	
	public static void enterUsername(String usrname)
	{

Inputs.enterText(Elements.searchElement(LoginPage.username),usrname,Wait.MIDDLE_TIMEOUT);

	}
	public static void enterPassword(String password)
	{
Inputs.enterText(Elements.searchElement(LoginPage.passowrd),password,Wait.MIDDLE_TIMEOUT);
	}
public static void clickLogin()
{
	Inputs.select(Elements.searchElement(LoginPage.LoginBtn), Wait.MIDDLE_TIMEOUT);
}

public DashboardPage Login(String uname,String pass)
{
DriverFactory.getDriver().findElement(LoginPage.username).sendKeys(uname);
DriverFactory.getDriver().findElement(LoginPage.passowrd).sendKeys(pass);
DriverFactory.getDriver().findElement(LoginPage.LoginBtn).click();
return new DashboardPage(driver);
}

}
