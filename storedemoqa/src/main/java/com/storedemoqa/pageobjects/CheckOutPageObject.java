package com.storedemoqa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckOutPageObject extends PageFooter {

	public CheckOutPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//a[text()='Magic Mouse']")
	WebElement magicMouse;
	@FindBy(xpath = ".//a[text()='iPhone 5']")
	WebElement iPhone;

	@FindBy(xpath = ".//input[@value='Remove'][@type='submit']")
	WebElement removeFromCart;

	public void verifyMagicMouseAddedToCart() {
		wait.until(ExpectedConditions.visibilityOf(magicMouse));
		wait.until(ExpectedConditions.visibilityOf(removeFromCart));
	}

	public void verifyIphoneAddedToCart() {
		wait.until(ExpectedConditions.visibilityOf(iPhone));
		wait.until(ExpectedConditions.visibilityOf(removeFromCart));
	}
}
