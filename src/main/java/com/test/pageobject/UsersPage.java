package com.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {
     
	@FindBy(xpath = "//button[text() = \"Invite User\"]")
	WebElement inviteUserBtn;
	public void clickOnInviteUserBtn() {
		inviteUserBtn.click();
	}
	
	@FindBy(xpath = "//input[@name=\"FirstName\"]")
	WebElement firstName;
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public String getFirstName() {
		String fname = firstName.getAttribute("value");
		return fname;
	}
	
	
	@FindBy(xpath = "//input[@name=\"LastName\"]")
	WebElement lastName;
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	
	@FindBy(xpath = "//input[@name=\"emailAddress\"]")
	WebElement emailId;
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	@FindBy(xpath = "//input[@name=\"phoneNumber\"]")
	WebElement phoneNo;
	public void enterPhoneNo(String no) {
		phoneNo.sendKeys(no);
	}
	
	
	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement userName;
	public void enterUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	public String getUserName() {
		String uname = userName.getAttribute("value");
		return uname;
	}
	
	@FindBy(xpath = "//div[@id=\"user-select-select\"]")
	WebElement userType;
	public void clickOnUserType() {
		userType.click();
	}
	
	@FindBy(xpath = "//li[text() =\"Physiotherapist\"]")
	WebElement selectPhysio;
	public void selectPhysioTherapist() {
		selectPhysio.click();
	}
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	@FindBy(xpath = "//input[@name=\"ConfirmPassword\"]")
	WebElement cpassword;
	public void entercPassword(String cpass) {
		cpassword.sendKeys(cpass);
	}
	
	
	@FindBy(xpath = "(//button[text() =\"Invite User\"])[2]")
	WebElement inviteUserBtn1;
	public void clickOnInviteUserBtn1() {
		inviteUserBtn1.click();
	}
}
