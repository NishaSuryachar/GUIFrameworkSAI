package com.TradeGecko.BM.Employee;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.AccountsPage;
import com.comcast.crm.objectrepositoryutility.AddEmployeePage;
import com.comcast.crm.objectrepositoryutility.EditUserPage;
import com.comcast.crm.objectrepositoryutility.EmployeePage;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;

public class EmployeeTest extends BaseClass {

	@Test
	public void updatingEmployeeDetails() throws Throwable
	{
		ExcelUtility eutil=new ExcelUtility();
		String FirstName = eutil.getDataFromExcel("Employee", 1, 2);
		String LastName = eutil.getDataFromExcel("Employee", 1, 3);
		String Email = eutil.getDataFromExcel("Employee", 1, 4);
		String PhoneNumber = eutil.getDataFromExcel("Employee", 1, 5);
		String gender = eutil.getDataFromExcel("Employee", 1, 6);
		String job = eutil.getDataFromExcel("Employee", 1, 7);
		String Province = eutil.getDataFromExcel("Employee", 1, 8);
		String city = eutil.getDataFromExcel("Employee", 1, 9);
		 Date hireDate = eutil.getDateDataFromExcel("Employee", 1, 10);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String formatedHireDate = sdf.format(hireDate);
		String gender1=eutil.getDataFromExcel("Employee", 4, 2);
		String password=eutil.getDataFromExcel("Employee", 4, 3);
		String email1=eutil.getDataFromExcel("Employee", 4, 4);
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToappAsAdmin1();
		
	    Home hp=new Home(driver);
	    hp.getEmployeeEdt().click();
		
		EmployeePage ep=new EmployeePage(driver);
		ep.getCreateEmployeeBtn().click();
		
		AddEmployeePage aep=new AddEmployeePage(driver);
		aep.AddEmployee(FirstName, LastName, Email, PhoneNumber);
		
		aep.AddEmployeeForDropDown(gender,job, Province, city);
		aep.getHiredateEdt().click();
		Thread.sleep(2000);

		aep.getHiredateEdt().sendKeys(formatedHireDate);
		Thread.sleep(2000);
		hp.getAccountsEdt().click();
		
		AccountsPage ap=new AccountsPage(driver);
		ap.getAdminEllipsisBtn().click();
		
		ap.getEditBtnEdt().click();
		
		EditUserPage eup=new EditUserPage(driver);
		eup.EditUserDetails(gender1, email1,password);
	}
}
