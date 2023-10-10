package com.asos.ASOS1.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Base.B;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "D:\\Eclipse\\ASOS1\\Folder\\Order_A_Coat.feature", // path of feature file
		glue = "com.asos.ASOS1.StepDef", // path of step definition
		plugin = {  "html:Report/Cucumber_Report", 
			    "json:Report/Cucumber.json", 
			    "pretty"}, // Prints in the console
		monochrome = true, // Removes all the special characters
		dryRun = false // It will check the Feature file and step definition without actually running
)

public class Runner extends B {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = launchBrowserOptions("chrome");

	}

//	@AfterClass
//	public static void teardown() {
//		quitMultipleWindows();
//	}
}
