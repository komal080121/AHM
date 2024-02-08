package com.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

	@FindBy(xpath = "//div[@id = \"gender\"]")
	WebElement gender;
	public void clickOnGender() {
		gender.click();
	}
	
	
	@FindBy(xpath = "//li[text() = \"Female\"]")
	WebElement genderSelect;
	public void selectGender() {
		genderSelect.click();
	}
	
	
	@FindBy(xpath = "//button[@aria-label=\"Choose date\"]")
	WebElement calendar;
	public void clickOnCalendar() {
		calendar.click();
	}
	
	@FindBy(xpath = "//button[text() =\"1\"]")
	WebElement dateSelect;
	public void selectDate() {
		dateSelect.click();
	}
	
	
	@FindBy(xpath = "//input[@name=\"zipcode\"]")
	WebElement zipcode;
	public void enterZipCode(String code) {
		zipcode.sendKeys(code);
	}
	
	
	@FindBy(xpath = "//button[text ()=\"Save Changes\"]")
	WebElement saveChangeBtn;
	public void clickOnSaveChangeBtn() {
		saveChangeBtn.click();
	}
}
