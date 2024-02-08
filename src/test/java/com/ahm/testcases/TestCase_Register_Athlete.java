package com.ahm.testcases;

import java.util.Locale;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.test.browser.BaseClass;
import com.test.pageobject.RegisterPage;

public class TestCase_Register_Athlete extends BaseClass {

	@Test
	public void register_athlete() {

		RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
		registerPage.clickOnRegisterBtn();
		Faker faker = new Faker(new Locale("IN"));
		registerPage.enterFirstName(faker.name().firstName());
		registerPage.enterLastName(faker.name().lastName());
		String fnameString = registerPage.getFirstName();
		registerPage.enterUserName(fnameString + "_athlete");
		registerPage.enterEmailAddress("komal.jadhav+" + fnameString + "@anveshak.com");
		registerPage.enterPassword("Komal@123");
		registerPage.enterCPassword("Komal@123");
		registerPage.enterPhoneNo(faker.phoneNumber().cellPhone());
		registerPage.clickOnTermsCheckbox();
		registerPage.clickOnRegisterBtn1();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(
				"https://outlook.office.com/mail/inbox/id/AAQkADZkNzRmYTU1LTNiMWItNGNjZC1iYjJjLTgxZGU1MjZhNzkwMwAQAF2jaCqtIOdFgyrx2K6av%2Bk%3D");

	}

}
