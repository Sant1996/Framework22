package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Logout [rashmi@dell.com]']")
	private WebElement lgout;
	
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement cmpgnMdl;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout() {
		lgout.click();
	}
	public void setCmpgnMdl(){
		cmpgnMdl.click();
	
	}

}