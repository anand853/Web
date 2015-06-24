package com.webdriver.baseImp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.access.ipages.iDriver;

public class DriverImpl implements iDriver {

	WebDriver driver;
	WebElement element;

	public DriverImpl() {

	}

	@Override
	public void maximizeWindow() {
		driver.manage().window().maximize();

	}

	@Override
	public void minimizeWindow() {
		driver.manage().window().maximize();

	}

	@Override
	public void driverShutDown() {
		driver.quit();

	}

	@Override
	public void driverClose() {
		driver.close();

	}

	public WebDriver getInstance() {
		if (driver == null) {
			driver = new FirefoxDriver();
		} else {
			return driver;
		}
		return driver;
	}

	@Override
	public void get(String url) {
		driver.get(url);

	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageSource() {

		return driver.getPageSource();
	}

}
