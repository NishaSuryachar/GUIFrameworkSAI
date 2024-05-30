package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class AddEmployeePage extends WebDriverUtility{

	@FindBy(name="(//input[@placeholder='First Name'])[3]")
	private WebElement firstNameEdt;
	
	@FindBy(xpath="(//input[@name='lastname'])[3]")
	private WebElement lastnameEdt;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailEdt;
	
	@FindBy(xpath="(//input[@name='phonenumber'])[3]")
	private WebElement phonenumberEdt;

	@FindBy(xpath = "(//button[@class='btn btn-success'])[3]")
	private WebElement SaveBtnEdt;
	
	public AddEmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstNameEdt() {
		return firstNameEdt;
	}

	public WebElement getLastnameEdt() {
		return lastnameEdt;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPhonenumberEdt() {
		return phonenumberEdt;
	}

	public WebElement getSaveBtnEdt() {
		return SaveBtnEdt;
	}
	
	/**
	 * This method contains implemenatation for Add Employee Page
	 */
	public void AddEmployee(String firstname,String lastname,String email,String phoneNo)
	{
		firstNameEdt.sendKeys(firstname);
		lastnameEdt.sendKeys(lastname);
		emailEdt.sendKeys(email);
		phonenumberEdt.sendKeys(phoneNo);
	}
	
	/**
	 * This method contains implementation for drop down for Add Employee Page
	 */
	public void AddEmployee(WebElement ele1,String text1,WebElement ele2,String text2,WebElement ele3,String text3,WebElement ele4,String text4,WebElement e1,String d1,WebElement e2,String d2,WebElement e3,String d3)
	{
		select(ele1,text1);
		select(ele2, text2);
		select(ele3,text3);
		select(ele4,text4);
		e1.sendKeys(d1);
		e2.sendKeys(d2);
		e3.sendKeys(d3);
		SaveBtnEdt.click();
	}
	
	
}
