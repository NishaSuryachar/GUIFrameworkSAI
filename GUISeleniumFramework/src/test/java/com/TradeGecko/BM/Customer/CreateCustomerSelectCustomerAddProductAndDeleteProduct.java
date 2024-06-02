package com.TradeGecko.BM.Customer;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.objectrepositoryutility.AddCustomerPage;
import com.comcast.crm.objectrepositoryutility.DeleteProductPage;
import com.comcast.crm.objectrepositoryutility.HeadSetPage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.MousePage;
import com.comcast.crm.objectrepositoryutility.PointOfSalePage;
import com.comcast.crm.objectrepositoryutility.ProcessorPage;
import com.comcast.crm.objectrepositoryutility.Summary;
import com.comcast.crm.objectrepositoryutility.UserPage;

public class CreateCustomerSelectCustomerAddProductAndDeleteProduct extends BaseClass{

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
	
	@Test(groups="smokeTest")
	public void addMultipleProducts() throws Throwable
	{
		String Quantity = eLib.getDataFromExcel("user", 1, 2);
		LoginPage lp=new LoginPage(driver);
		lp.loginToappAsUser();
		
		UserPage up=new UserPage(driver);
		up.getMouseEdt().click();
		MousePage mp=new MousePage(driver);
		Thread.sleep(2000);
		mp.getQuantityEdt().sendKeys(Quantity);
		mp.getAddEdt().click();
		
		up.getHeadsetEdt().click();
		HeadSetPage hsp=new HeadSetPage(driver);
		hsp.getQuantityEdt().sendKeys(Quantity);
		hsp.getAddEdt().click();
		
		up.getProcessorEdt().click();
		ProcessorPage pp=new ProcessorPage(driver);
		pp.getQuantityEdt().sendKeys(Quantity);
		pp.getAddEdt().click();
		
		DeleteProductPage dp=new DeleteProductPage(driver);
		dp.getProd1().click();
		Thread.sleep(2000);
		
	}
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
