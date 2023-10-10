package com.asos.ASOS1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath ="//p[text()='HALLOWEEN HITS']")
	private WebElement coats;
	
	public MensPage(WebDriver driver) {
		MensPage.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoats() {
		return coats;
	}
	
}
