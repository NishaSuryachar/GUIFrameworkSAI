package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class AddEmployeePage extends WebDriverUtility{

	@FindBy(xpath ="(//input[@placeholder='First Name'])[3]")
	private WebElement firstNameEdt;
	
	@FindBy(xpath="(//input[@name='lastname'])[3]")
	private WebElement lastnameEdt;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailEdt;
	
	@FindBy(xpath = "//*[@id=\"employeeModal\"]/div/div/div[2]/form/div[5]/input")
	private WebElement phonenumberEdt;
	
	@FindBy(name="gender")
	private WebElement genderEdt;

	@FindBy(xpath ="//select[@name='jobs']")
	private WebElement jobsEdt;
	
	@FindBy(id="province")
	private WebElement provinceEdt;
	
	@FindBy(name="city")
	private WebElement cityEdt;
	
	@FindBy(name = "hireddate")
	private WebElement hiredateEdt;
	
	public WebElement getHiredateEdt() {
		return hiredateEdt;
	}

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

	public WebElement getGenderEdt() {
		return genderEdt;
	}

	public WebElement getSaveBtnEdt() {
		return SaveBtnEdt;
	}
	
	public WebElement getJobsEdt() {
		return jobsEdt;
	}

	public WebElement getProvinceEdt() {
		return provinceEdt;
	}

	public WebElement getCityEdt() {
		return cityEdt;
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
	 * @throws InterruptedException 
	 */
	public void AddEmployeeForDropDown(String text1,String text2,String text3,String text4) throws InterruptedException
	{
		Select s1=new Select(genderEdt);
		s1.selectByVisibleText(text1);
		Select s2=new Select(jobsEdt);
		s2.selectByVisibleText(text2);
		Select s3=new Select(provinceEdt);
		s3.selectByVisibleText(text3);
		Select s4=new Select(cityEdt);
		s4.selectByVisibleText(text4);
		SaveBtnEdt.click();
	}
	
	
}
