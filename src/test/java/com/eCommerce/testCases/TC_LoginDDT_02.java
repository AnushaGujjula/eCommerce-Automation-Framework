package com.eCommerce.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.eCommerce.pageobjects.LoginPage;

public class TC_LoginDDT_02 extends BaseClass 
{
    @Test(dataProvider="LoginDDTData") // refer same data provider name to fetch the data
	public void loginDDT(String username, String pwd) throws InterruptedException 
    {
//		LoginPage lp=new LoginPage(driver);
//		lp.clickSignIn();
//		logger.info("URL is opened");
//		lp.setUserName(username);
//		logger.info("ENtered Username");
//		lp.clickContinue();
//		lp.setPassword(pwd);
//		logger.info("Entered Password");
//		lp.clickSubmit();
//		lp.clickLogout();
//		Thread.sleep(3000);
//		
//		driver.switchTo().defaultContent();//switch to login page
//		
//		/*if (isAlertPresent()==true)
//		{
//			driver.switchTo().alert().accept();//close alert
//			driver.switchTo().defaultContent();//switch to login page
//			Assert.assertTrue(false);
//			logger.warn("Login Failed");
//		}
//		else 
//		{
//			Assert.assertTrue(true);
//			logger.info("Login Passed");
//			lp.clickLogout();
//			driver.switchTo().alert().accept();//close logout alert
//			driver.switchTo().defaultContent();//switch to login page
//		}*/
//			
//	}
//
// //Method to check if alert is active
// 
//    public boolean isAlertPresent() 
//  {
//	 try 
//	 {
//		 driver.switchTo().alert();//switches to handle the alert 
//		 return true;
//	 }
//	 catch(NoAlertPresentException e)
//	 {
//		return false;
//	}
//  }
//  
// //Read data from excel and store data in 2D array
//    
//    @DataProvider(name="LoginDDTData")
//	String [][] getData() throws IOException
//	{
//	   String path=System.getProperty("user.dir")+"/src/test/java/com/eCommerce/testData/LoginTestData.xlsx";
//	   
//	   int rowno=XLUtils.getRowCount(path, "Sheet1"); //returns row count
//	   int columncount=XLUtils.getCellCount(path, "Sheet1", 1); //returns cell count
//	   
//	   String logindata[][]= new String [rowno][columncount]; //creating same 2D array as in excel
//	   for(int i=1;i<=rowno;i++) 
//	   {
//		   for(int j=0;j<columncount;j++) 
//		   {
//			   logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j); //in 2D array r,c is 1,0 
//		   }
//	   }
//	   
//	   return logindata; //send data to test case
//	   
	}
	
}
