package com.storedemoqa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageFooter extends PageHeader {
	@FindBy(xpath = ".//a[text()='SP Home']")
	WebElement spHome;
	@FindBy(xpath = ".//a[text()='Sample Page']")
	WebElement samplePage;
	@FindBy(xpath = ".//a[text()='Your Account']")
	WebElement yourAccount;

	public void clickSpHomeLink() {
		wait.until(ExpectedConditions.visibilityOf(spHome));
		spHome.click();
	}

	public SamplePageObject clickSamplePageLink() {
		SamplePageObject samplePageOject = new SamplePageObject();
		wait.until(ExpectedConditions.visibilityOf(samplePage));
		samplePage.click();
		return samplePageOject;
	}

	public YourAccountPageObject clickYourAccountLink() {
		YourAccountPageObject yourAccountPageObject = new YourAccountPageObject();
		wait.until(ExpectedConditions.elementToBeClickable(yourAccount));
		yourAccount.click();
		return yourAccountPageObject;
	}
}
