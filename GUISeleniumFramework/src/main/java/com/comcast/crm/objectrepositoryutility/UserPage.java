package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	WebDriver driver;
	public UserPage(WebDriver driver) {             //Rule 3 : Object Initialization
    this.driver = driver;
    PageFactory.initElements(driver, this);
	 }
	
	
	@FindBy(linkText = "Keyboard")
	private WebElement keyboardTabEdt;
	
	@FindBy(xpath="//input[@name='addpos']")
	private WebElement quantityEdt;

	@FindBy(xpath="//input[@name='addpos']")
	private WebElement addBtn;
	
	@FindBy(id="userDropdown")
	private WebElement ProfileImgEdt;
	
	@FindBy(xpath = "//a[@data-target='#logoutModal']")
	private WebElement logoutBtn;
	
	@FindBy(xpath ="//div[@class='modal-footer']")
	private WebElement logout;
	
	public WebElement getProfileImgEdt() {
		return ProfileImgEdt;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getQuantityEdt() {
		return quantityEdt;
	}

	public WebElement getKeyboardTabEdt() {
		return keyboardTabEdt;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}
	
}
