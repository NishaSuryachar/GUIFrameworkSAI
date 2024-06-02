package com.TradeGecko.BM.User;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.AddCustomerPage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.MousePage;
import com.comcast.crm.objectrepositoryutility.UserPage;

public class CreatingCustomerTest extends BaseClass {

	@Test(groups="RegressionTest")
	public void creatingCustomer() throws Throwable
	{
		String FIRSTNAME = eLib.getDataFromExcel("user", 1, 3);
		String LASTNAME = eLib.getDataFromExcel("user", 1, 4);
		String PHONENUMBER = eLib.getDataFromExcel("user", 1, 5);
		String Quantity = eLib.getDataFromExcel("user", 1, 2);
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToappAsUser();
		
		UserPage up=new UserPage(driver);
		up.getMouseEdt().click();
		MousePage mp=new MousePage(driver);
		Thread.sleep(2000);
		mp.getQuantityEdt().sendKeys(Quantity);
		mp.getAddEdt().click();
		
		up.getCreateCustomerEdt().click();
		AddCustomerPage acp=new AddCustomerPage(driver);
		acp.AddCustomer(FIRSTNAME, LASTNAME, PHONENUMBER);
	    wlib.switchtoAlertAndAccept(driver);
	}



}
