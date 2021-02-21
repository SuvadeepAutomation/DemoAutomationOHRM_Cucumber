package com.implementation.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
features = {"C:\\Suvadeep_Workspace\\OrangeHRDemo\\src\\test\\java\\com\\business\\Features"},
glue= {"com.implementation.selenium.StepDefination","com.implementation.selenium.Setup"},
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class testRunner {

	
}
