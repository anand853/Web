package com.access.ipages;

public interface iPage {

	public void accessURL(String url);

	public String getWebPageURL();

	void click(String el);

	void clear(String el);

	String getText(String el);

	void sendKeys(String element, String text);

}
