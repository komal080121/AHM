package com.test.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.browser.BaseClass;

public class BrainHealthChallengePage extends BaseClass{

	@FindBy(xpath = "//button[text() = \"Create New Test\"]")
	WebElement createNewTestBtn;
	public void clickOnCreateNewTestBtn() {
		createNewTestBtn.click();
	}
	
	
	@FindBy(xpath = "(//div[@role=\"combobox\"])[1]")
	WebElement clickOnAthlete;
	public void clickOnAthleteDropdown() {
		clickOnAthlete.click();
	}
	
	
	@FindBy(xpath = "//li[text()= \"komal athlete\"]")
	WebElement selectAthlete;
	public void selectAthleteFromDropdown() {
		selectAthlete.click();
	}
	
	@FindBy(xpath = "(//div[@role=\"combobox\"])[2]")
	WebElement clickChallenge;
	public void clickOnChallenge() {
		clickChallenge.click();
	}
	
	
	@FindBy(xpath = "//li[text() = \"Wellbeing - PHQ-9\"]")
	WebElement selectChallenge;
	public void selectChallengeFromDropdown() {
		selectChallenge.click();
	}
	
	
	@FindBy(xpath = "//button[text() = \"Start Your Test\"]")
	WebElement startTestBtn;
	public void clickOnStartTestBtn() {
		startTestBtn.click();
	}
	
	
	@FindBy(xpath = "//button[text() = \"Get Test Score\"]")
	WebElement getTestScoreBtn;
	public void clickOnGetTestScoreBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", getTestScoreBtn);
		getTestScoreBtn.click();
	}
	
	@FindBy(xpath = "//button[text() = \"Okay\"]")
	WebElement okayBtn;
	public void clickOnOkayBtn() {
		okayBtn.click();
	}
}
