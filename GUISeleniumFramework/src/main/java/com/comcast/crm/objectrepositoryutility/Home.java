package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class Home extends WebDriverUtility{                             
                           
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Home']")
	private WebElement HomeEdt;
	
	@FindBy(xpath = "//span[text()='Customer']")
	private WebElement customerEdt;
	
	@FindBy(xpath = "//span[text()='Employee']")
	private WebElement employeeEdt;
	
	@FindBy(xpath = "//span[text()='Product']")
	private WebElement productEdt;
	
	@FindBy(xpath="//span[text()='Inventory']")
	private WebElement InventoryEdt;
	
	@FindBy(xpath = "//span[text()='Transaction']")
	private WebElement transactionEdt;
	
	@FindBy(xpath = "//span[text()='Supplier']")
	private WebElement supplierEdt;
	
	@FindBy(xpath = "//span[text()='Accounts']")
	private WebElement AccountsEdt;
	
	@FindBy(xpath = "//img[@class='img-profile rounded-circle']")
	private WebElement profileImg;
	
	@FindBy(xpath = "//a[@data-target='#logoutModal']")
	private WebElement LogoutEdt;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement LogoutPopUpBtn;
	
	 public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHomeEdt() {
		return HomeEdt;
	}
	public WebElement getCustomerEdt() {
		return customerEdt;
	}
	public WebElement getEmployeeEdt() {
		return employeeEdt;
	}
	public WebElement getProductEdt() {
		return productEdt;
	}
	public WebElement getInventoryEdt() {
		return InventoryEdt;
	}
	public WebElement getTransactionEdt() {
		return transactionEdt;
	}
	public WebElement getSupplierEdt() {
		return supplierEdt;
	}
	public WebElement getAccountsEdt() {
		return AccountsEdt;
	}
	public WebElement getProfileImg() {
		return profileImg;
	}
	public WebElement getLogoutEdt() {
		return LogoutEdt;
	}
	public WebElement getLogoutPopUpBtn() {
		return LogoutPopUpBtn;
	}
	public Home(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	
	/**
	 * this method contains implementation for Logout
	 */
	public void logout() {
		
		//switchtoAlertAndAccept(driver);
		profileImg.click();
		mousemoveOnElement(driver, LogoutEdt);
		LogoutEdt.click();
		switchtoAlertAndAccept(driver);
	}

	

	
	
}
