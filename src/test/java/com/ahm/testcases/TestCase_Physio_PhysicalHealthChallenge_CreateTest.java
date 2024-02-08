package com.ahm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.browser.BaseClass;
import com.test.pageobject.DashboardPage;
import com.test.pageobject.LoginPage;
import com.test.pageobject.physicalHealthChallengePage;

public class TestCase_Physio_PhysicalHealthChallenge_CreateTest extends BaseClass{

	@Test
	public void physicalhealthChallenge_createNewTest() throws InterruptedException {
		
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
		dashboardPage.clickOnPhysicalHealth();
		
		physicalHealthChallengePage physicalHealth = PageFactory.initElements(driver, physicalHealthChallengePage.class);
		physicalHealth.clickOnCreateTestBtn();
		physicalHealth.clickOnAthltete();
		physicalHealth.selectAthleteFromDropdown();
		physicalHealth.clickOnProceedBtn();
		physicalHealth.clickOnStartTestBtn();
		Thread.sleep(70000);
		physicalHealth.clickOnScore();
		physicalHealth.selectTestScore();
		physicalHealth.clickOnGetTestScoreBtn();
		physicalHealth.clickOnOkayBtn();		
	}
}
