package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserPage {

	WebDriver driver;
	public UserPage(WebDriver driver) {             //Rule 3 : Object Initialization
    this.driver = driver;
    PageFactory.initElements(driver, this);
	 }
	
	
	@FindBy(xpath = "//a[text()='Keyboard']")
	private WebElement keyboardTabEdt;
	
	@FindBy(xpath = "//a[text()='Motherboard']")
	private WebElement MotherBoardEdt;
	
	@FindBy(xpath = "//a[text()='Mouse']")
	private WebElement MouseEdt;
	
	@FindBy(xpath = "//a[text()='Headset']")
	private WebElement HeadsetEdt;
	
	@FindBy(xpath = "//a[text()='Processor']")
	private WebElement ProcessorEdt;
	
	
	@FindBy(xpath="(//input[@name='quantity'])[1]")
	private WebElement quantityEdt;

	@FindBy(xpath="//input[@name='addpos']")
	private WebElement addBtn;
	
	@FindBy(id="userDropdown")
	private WebElement ProfileImgEdt;
	
	@FindBy(xpath = "//a[@data-target='#logoutModal']")
	private WebElement logoutBtn;
	
	@FindBy(xpath ="//div[@class='modal-footer']")
	private WebElement logout;
	
	@FindBy(xpath = "//select[@name='customer']")
	private WebElement customerDropDown;
	
	@FindBy(xpath = "//button[@data-toggle='modal']")
	private WebElement SubmitBtn;
	
	
	@FindBy(xpath = "(//a[@data-toggle='modal'])[3]")
	private WebElement createCustomerEdt;
	
	
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

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}
	
	
	
	public WebElement getCreateCustomerEdt() {
		return createCustomerEdt;
	}

	public WebElement getMouseEdt() {
		return MouseEdt;
	}

	public WebElement getHeadsetEdt() {
		return HeadsetEdt;
	}

	public WebElement getProcessorEdt() {
		return ProcessorEdt;
	}

	public WebElement getMotherBoardEdt() {
		return MotherBoardEdt;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	public void selectUserFROMdropDown(String text)
	{
		Select s=new Select(customerDropDown);
		s.selectByVisibleText(text);
		
	}
	
}
