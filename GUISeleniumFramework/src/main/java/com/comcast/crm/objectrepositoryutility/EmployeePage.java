package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

	@FindBy(xpath = "//a[@data-target='#employeeModal']")
	private WebElement createEmployeeBtn;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	private WebElement searchTextFieldEdt;
	
	public EmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateEmployeeBtn() {
		return createEmployeeBtn;
	}

	public WebElement getSearchTextFieldEdt() {
		return searchTextFieldEdt;
	}
	
	
	
	
}
