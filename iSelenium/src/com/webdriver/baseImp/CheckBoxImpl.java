package com.webdriver.baseImp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.access.ipages.iCheckBox;

public class CheckBoxImpl implements iCheckBox {
	static WebDriver driver;
	static String id;

	WebElement element = driver.findElement(By.id(id));

	@Override
	public boolean isSelected(String id) {
		element = driver.findElement(By.id(id));
		boolean isSelected = false;
		isSelected = element.isSelected();
		return isSelected;
	}

	@Override
	public boolean isEnabled(String id) {
		boolean isEnabled = false;
		isEnabled = element.isEnabled();
		return isEnabled;
	}

	@Override
	public boolean isDisabled(String id) {
		boolean isDisabled = false;
		isDisabled = element.isDisplayed();
		System.out.println("h");
		return isDisabled;

	}

	@Override
	public boolean isItChecked(String id) {
		boolean isItChecked = false;
		element.isSelected();
		return isItChecked;
	}

	@Override
	public void doUnCheck(String id) {
		if (element.isSelected()) {
			element.click();
		} else {

		}

	}

	@Override
	public void doCheck(String id) {
		if (element.isSelected()) {

		} else {
			element.click();
		}

	}

}
