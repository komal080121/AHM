package com.ahm.testcases;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.browser.BaseClass;
import com.test.pageobject.DashboardPage;
import com.test.pageobject.InjuryReport;

public class TestCase_CreateInjuryReport extends BaseClass{

	@Test
	public void create_injuryReport() throws InterruptedException {
		TestCase_Login login = new TestCase_Login();
		login.user_login();
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		dashboardPage.clickOnOpenDrawer();
		Thread.sleep(1000);
		dashboardPage.clickOnInjuryReport();
		
		InjuryReport report = PageFactory.initElements(driver, InjuryReport.class);
		report.clickOnCreateReportBtn();
		report.enterTextIndescription("test the injury report");
		report.clickOnSaveBtn();
	}
}
