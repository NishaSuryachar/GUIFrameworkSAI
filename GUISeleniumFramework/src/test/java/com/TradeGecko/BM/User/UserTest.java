package com.TradeGecko.BM.User;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.UserPage;

public class UserTest extends BaseClass{

	@Test
	public void transactionBillIsGenerated() throws Throwable
	{
		
		 String URL=fLib.getDataFromPropertiesFile("url");
		 String USERNAME=fLib.getDataFromPropertiesFile("username");
		 String PASSWORD=fLib.getDataFromPropertiesFile("password");
		 System.out.println(URL);
		 System.out.println(USERNAME);
		 System.out.println(PASSWORD);
//		UserPage up=new UserPage(driver);
//		up.getKeyboardTabEdt().click();
	}
	
}
