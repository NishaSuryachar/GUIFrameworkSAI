package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class LoginPage extends WebDriverUtility{                              // Rule-1  create a separte java class
                           
	WebDriver driver;
	 public LoginPage(WebDriver driver) {             //Rule 3 : Object Initialization
		
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	                           
	@FindBy(name="user")                        // Rule-2 Object Creation
	private WebElement usernameEdt;
	
	@FindBy(name="password")
	private WebElement passwordEdt;
	
	@FindBy(name = "btnlogin")
	private WebElement loginBtn;
	     
	
	                                             
	public WebElement getUsernameEdt() {            //Rule-4 : Object Encapsulation
		return usernameEdt;                        //Rule-5 : Object Utilization
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
/**
 *  login to application based username , password , url argumnets 
 * @param url
 * @param username
 * @param password
 * @throws Throwable 
 */
	 public void loginToappAsAdmin(String url,String username,String password) throws Throwable {
		
		 
		 waitForPageToLoad(driver);
		 driver.get(url);	
		 driver.manage().window().maximize();
		 usernameEdt.sendKeys(username);
		 passwordEdt.sendKeys(password);
		 loginBtn.click();
		 driver.switchTo().alert().accept();
	 }
 public void loginToappAsAdmin1() throws Throwable {
		
	 FileUtility flib=new FileUtility();
	 String URL=flib.getDataFromPropertiesFile("url");
	 String USERNAME=flib.getDataFromPropertiesFile("username");
	 String PASSWORD=flib.getDataFromPropertiesFile("password");
		 waitForPageToLoad(driver);
		 driver.get(URL);	
		 driver.manage().window().maximize();
		 usernameEdt.sendKeys(USERNAME);
		 passwordEdt.sendKeys(PASSWORD);
		 loginBtn.click();
		 driver.switchTo().alert().accept();
	 }
	
 public void loginToappAsUser() throws Throwable {
		 
		 FileUtility flib=new FileUtility();
		 String URL=flib.getDataFromPropertiesFile("url");
		 String USERNAME=flib.getDataFromPropertiesFile("userusername");
		 String PASSWORD=flib.getDataFromPropertiesFile("userpassword");
		 waitForPageToLoad(driver);
		 driver.get(URL);	
		 driver.manage().window().maximize();
		 usernameEdt.sendKeys(USERNAME);
		 passwordEdt.sendKeys(PASSWORD);
		 loginBtn.click();
		 driver.switchTo().alert().accept();
	 }
	
	
}
