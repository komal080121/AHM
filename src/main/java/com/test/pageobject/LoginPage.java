package com.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement userName;

	public void enterUserName(String name) {
		userName.sendKeys(name);
	}

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	@FindBy(xpath = "//button[text()=\"Sign in\"]")
	WebElement signInBtn;

	public void clickOnSignInBtn() {
		signInBtn.click();
	}
	
	
	@FindBy(xpath = "//input[@name=\"New Password\"]")
	WebElement newPassword;
	public void enterNewPassword(String npass) {
		newPassword.sendKeys(npass);
	}
	
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement cfnpassword;
	public void entercfnpassword(String cfnpass) {
		cfnpassword.sendKeys(cfnpass);
	}
	
	
	@FindBy(xpath = "//button[text() =\"SUBMIT\"]")
	WebElement submitBtn;
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
}
