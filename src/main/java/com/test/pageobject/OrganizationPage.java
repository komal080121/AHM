package com.test.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.browser.BaseClass;

public class OrganizationPage extends BaseClass{

	@FindBy(xpath = "//button[@title=\"Next\"]")
	WebElement nextBtn;
	public void clickOnNextBtn() {
		nextBtn.click();
	}
	
	
	@FindBy(xpath = "//input[@id=\"outlined-error\"]")
	WebElement inviteCode;
	public void enterInviteCode(String code) {
		inviteCode.sendKeys(code);
	}
	
	
	@FindBy(xpath = "//button[text() =\"Join Now\"]")
	WebElement joinNowBtn;
	public void clickOnJoinNowBtn() {
		joinNowBtn.click();
	}
	
	
	@FindBy(xpath = "//span[@id=\"next\"]")
	WebElement teamsNextBtn;
	public void clickOnTeamsNextBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", teamsNextBtn);
	}
	
	
	@FindBy(xpath = "(//button[text() =\"Join\"])[3]")
	WebElement joinCricketTeamBtn;
	public void clickOnJoinCricketTeamBtn() {
		joinCricketTeamBtn.click();
	}
	
	
	@FindBy(xpath = "//button[@title =\"Next\"]")
	WebElement tourNextBtn;
	public void clickOnTourNextBtn() {
		tourNextBtn.click();
	}
	
	@FindBy(xpath = "(//button[@type=\"button\"])[1]")
	WebElement openDrawer;
	public void clickOnOpenDrawer() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", openDrawer);
	}
	
	
	@FindBy(xpath = "//span[@id=\"next\"]")
	WebElement nextBtn1;
	public void clickOnNextBtn1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", nextBtn1);
	}
}
