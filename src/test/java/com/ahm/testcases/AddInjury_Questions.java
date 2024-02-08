package com.ahm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.browser.BaseClass;
import com.test.pageobject.DashboardPage;
import com.test.pageobject.InjuryQuestionPage;
import com.test.pageobject.LoginPage;

public class AddInjury_Questions extends BaseClass{

	@Test
	public void add_Injury_Question() throws InterruptedException {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        login.enterUserName("Komal-admin");
        login.enterPassword("Komal@123");
        login.clickOnSignInBtn();
    	WebElement verifyLogin = driver.findElement(By.xpath("//span[text()=\"Users\"]"));
    	if(verifyLogin.isDisplayed()) {
    		System.out.println("Login successfull");
    	}
    	else {
    		System.out.println("Login failed");
    	}
    	
    	
    	DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
    	dashboard.clickOnOpenDrawer();
    	Thread.sleep(1000);
    	dashboard.clickOnInjuryQuestions();
    	
    	InjuryQuestionPage injuryQuestion = PageFactory.initElements(driver, InjuryQuestionPage.class);
    	injuryQuestion.clickOnAddQuestionBtn();
    	injuryQuestion.enterQuestion("Question_MultipleChoice_0702");
    	injuryQuestion.enterTextInOption("test 1");
    	injuryQuestion.clickOnAddQueBtn();
    	driver.navigate().refresh();
	}
}
