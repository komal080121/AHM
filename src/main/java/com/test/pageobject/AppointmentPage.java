package com.test.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.browser.BaseClass;

public class AppointmentPage extends BaseClass{

	@FindBy(xpath = "//button[text() = \"Create New Appointment\"]")
	WebElement createAppointmentBtn;
	public void clickonCreateAppointmentBtn() {
		createAppointmentBtn.click();
	}
	
	
	@FindBy(xpath = "//div[@id=\"Select-Athlete\"]")
	WebElement athleteclick;
	public void clickOnAthlete() {
		athleteclick.click();
	}
	
	
	@FindBy(xpath = "//li[text() = \"komal athlete\"]")
	WebElement selectAthlete;
	public void selectAthleteFromDropdown() {
		selectAthlete.click();
	}
	
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	WebElement onlineAppCheckbox;
	public void clickOnOnlineAppCheckbox() {
		onlineAppCheckbox.click();
	}
	
	
	@FindBy(xpath = "//input[@placeholder=\"appointment description\"]")
	WebElement description;
	public void enterDescription(String desc) {
		description.sendKeys(desc);
	}
	
	@FindBy(xpath = "//input[@id=\":r11:\"]")
	WebElement athleteDescription;
	public void enterAthleteDescription(String desc) {
		athleteDescription.sendKeys(desc);
	}
	
	
	@FindBy(xpath = "(//div[@role=\"combobox\"])[2]")
	WebElement timeClick;
	public void clickOnTime() {
		timeClick.click();
	}
	
	
	@FindBy(xpath = "//li[text() = \"02:30 pm\"]")
	WebElement selectStartTime;
	public void selectStartTime() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",selectStartTime );
		selectStartTime.click();
	}
	
	
	@FindBy(xpath = "(//div[@role=\"combobox\"])[3]")
	WebElement clickOnDur;
	public void clickOnDuration() {
		clickOnDur.click();
	}
	
	
	@FindBy(xpath = "//li[text() = \"15 mins\"]")
	WebElement selectDur;
	public void selectDuration() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",selectDur );
		selectDur.click();
	}
		
	
	@FindBy(xpath = "//button[text() = \"Save\"]")
	WebElement saveBtn;
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
	
	
	
	@FindBy(xpath = "(//div[@role=\"combobox\"])[1]")
	WebElement athleteStartTimeClick;
	public void clickOnAthleteStratTime() {
		athleteStartTimeClick.click();
	}
	
	@FindBy(xpath = "(//div[@role=\"combobox\"])[2]")
	WebElement clickPhysio;
	public void clickOnPhysio() {
		clickPhysio.click();
	}
	

	@FindBy(xpath = "//li[text() = \"komal physiotherapist\"]")
	WebElement selectPhysio;
	public void selectPhysioFromDropdown() {
		selectPhysio.click();
	}
	
	
	@FindBy(xpath = "//button[text() =\"Attend\"]")
	WebElement attendBtn;
	public void clickOnAttendBtn() {
		attendBtn.click();
	}
	
	
	@FindBy(xpath = "//button[text() = \"Join\"]")
	WebElement joinBtn;
	public void clickOnJoinBtn() {
		joinBtn.click();
	}
}
