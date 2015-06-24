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
	public boolean isSelectedById(String id) {
		element = driver.findElement(By.id(id));
		boolean isSelected = false;
		isSelected = element.isSelected();
		return isSelected;
	}

	@Override
	public boolean isEnabledById(String id) {
		boolean isEnabled = false;
		element = driver.findElement(By.id(id));
		isEnabled = element.isEnabled();
		return isEnabled;

	}

	@Override
	public boolean isDisabledById(String id) {
		boolean isDisabled = false;
		element = driver.findElement(By.id(id));
		isDisabled = element.isDisplayed();
		System.out.println("h");
		return isDisabled;

	}

	@Override
	public boolean isItCheckedById(String id) {
		boolean isItChecked = false;
		element = driver.findElement(By.id(id));
		element.isSelected();
		return isItChecked;
	}

	@Override
	public void doUnCheckById(String id) {
		if (element.isSelected()) {
			element.click();
		} else {

		}

	}

	@Override
	public void doCheckById(String id) {
		if (element.isSelected()) {

		} else {
			element.click();
		}

	}

	@Override
	public boolean isEnabledByName(String name) {
		boolean isEnabled = false;
		element = driver.findElement(By.name(name));
		isEnabled = element.isEnabled();
		return isEnabled;
	}

	@Override
	public boolean isDisabledByName(String name) {
		boolean isDisabled = false;
		element = driver.findElement(By.name(name));
		isDisabled = element.isDisplayed();
		return isDisabled;
	}

	@Override
	public boolean isItCheckedByName(String name) {
		boolean isItChecked = false;
		element = driver.findElement(By.name(name));
		isItChecked = element.isSelected();
		return isItChecked;
	}

	@Override
	public void doUnCheckByName(String name) {

		if (element.isSelected()) {
			element.click();
		} else {

		}

	}

	@Override
	public void doCheckByName(String name) {
		if (element.isSelected()) {

		} else
			element.click();
	}

	@Override
	public boolean isSelectedByName(String name) {

		element = driver.findElement(By.name(name));
		if (element.isSelected()) {

		} else
			element.click();
		return false;
	}

}
