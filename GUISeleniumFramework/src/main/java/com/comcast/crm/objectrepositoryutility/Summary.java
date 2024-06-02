package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {

	@FindBy(xpath ="//h3[@class='py-0']/following-sibling::h3[1]")
	private WebElement grandToatalEdt;
	
	@FindBy(xpath="//button[.='PROCEED TO PAYMENT']")
	private WebElement paymentBtn;
	
	@FindBy(id="txtNumber")
	private WebElement enterCashTxt;
	
	
	public Summary(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getEnterCashTxt() {
		return enterCashTxt;
	}

	public WebElement getPaymentBtn() {
		return paymentBtn;
	}

	public WebElement getGrandToatalEdt() {
		return grandToatalEdt;
	}

	

}
