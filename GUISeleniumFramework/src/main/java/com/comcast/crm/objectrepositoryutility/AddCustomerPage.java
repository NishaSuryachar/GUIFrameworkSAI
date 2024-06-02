package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class AddCustomerPage extends WebDriverUtility{

	WebDriver driver;
	@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/child::div[1]/child::input")
	private WebElement firstnameEdt;
	
	@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/child::div[2]/child::input")
	private WebElement lastnameEdt;
	
	@FindBy(xpath  = "//form[@action='cust_pos_trans.php?action=add']/child::div[3]/child::input")
	private WebElement phonenumberEdt;
	
	@FindBy(xpath = "(//i[@class='fa fa-check fa-fw'])[2]")
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
	
	public void AddCustomer(String firstname,String lastname,String phoneNumber) throws InterruptedException
	{
		firstnameEdt.sendKeys(firstname);
		lastnameEdt.sendKeys(lastname);
		phonenumberEdt.sendKeys(phoneNumber);
		saveBtn.click();
	}
}
