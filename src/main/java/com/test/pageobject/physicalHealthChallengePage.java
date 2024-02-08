package com.test.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.browser.BaseClass;

public class physicalHealthChallengePage extends BaseClass{

	@FindBy(xpath = "//button[text() = \"Create New Test\"]")
	WebElement createNewTestBtn;
	public void clickOnCreateTestBtn() {
		createNewTestBtn.click();
	}
	
	
	@FindBy(xpath = "//div[@id=\"Select-Athlete\"]")
	WebElement clickAthlete;
	public void clickOnAthltete() {
		clickAthlete.click();
	}
	
	
    @FindBy(xpath = "//li[text() = \"komal  athlete\"]")	
	WebElement selectathlete;
    public void selectAthleteFromDropdown() {
    	selectathlete.click();
    }
    
    
    @FindBy(xpath = "//button[text() = \"Proceed\"]")
    WebElement proceedBtn;
    public void clickOnProceedBtn() {
    	proceedBtn.click();
    }
    
    
    @FindBy(xpath = "//button[text() = \"Start Test\"]")
    WebElement startTestBtn;
    public void clickOnStartTestBtn() {
    	startTestBtn.click();
    }
    
    
    @FindBy(xpath = "//div[text() =\"0\"]")
    WebElement scoreClick;
    public void clickOnScore() {
    	scoreClick.click();
    }
    
    @FindBy(xpath = "//li[text() = \"7\"]")
    WebElement scoreSelect;
    public void selectTestScore() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", scoreSelect);
    	scoreSelect.click();
    }
    
    
    @FindBy(xpath = "//button[text() = \"Give Test Score\"]")
    WebElement getTestScoreBtn;
    public void clickOnGetTestScoreBtn() {
    	getTestScoreBtn.click();
    }
    
    
    @FindBy(xpath = "//button[text() = \"Okay\"]")
    WebElement okayBtn;
    public void clickOnOkayBtn() {
    	okayBtn.click();
    }
}
