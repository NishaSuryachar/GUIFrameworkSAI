package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class EditUserPage extends WebDriverUtility{
	WebDriver driver;
	public EditUserPage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	// input[@value='firstname']
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailEdt;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//select[@name='gender']")
	private WebElement genderEdt;
	
	@FindBy(xpath="// button[@class='btn btn-warning btn-block']")
	private WebElement updateBtn;
	
	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getGenderEdt() {
		return genderEdt;
	}
	
	public void EditUserDetails(String gender,String email,String password)
	{
		Select s=new Select(genderEdt);
		s.selectByVisibleText(gender);
		passwordEdt.sendKeys(password);
		emailEdt.sendKeys(email);
		updateBtn.click();
		switchtoAlertAndAccept(driver);
		
	}
	
}
