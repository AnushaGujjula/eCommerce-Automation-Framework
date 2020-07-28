package com.eCommerce.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.eCommerce.pageobjects.DepartmentsPage;
import junit.framework.Assert;

public class TC_Departments_Laptops_01 extends BaseClass
{
	@Test
	public void departments() throws IOException, InterruptedException
	{
        // Create a Departments Object to call its methods.
  		DepartmentsPage departmentsPage =new DepartmentsPage(driver);  
  		
  		departmentsPage.clickMenu();
  		logger.info("Clicked on menu tab on top left");
  		departmentsPage.clickElectronics();
		logger.info("Selected Electronics & Office");
		departmentsPage.clickLaptops();
		logger.info("Clicked on laptops");	
		// Scrolling the web page by pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)","");
		Thread.sleep(6000);
	
		//verify the title of page to ensure the click on laptops landed on laptops page.
		if(driver.getTitle().equals("Laptops - Walmart.com - Walmart.com"))
		{
			Assert.assertTrue(true);
			logger.info("laptop department page load succesful");
			
		}
		else
		{
			captureScreen(driver,"laptopDepartment");
			Assert.assertTrue(false);
			logger.info("laptop department page load failed");
		}
 	}
}
