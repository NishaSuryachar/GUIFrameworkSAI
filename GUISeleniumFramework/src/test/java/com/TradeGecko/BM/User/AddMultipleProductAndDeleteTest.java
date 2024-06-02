package com.TradeGecko.BM.User;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.DeleteProductPage;
import com.comcast.crm.objectrepositoryutility.HeadSetPage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.MousePage;
import com.comcast.crm.objectrepositoryutility.ProcessorPage;
import com.comcast.crm.objectrepositoryutility.UserPage;
public class AddMultipleProductAndDeleteTest extends BaseClass{

	@Test(groups="smokeTest")
	public void AddMultipleProducts() throws Throwable
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
}
