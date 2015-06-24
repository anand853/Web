package com.access.ipages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webdriver.baseImp.CheckBoxImpl;
import com.webdriver.baseImp.DriverImpl;
import com.webdriver.baseImp.PageImpl;
import com.access.fb.FbConstants;

public class PageAccessImp {

	static DriverImpl driver;
	static PageImpl page;
	static WebElement element;
	static CheckBoxImpl cim;

	public static void main(String[] ar) {

		PageAccessImp.accesstoPage();
		PageAccessImp.fillUNamePass();
		PageAccessImp.checkRemindMe();
		PageAccessImp.submitPage();

	}

	private static void submitPage() {
		element = driver.getInstance().findElement(
				By.id(FbConstants.BTN_SUBMIT));
		element.click();

	}

	private static void checkRemindMe() {

		driver.getInstance();
		// WebElement sm = new CheckBoxImpl();
		// sm.isDisabled("persist_box");

	}

	private static void fillUNamePass() {
		element = driver.getInstance().findElement(
				By.id(FbConstants.ID_EMAIL_ID));
		element.sendKeys(FbConstants.Email_ID_VALUE);

		element = driver.getInstance().findElement(
				By.id(FbConstants.ID_PASSWORD));
		element.sendKeys(FbConstants.PASSWORD_VALUE);

	}

	private static void accesstoPage() {
		driver = new DriverImpl();
		driver.getInstance();
		driver.get(FbConstants.URL);
		driver.maximizeWindow();

	}
}
