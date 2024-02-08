package com.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InjuryReport {

	
	@FindBy(xpath = "//button[text() =\"Create New Report\"]")
	WebElement createReportBtn;
	public void clickOnCreateReportBtn() {
		createReportBtn.click();
	}
	
	
	@FindBy(xpath = "//textarea[@name=\"description\"]")
	WebElement descriptionTextbox;
	public void enterTextIndescription(String text) {
		descriptionTextbox.sendKeys(text);
	}
	
	
	@FindBy(xpath = "//button[text()=\"Save\"]")
	WebElement saveBtn;
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
}
