package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProductPage {

	@FindBy(xpath = "(//i[@class='fas fa-fw fa-trash'])[1]")
	private WebElement prod1;
	
	@FindBy(xpath = "(//i[@class='fas fa-fw fa-trash'])[2]")
	private WebElement prod2;
	
	@FindBy(xpath = "(//i[@class='fas fa-fw fa-trash'])[3]")
	private WebElement prod3;
	
	public DeleteProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getProd1() {
		return prod1;
	}

	public WebElement getProd2() {
		return prod2;
	}

	public WebElement getProd3() {
		return prod3;
	}
	
	
	
	
}
