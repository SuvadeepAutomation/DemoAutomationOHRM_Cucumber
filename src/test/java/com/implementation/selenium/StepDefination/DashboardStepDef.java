package com.implementation.selenium.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.List;
import java.util.Map;

import com.implementation.selenium.Factory.DriverFactory;
import com.implementation.selenium.ObjectRepository.TestEssentials;
import com.implementation.selenium.PageObjects.DashboardPage;
import com.implementation.selenium.PageObjects.LoginPage;

import io.cucumber.datatable.DataTable;

public class DashboardStepDef {
	
	private LoginPage lgpage=new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashboard;
	public static String acttitle;
	
	@Given("User has already logged in")
	public void user_has_already_logged_in(DataTable dataTable) {
	    List<Map<String,String>> cred=dataTable.asMaps();
	    String username=cred.get(0).get("username");
	    String password=cred.get(0).get("password");
	    DriverFactory.getDriver().get(TestEssentials.URL);
	    dashboard=lgpage.Login(username,password);
	    	}

	
	
	@When("User gets the title of the account page")
	public void user_gets_the_title_of_the_account_page() {
		 acttitle=dashboard.getTitleofPage();
		System.out.println("Actual title of Page"+acttitle);
	}

	@Then("Account Page title should be {string}")
	public void account_page_title_should_be(String title)
	{
		Assert.assertEquals(acttitle,title);
	}
	
	@Then("User gets the quick section")
	public void user_gets_the_quick_section(DataTable sectionTable) 
	{
	   List<String> expectedSectionList=sectionTable.asList();
	   System.out.println("Actual section List" +expectedSectionList );
	   List<String> actualSectionList=dashboard.getLaunchList();
	   Assert.assertTrue(expectedSectionList.containsAll(actualSectionList));
	   
	}
}

	

