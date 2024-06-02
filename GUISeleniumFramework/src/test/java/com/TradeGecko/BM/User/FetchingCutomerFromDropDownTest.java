package com.TradeGecko.BM.User;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.AddCustomerPage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.MousePage;
import com.comcast.crm.objectrepositoryutility.PointOfSalePage;
import com.comcast.crm.objectrepositoryutility.Summary;
import com.comcast.crm.objectrepositoryutility.UserPage;


public class FetchingCutomerFromDropDownTest extends BaseClass{

	@Test(groups="RegressionTest")
	public void FetchingCutomerFromDropDown() throws Throwable
	{
		String FIRSTNAME = eLib.getDataFromExcel("user", 1, 3);
		String LASTNAME = eLib.getDataFromExcel("user", 1, 4);
		String PHONENUMBER = eLib.getDataFromExcel("user", 1, 5);
		String Quantity = eLib.getDataFromExcel("user", 1, 2);
		String CustomerName = FIRSTNAME+" "+LASTNAME;

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

        WebElement dropDown = up.getCustomerDropDown();
        
        wlib.select(dropDown, CustomerName);
      
        PointOfSalePage psp=new PointOfSalePage(driver);
    	psp.getSubmitBtn().click();

		Summary s=new Summary(driver);
		Thread.sleep(2000);
		String total = s.getGrandToatalEdt().getText();
		System.out.println(total);
		Thread.sleep(2000);
		s.getEnterCashTxt().sendKeys(total);
		s.getPaymentBtn().click();
		wlib.switchtoAlertAndAccept(driver);
	}
	
	
}
