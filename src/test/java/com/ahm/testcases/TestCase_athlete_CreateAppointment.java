package com.ahm.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.browser.BaseClass;
import com.test.pageobject.AppointmentPage;
import com.test.pageobject.DashboardPage;
import com.test.pageobject.LoginPage;

public class TestCase_athlete_CreateAppointment extends BaseClass {

	@Test
	public void athlete_Create_NewAppointment() throws InterruptedException {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("Komal_athlete");
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
		dashboardPage.clickonAppointmentsBtn();

		AppointmentPage appointmentPage = PageFactory.initElements(driver, AppointmentPage.class);
		appointmentPage.clickonCreateAppointmentBtn();
		appointmentPage.enterAthleteDescription("test the automated appointment by athlete");
		appointmentPage.clickOnPhysio();
		appointmentPage.selectPhysioFromDropdown();
		appointmentPage.clickOnAthleteStratTime();
		appointmentPage.selectStartTime();
		appointmentPage.clickOnDuration();
		appointmentPage.selectDuration();
		appointmentPage.clickOnSaveBtn();
	}

	@Test
	public void athlete_Create_Online_NewAppointment() throws InterruptedException {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("Komal_athlete");
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
		dashboardPage.clickonAppointmentsBtn();

		AppointmentPage appointmentPage = PageFactory.initElements(driver, AppointmentPage.class);
		appointmentPage.clickonCreateAppointmentBtn();
		appointmentPage.enterAthleteDescription("test the automated appointment by athlete");
		appointmentPage.clickOnPhysio();
		appointmentPage.selectPhysioFromDropdown();
		appointmentPage.clickOnAthleteStratTime();
		appointmentPage.selectStartTime();
		appointmentPage.clickOnDuration();
		appointmentPage.selectDuration();
		appointmentPage.clickOnOnlineAppCheckbox();
		appointmentPage.clickOnSaveBtn();
		Thread.sleep(1000);
		appointmentPage.clickOnAttendBtn();
		appointmentPage.clickOnJoinBtn();
	}
}
