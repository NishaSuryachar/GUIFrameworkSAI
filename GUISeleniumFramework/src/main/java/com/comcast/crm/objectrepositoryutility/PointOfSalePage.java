package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PointOfSalePage {

	    WebDriver driver;
		public PointOfSalePage(WebDriver driver) {             //Rule 3 : Object Initialization
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
		 }
		
		@FindBy(name="customer")
		private WebElement customerDropDown;
		
		@FindBy(xpath="//button[text()='SUBMIT']")
		private WebElement submitBtn;
		
		@FindBy(xpath="//a[@type='button']")
		private WebElement createCustomerBtn;
		
         @FindBy(xpath = "//i[@class='fas fa-fw fa-trash']")
         private WebElement deleteBtn;
         
         @FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div[2]/div[1]/div/form/table/tbody/tr[2]/td[1]")
         private WebElement productBtn;
         
	
		public WebElement getCreateCustomerBtn() {
			return createCustomerBtn;
		}

		public WebElement getCustomerDropDown() {
			return customerDropDown;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}

		public WebElement getDeleteBtn() {
			return deleteBtn;
		}

		public void setDeleteBtn(WebElement deleteBtn) {
			this.deleteBtn = deleteBtn;
		}

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getProductBtn() {
			return productBtn;
		}
		
		
		
		public void SelectCustomerDropDown(String text)
		{
			Select s=new Select(customerDropDown);
			s.selectByValue(text);
		}
		
	
}
