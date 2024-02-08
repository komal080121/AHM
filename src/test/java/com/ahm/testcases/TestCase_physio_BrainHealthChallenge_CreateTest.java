package com.ahm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.browser.BaseClass;
import com.test.pageobject.BrainHealthChallengePage;
import com.test.pageobject.DashboardPage;
import com.test.pageobject.LoginPage;

public class TestCase_physio_BrainHealthChallenge_CreateTest extends BaseClass {

	@Test
	public void brainhealthChallenge_createNewTest() throws InterruptedException {

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("Komal_physiotherapist");
		loginPage.enterPassword("Komal@123");
		loginPage.clickOnSignInBtn();
		WebElement verifyLogin = driver.findElement(By.xpath("//span[text()=\"Athlete Health\"]"));
		if (verifyLogin.isDisplayed()) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login Failed");
		}

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.clickOnOpenDrawer();
		Thread.sleep(2000);
		dashboardPage.clickOnBrainHealthBtn();

		BrainHealthChallengePage brainHealth = PageFactory.initElements(driver, BrainHealthChallengePage.class);
		brainHealth.clickOnCreateNewTestBtn();
		brainHealth.clickOnAthleteDropdown();
		brainHealth.selectAthleteFromDropdown();
		brainHealth.clickOnChallenge();
		brainHealth.selectChallengeFromDropdown();
		brainHealth.clickOnStartTestBtn();
		Thread.sleep(3000);
		brainHealth.clickOnGetTestScoreBtn();
		brainHealth.clickOnOkayBtn();
	}
}
