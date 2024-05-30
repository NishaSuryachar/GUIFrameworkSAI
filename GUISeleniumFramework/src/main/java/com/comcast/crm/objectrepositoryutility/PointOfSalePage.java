package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		
		@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
		private WebElement createCustomerBtn;
		
		@FindBy(xpath="//button[.='PROCEED TO PAYMENT']")
		private WebElement paymentBtn;
		
		@FindBy(id="txtNumber")
		private WebElement enterCashTxt;
		
		@FindBy(name="total")
		private WebElement grandToatalEdt;
		

		public WebElement getGrandToatalEdt() {
			return grandToatalEdt;
		}

		public WebElement getEnterCashTxt() {
			return enterCashTxt;
		}

		public WebElement getPaymentBtn() {
			return paymentBtn;
		}

		public WebElement getCreateCustomerBtn() {
			return createCustomerBtn;
		}

		public WebElement getCustomerDropDown() {
			return customerDropDown;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}
	
}
