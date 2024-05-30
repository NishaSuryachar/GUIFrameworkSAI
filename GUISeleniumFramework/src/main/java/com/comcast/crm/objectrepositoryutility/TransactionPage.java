package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionPage {

	WebDriver driver;
	public TransactionPage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath="// input[@type='search']")
	private WebElement searchEdt;
	
	
	public WebElement getSearchEdt() {
		return searchEdt;
	}
	
	
	
	
	//transaction view;  //td[text()='      ']/following-sibling::td[2]
}
