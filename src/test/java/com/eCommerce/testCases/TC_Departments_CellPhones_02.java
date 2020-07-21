package com.eCommerce.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.eCommerce.pageobjects.DepartmentsPage;
import junit.framework.Assert;

public class TC_Departments_CellPhones_02 extends BaseClass
{
	@Test
	public void login() throws IOException, InterruptedException
	{
        // Create a Departments Object to call its methods.
  		DepartmentsPage departmentsPage =new DepartmentsPage(driver);  
  		
  		departmentsPage.clickMenu();
  		logger.info("Clicked on menu tab on top left");
  		departmentsPage.clickElectronics();
		logger.info("Selected Electronics & Office");
		departmentsPage.clickCellPhones();
		logger.info("Clicked on cell phones");	
		// Scrolling the web page by pixel
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1300)","");
		Thread.sleep(5000);	
		
		//verify the title of page to ensure the click on cell phones landed on cell phones page.
		if(driver.getTitle().equals("Cell Phones, Unlocked & No-Contract Phones, Prepaid Phones | Walmart.com - Walmart.com"))
		{
			Assert.assertTrue(true);
			logger.info("cellphone department page load succesful");
			
		}
		else
		{
			captureScreen(driver,"cellphoneDepartment");
			Assert.assertTrue(false);
			logger.info("cellphone department page load failed");
		}
 	}
}
