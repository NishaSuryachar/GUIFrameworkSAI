package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

	@FindBy(xpath="//a[@data-target='#customerModal']")
	private WebElement createCustomerBtn;
	
	public CustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	
}
