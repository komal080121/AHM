package com.ahm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.browser.BaseClass;
import com.test.pageobject.LoginPage;

public class TestCase_Login extends BaseClass{

	@Test
	public void user_login() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        login.enterUserName("komal_athlete");
        login.enterPassword("Komal@123");
        login.clickOnSignInBtn();
    	WebElement verifyLogin = driver.findElement(By.xpath("//span[text()=\"Athlete Health\"]"));
    	if(verifyLogin.isDisplayed()) {
    		System.out.println("Login successfull");
    	}
    	else {
    		System.out.println("Login failed");
    	}
	}
}
