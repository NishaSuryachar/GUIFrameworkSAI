package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessorPage {

	
	@FindBy(xpath = "//h6[text()='hp']/following-sibling::input[1]")
	private WebElement QuantityEdt;
	
	@FindBy(xpath = "//h6[text()='hp']/following-sibling::input[4]")
	private WebElement AddEdt;
	
	public ProcessorPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getQuantityEdt() {
		return QuantityEdt;
	}

	public WebElement getAddEdt() {
		return AddEdt;
	}
	
}
