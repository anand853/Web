package com.access.ipages;

import org.openqa.selenium.WebDriver;

public interface iDriver {

	public void get(String url);

	public WebDriver getInstance();

	public void driverShutDown();

	public void driverClose();

	public void maximizeWindow();

	public void minimizeWindow();

	public String getPageTitle();

	public String getPageSource();

}
