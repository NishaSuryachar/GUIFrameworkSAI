package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstnameEdt;
	
	@FindBy(name = "lastname")
	private WebElement lastnameEdt;
	
	@FindBy(name = "phonenumber")
	private WebElement phonenumberEdt;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;
	
	public AddCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstnameEdt() {
		return firstnameEdt;
	}

	public WebElement getLastnameEdt() {
		return lastnameEdt;
	}

	public WebElement getPhonenumberEdt() {
		return phonenumberEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void AddCustomer(String firstname,String lastname,String phoneNumber)
	{
		firstnameEdt.sendKeys(firstname);
		lastnameEdt.sendKeys(lastname);
		phonenumberEdt.sendKeys(phoneNumber);
		saveBtn.click();
	}
}
