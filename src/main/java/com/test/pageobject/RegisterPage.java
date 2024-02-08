package com.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	
	@FindBy(xpath = "//button[text () =\"Register\"]")
	WebElement registerBtn;
	public void clickOnRegisterBtn() {
		registerBtn.click();
	}
	
	@FindBy(xpath = "//input[@name=\"FirstName\"]")
	WebElement firstName;
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	
	public String fname = null;
	public String getFirstName() {
	  fname = firstName.getAttribute("value");
	  return fname;
	}
	
	@FindBy(xpath = "//input[@name=\"LastName\"]")
	WebElement lastName;
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement userName;
	public void enterUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	
	@FindBy(xpath = "//input[@name=\"emailAddress\"]")
	WebElement email;
	public void enterEmailAddress(String mail) {
		email.sendKeys(mail);
	}
	
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	@FindBy(xpath = "//input[@name=\"ConfirmPassword\"]")
	WebElement cpassword;
	public void enterCPassword(String cPass) {
		cpassword.sendKeys(cPass);
	}
	
	
	@FindBy(xpath = "//input[@name=\"phoneNumber\"]")
	WebElement phoneNo;
	public void enterPhoneNo(String pno) {
		phoneNo.sendKeys(pno);
	}
	
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	WebElement termsCheckbox;
	public void clickOnTermsCheckbox() {
		termsCheckbox.click();
	}
	
	
	@FindBy(xpath = "//button[text() =\"Register\"]")
	WebElement registerBtn1;
	public void clickOnRegisterBtn1() {
		registerBtn1.click();
	}
}
