package com.demoqa.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface DriverSetup {
	public WebDriver getWebDriverObject(DesiredCapabilities desiredCapabilities);

	public DesiredCapabilities getDesiredCapabilities();
}
