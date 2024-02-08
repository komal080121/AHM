package com.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InjuryQuestionPage {

	
	@FindBy(xpath = "//button[text() = \"Add Question\"]")
	WebElement addQuestionBtn;
	public void clickOnAddQuestionBtn() {
		addQuestionBtn.click();
	}
	
	
	@FindBy(xpath = "//input[@name = \"question\"]")
	WebElement question;
	public void  enterQuestion(String que) {
		question.sendKeys(que);
	}
	
	
	@FindBy(xpath = "//input[@placeholder=\"Option 1\"]")
	WebElement optionText;
	public void enterTextInOption(String text) {
		optionText.sendKeys(text);
	}
	
	
	@FindBy(xpath = "(//button[text() =\"Add Question\"])[2]")
	WebElement addqueBtn;
	public void clickOnAddQueBtn() {
		addqueBtn.click();
	}
}
