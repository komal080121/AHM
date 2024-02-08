package com.test.pageobject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.browser.BaseClass;

public class WorkHoursPage extends BaseClass{
	
	@FindBy(xpath = "//span[text() =\"Work Hours\"]")
	WebElement workHoursBtn;
	public void clickOnWorkHoursBtn() {
		workHoursBtn.click();
	}
	
	@FindBy(xpath = "//div[text() =\"Add Hours\"]")
	WebElement addWorkHoursBtn;
	public void clickOnAddWorkHoursBtn() {
		addWorkHoursBtn.click();
	}
	
	@FindBy(xpath = "//table//tbody//tr//td[2]")
	WebElement startTimeClick;
	public void clickOnStartTime() {
		startTimeClick.click();
	}
	
	
	@FindBy(xpath = "//li[text() = \"05:00 pm\"]")
	WebElement selectStartTime;
	public void selectStartTime() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", selectStartTime);
		selectStartTime.click();
	}
	
	
	@FindBy(xpath = "//table//tbody//tr//td[3]")
	WebElement endTimeClick;
	public void clickOnEndTime() {
		endTimeClick.click();
	}
	
	
	@FindBy(xpath = "//li[text() = \"09:00 pm\"]")
	WebElement selectEndTime;
	public void selectEndTime() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", selectEndTime);
		selectEndTime.click();
	}
	
	
	@FindBy(xpath = "//button[text() =\"Save Changes\"]")
	WebElement saveChangeBtn;
	public void clickOnSaveChangeBtn() {
		saveChangeBtn.click();
	}
	
}
