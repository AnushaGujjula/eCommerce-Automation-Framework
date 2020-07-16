package com.eCommerce.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.eCommerce.pageobjects.DepartmentsPage;
import junit.framework.Assert;

public class TC_Departments_CellPhones_02 extends BaseClass
{
	@Test
	public void login() throws IOException
	{
        // Create a Departments Object to call its methods.
  		DepartmentsPage dp =new DepartmentsPage(driver);  
  		
  		dp.clickMenu();
  		logger.info("Clicked on menu tab on top left");
		dp.clickElectronics();
		logger.info("Selected Electronics & Office");
		dp.clickCellPhones();
		logger.info("Clicked on cell phones");				
	
		//verify the title of page to ensure the click on cell phones landed on cell phones page.
		if(driver.getTitle().equals("Cell Phones, Unlocked & No-Contract Phones, Prepaid Phones | Walmart.com - Walmart.com"))
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
