package com.comcast.crm.contacttest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
/**
 * 
 * @author Deepak
 *
 */
public class SampleTest  {

	@Test
	public void sample() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/sales_And_inventory_system/pages/login.php");
		driver.findElement(By.name("user")).sendKeys("unguardable");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("btnlogin")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//span[text()='Employee']")).click();
		driver.findElement(By.xpath("//a[@data-target='#employeeModal']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[3]")).sendKeys("Nisha");
		driver.findElement(By.xpath("(//input[@name='lastname'])[3]")).sendKeys("M");
		driver.findElement(By.name("phonenumber")).sendKeys("9123456780");
		driver.findElement(By.name("email")).sendKeys("nishams123@gmail.com");
		WebElement gender = driver.findElement(By.name("gender"));
		Select s=new Select(gender);
		s.selectByVisibleText("Female");
		WebElement jobs = driver.findElement(By.name("jobs"));
		Select s1=new Select(jobs);
		s.selectByVisibleText("Manager");
		WebElement province = driver.findElement(By.name("province"));
		Select s3=new Select(province);
		s.selectByVisibleText("Abra");
		WebElement city = driver.findElement(By.name("city"));
		Select s4=new Select(city);
		s.selectByVisibleText("Angat");
		driver.findElement(By.id("FromDate")).click();
		driver.findElement(By.id("FromDate")).clear();
		
	}
	

}
