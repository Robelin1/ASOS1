package com.asos.ASOS1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCoatsPage {

	public static WebDriver driver;

	@FindBy(xpath = "//li[@data-auto-id='attribute_10992']")
	private WebElement category;


	public AllCoatsPage(WebDriver driver) {
		AllCoatsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCategory() {
		return category;
	}
}
