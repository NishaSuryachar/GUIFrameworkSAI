package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {

	WebDriver driver;
	public AccountsPage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }

	@FindBy(xpath="//a[@href='us_searchfrm.php?action=edit & id=1']")
	private WebElement adminDetailsBtn;
	
	@FindBy(xpath="//a[@class='btn btn-primary bg-gradient-primary dropdown no-arrow']")
	private WebElement adminEllipsisBtn;
	
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement createUserBtn;
	
	private WebElement searchUserEdt;
	public WebElement getAdminDetailsBtn() {
		return adminDetailsBtn;
	}

	public WebElement getAdminEllipsisBtn() {
		return adminEllipsisBtn;
	}

	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}

	public WebElement getSearchUserEdt() {
		return searchUserEdt;
	}
	
	//user details:  //td[text()='Moni Empinado']/following-sibling::td[3]/div[1]/a[1]
	//user ellipses: //td[text()='Moni Empinado']/following-sibling::td[3]/div[1]/div[1]
	//user edit: //table[@class='table table-bordered']/descendant::i[@class='fas fa-fw fa-edit'][2]
		
	
}
