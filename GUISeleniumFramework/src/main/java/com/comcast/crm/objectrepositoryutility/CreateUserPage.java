package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPage {

	WebDriver driver;
	public CreateUserPage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(name="empid")
	private WebElement EmpDrp;
	
	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="password")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//div[@class='modal fade show']//div//div//div[2]//button[1]") ////form[@action='us_transac.php?action=add']/button[1]
	private WebElement saveUserBtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmpDrp() {
		return EmpDrp;
	}

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getSaveUserBtn() {
		return saveUserBtn;
	}
	
	
}
