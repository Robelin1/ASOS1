package com.asos.ASOS1.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.asos.ASOS1.AddToBagPage;
import com.asos.ASOS1.AllCoatsPage;
import com.asos.ASOS1.LandingPage;
import com.asos.ASOS1.MensPage;
import com.asos.ASOS1.SuitsTailoringPage;

import Base.B;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends B {

	public static AllCoatsPage acp;

	@Given("user Is On The Home Page Of ASOS")
	public void user_is_on_the_home_page_of_asos() {
		driver = getUrl("https://www.asos.com/");

	}

	@When("user Is On The Home Page Click The Men Tab #Action")
	public void user_is_on_the_home_page_click_the_men_tab_action() {
		LandingPage lp = new LandingPage(driver);
		clickOnThelement(lp.getMens());
	}

	@When("user IS Now On The Men Page Scrolls Down and Click The Fresh Coats#Addition Action")
	public void user_is_now_on_the_men_page_scrolls_down_and_click_the_fresh_coats_addition_action() throws InterruptedException {
		MensPage mp = new MensPage(driver);
		scrollIntoView(mp.getCoats());
		clickOnThelement(mp.getCoats());
	}

	@When("user IS Now On The Fresh Coats Page Click On The Category Dropdown Performs ScrollDown and Click Suits&Tailoring")
	public void user_is_now_on_the_fresh_coats_page_click_on_the_category_dropdown_performs_scroll_down_and_click_suits_tailoring() {
		acp = new AllCoatsPage(driver);

		clickOnThelement(acp.getCategory());

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Locate the option in the dropdown menu

		WebElement container = driver.findElement(By.xpath("(//li[@class='li_uumN_'])[3]/child::div/child::div"));

		WebElement option = driver.findElement(By.xpath("//div[text()='Knitwear & Sweats']"));

		// Scroll to the option
		js.executeScript("arguments[0].scrollTop = arguments[1].offsetTop;", container, option);

		option.click();
	}

	@When("user Is Now On The Suits&Tailoring Page Selects The Desire Product")
	public void user_is_now_on_the_suits_tailoring_page_selects_the_desire_product() {
		SuitsTailoringPage stp = new SuitsTailoringPage(driver);
		clickOnThelement(acp.getCategory());
		clickOnThelement(stp.getJacket());
	}

	@Then("user Is Now On The Add To Bag Page Selects The Size From Dropdown and Click On Add To Bag Sucessfully#Positive Outcome")
	public void user_is_now_on_the_add_to_bag_page_selects_the_size_from_dropdown_and_click_on_add_to_bag_sucessfully_positive_outcome() {
		AddToBagPage atbp = new AddToBagPage(driver);

		dropDown(atbp.getVariant(), "byIndex", "5");

		clickOnThelement(atbp.getAddBag());

	}

}
