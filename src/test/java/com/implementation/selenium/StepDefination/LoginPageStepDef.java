package com.implementation.selenium.StepDefination;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.implementation.selenium.Factory.DriverFactory;
import com.implementation.selenium.PageObjects.LoginPage;
import com.implementation.seleniumUtilities.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {

	private static String title;
	public static String lgtitle;
	private static WebElement frgtpassword;
	
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	
	//Scenario 1 : Page Title Verification
	@Given("User is on Login Page")
	public void user_is_on_login_page()
	{
		
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
	}
	
	@When("User gets title of the page")
	public void user_get_title_of_page() 
	{
		Wait.sleep(10);
		title=loginPage.getPageTitle();
		System.out.println("Login Page title is : "+ title);
		
	}
	
	@Then("Page title should be {string}")
	public void page_title_verify(String expectedTitle) 
	{
		Wait.sleep(10);
		System.out.println("Expected Title"+expectedTitle);
		Assert.assertEquals(title, expectedTitle);
	}
	//Scenario 2 : Password Link is displayed
	@Then("forget password link should be displayed")
	public void forget_password_link_should_be_displayed() {
		Wait.sleep(10);
		loginPage.isForgotPwdLinkExist(frgtpassword);		
	}

	//Scenario 3 : Login successfull
	@When("User enters username {string}")
	public void user_enters_username(String uname) {
		Wait.sleep(10);
	   loginPage.enterUsername(uname);
	}

	@When("User enters passowrd {string}")
	public void user_enters_passowrd(String pwd) {
		Wait.sleep(10);
	   loginPage.enterPassword(pwd);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		Wait.sleep(10);
	 loginPage.clickLogin();  
	}

	@Then("user gets title of the page")
	public void user_gets_title_of_the_page() {
		Wait.sleep(10);
		lgtitle=LoginPage.getPageTitle();
		System.out.println("Title of Page after login :"+lgtitle);
	}

	@Then("title should be {string}")
	public void title_should_be(String logintitle) {
		Wait.sleep(10);
		System.out.println("Login Title"+logintitle);
		Assert.assertEquals(title, logintitle);
	}	
}
