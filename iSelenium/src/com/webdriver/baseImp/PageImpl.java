package com.webdriver.baseImp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.access.ipages.iPage;

public class PageImpl implements iPage {

	WebDriver driver;
	WebElement element;

	public PageImpl() {

	}

	@Override
	public void accessURL(String url) {
		driver.get(url);

	}

	@Override
	public void click(String el) {
		element = driver.findElement(By.id(el));
		element.click();

	}

	@Override
	public void clear(String el) {
		element = driver.findElement(By.id(el));
		element.clear();

	}

	@Override
	public String getWebPageURL() {

		String url = driver.getCurrentUrl();
		return url;
	}

	@Override
	public void sendKeys(String element, String text) {
		WebElement e = driver.findElement(By.id(element));
		e.sendKeys(text);

	}

	@Override
	public String getText(String el) {

		element = driver.findElement(By.id(el));
		return element.getText();
	}

	

}
