package com.test.pageobject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.test.browser.BaseClass;

public class DashboardPage extends BaseClass{

	
	@FindBy(xpath = "(//button[@type=\"button\"])[1]")
	WebElement openDrawer;
	public void clickOnOpenDrawer() {
		openDrawer.click();
	}
	
	@FindBy(xpath = "//span[text()=\"Injury Reports\"]")
	WebElement injuryReport;
	public void clickOnInjuryReport() {
		injuryReport.click();
	}
	
	
	@FindBy(xpath = "//span[text() = \"Appointments\"]")
	WebElement appointmentBtn;
	public void clickonAppointmentsBtn() {
		appointmentBtn.click();
	}
	
	
	@FindBy(xpath = "//span[text() = \"Physical Health Challenge\"]")
	WebElement physicalHealthBtn;
	public void clickOnPhysicalHealth() {
		physicalHealthBtn.click();
	}
	
	@FindBy(xpath = "//span[text() = \"Brain Health Challenge\"]")
	WebElement brainHealthBtn;
	public void clickOnBrainHealthBtn() {
		brainHealthBtn.click();
	}
	
	
	@FindBy(xpath = "//span[text() = \"Injury Questions\"]")
	WebElement injuryQuestions;
	public void clickOnInjuryQuestions() {
		injuryQuestions.click();
	}
	
	
	@FindBy(xpath = "//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-fe3u4m\"]")
	WebElement profileBtn;
	public void cllickOnProfileBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", profileBtn);
		//profileBtn.click();
	}
	
	
	@FindBy(xpath = "//li[text() =\"Logout\"]")
	WebElement logOutBtn;
	public void clickOnLogOutBtn() {
		logOutBtn.click();
	}
	
	
	@FindBy(xpath = "//button[text() = \"Let's Start\"]")
	WebElement letsStratBtn;
	public void clickonLetsStartBtn() {
		letsStratBtn.click();
	}
}
