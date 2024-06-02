package com.TradeGecko.BM.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.PointOfSalePage;
import com.comcast.crm.objectrepositoryutility.Summary;
import com.comcast.crm.objectrepositoryutility.UserPage;
//@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class CustomerTest extends BaseClass{

	@Test(groups="smokeTest")
	public void addProductForCustomer() throws Throwable
	{
		ExcelUtility eUtil=new ExcelUtility();
		String CUSTOMERNAME = eUtil.getDataFromExcel("user", 10, 2);
		String Quantity = eUtil.getDataFromExcel("user", 1, 2);
		System.out.println(Quantity);
		LoginPage lp=new LoginPage(driver);
		lp.loginToappAsUser();

		UserPage up=new UserPage(driver);
		up.getKeyboardTabEdt().click();
		up.getQuantityEdt().clear();
		up.getQuantityEdt().sendKeys(Quantity);

		up.getAddBtn().click();
		PointOfSalePage psp=new PointOfSalePage(driver);
		Thread.sleep(2000);
		//psp.getDeleteBtn().click();

		WebElement ele = psp.getCustomerDropDown();
		Thread.sleep(3000);
		wlib.select(ele, 7);

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
