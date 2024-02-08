package com.ahm.testcases;

import java.time.Duration;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.test.browser.BaseClass;
import com.test.pageobject.DashboardPage;
import com.test.pageobject.LoginPage;
import com.test.pageobject.OrganizationPage;
import com.test.pageobject.ProfilePage;
import com.test.pageobject.UsersPage;
import com.test.pageobject.WorkHoursPage;

public class TestCase_Physio_AddWorkHours extends BaseClass {

	public String usernameString = "null";

	@Test
	public void invite_User() throws InterruptedException {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("Komal-admin");
		loginPage.enterPassword("Komal@123");
		loginPage.clickOnSignInBtn();
		WebElement verifyLogin = driver.findElement(By.xpath("//span[text()=\"Users\"]"));
		if (verifyLogin.isDisplayed()) {
			System.out.println("Login successfull");
		} else {
			System.out.println("Login failed");
		}

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.clickOnOpenDrawer();
		// dashboardPage.clickOnUsersTab();
		Thread.sleep(2000);
		UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
		usersPage.clickOnInviteUserBtn();
		Faker faker = new Faker(new Locale("IN"));
		usersPage.enterFirstName(faker.name().firstName());
		usersPage.enterLastName(faker.name().lastName());
		String fnameString = usersPage.getFirstName();
		usersPage.enterEmailId("komal.jadhav+" + fnameString + "@anveshak.com");
		usersPage.enterPhoneNo(faker.phoneNumber().cellPhone());
		usersPage.enterUserName(fnameString+"_physiotherapist");
		usernameString = usersPage.getUserName();
		usersPage.clickOnUserType();
		usersPage.selectPhysioTherapist();
		usersPage.enterPassword("Komal@12");
		usersPage.entercPassword("Komal@12");
		usersPage.clickOnInviteUserBtn1();
		// Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		dashboardPage.cllickOnProfileBtn();
		dashboardPage.clickOnLogOutBtn();
	}

	@Test
	public void physio_addWorkHours() throws InterruptedException {
		Thread.sleep(3000);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(usernameString);
		loginPage.enterPassword("Komal@12");
		loginPage.clickOnSignInBtn();
		loginPage.enterNewPassword("Komal@123");
		loginPage.entercfnpassword("Komal@123");
		loginPage.clickOnSubmitBtn();
		WebElement verifyLogin = driver.findElement(By.xpath("//span[text()=\"Athlete Health\"]"));
		if (verifyLogin.isDisplayed()) {
			System.out.println("Login successfull");
		} else {
			System.out.println("Login failed");
		}

		Thread.sleep(3000);
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.clickonLetsStartBtn();

		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.clickOnGender();
		profilePage.selectGender();
		profilePage.clickOnCalendar();
		profilePage.selectDate();
		profilePage.enterZipCode("411045");
		profilePage.clickOnSaveChangeBtn();

		OrganizationPage organizationPage = PageFactory.initElements(driver, OrganizationPage.class);
		organizationPage.clickOnNextBtn();
		organizationPage.enterInviteCode("Komal_Group_12");
		organizationPage.clickOnJoinNowBtn();
		organizationPage.clickOnTeamsNextBtn();
		organizationPage.clickOnJoinCricketTeamBtn();
		Thread.sleep(1000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		organizationPage.clickOnTourNextBtn();
		organizationPage.clickOnOpenDrawer();
		organizationPage.clickOnNextBtn1();
		organizationPage.clickOnNextBtn1();
		organizationPage.clickOnNextBtn1();
		organizationPage.clickOnNextBtn1();
		organizationPage.clickOnNextBtn1();
		organizationPage.clickOnNextBtn1();
		organizationPage.clickOnNextBtn1();
		organizationPage.clickOnNextBtn1();
		organizationPage.clickOnNextBtn1();
		WorkHoursPage workHoursPage = PageFactory.initElements(driver, WorkHoursPage.class);
		workHoursPage.clickOnWorkHoursBtn();
        driver.navigate().refresh();
		workHoursPage.clickOnAddWorkHoursBtn();
		workHoursPage.clickOnStartTime();
		workHoursPage.selectStartTime();
		workHoursPage.clickOnEndTime();
		workHoursPage.selectEndTime();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		workHoursPage.clickOnSaveChangeBtn();
	}
}
