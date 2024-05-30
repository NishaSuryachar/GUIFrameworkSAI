package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserPage {
	WebDriver driver;
	public EditUserPage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	// input[@value='firstname']
	
	@FindBy(xpath="// button[@class='btn btn-warning btn-block']")
	private WebElement updateBtn;
	
	public WebElement getUpdateBtn() {
		return updateBtn;
	}
	
	
}
