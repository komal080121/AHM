package com.ahm.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.browser.BaseClass;
import com.test.pageobject.AppointmentPage;
import com.test.pageobject.DashboardPage;
import com.test.pageobject.LoginPage;

public class TestCase_physio_CreateAppointment extends BaseClass {

	@Test
	public void create_NewAppointment_offline() throws InterruptedException {
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
		dashboardPage.clickonAppointmentsBtn();

		AppointmentPage appointmentPage = PageFactory.initElements(driver, AppointmentPage.class);
		appointmentPage.clickonCreateAppointmentBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		appointmentPage.clickOnAthlete();
		appointmentPage.selectAthleteFromDropdown();
		appointmentPage.enterDescription("test the appointment by automation");
		appointmentPage.clickOnTime();
		appointmentPage.selectStartTime();
		appointmentPage.clickOnDuration();
		appointmentPage.selectDuration();
		appointmentPage.clickOnSaveBtn();

	}

	@Test
	public void create_NewAppointment_online() throws InterruptedException {
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
		dashboardPage.clickonAppointmentsBtn();

		AppointmentPage appointmentPage = PageFactory.initElements(driver, AppointmentPage.class);
		appointmentPage.clickonCreateAppointmentBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		appointmentPage.clickOnAthlete();
		appointmentPage.selectAthleteFromDropdown();
		appointmentPage.clickOnOnlineAppCheckbox();
		appointmentPage.enterDescription("test the appointment by automation");
		appointmentPage.clickOnTime();
		appointmentPage.selectStartTime();
		appointmentPage.clickOnDuration();
		appointmentPage.selectDuration();
		appointmentPage.clickOnSaveBtn();

	}
}
