package com.eCommerce.testCases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.eCommerce.pageobjects.SearchItemsPage;
import com.eCommerce.utilities.ExcelUtility;

import junit.framework.Assert;

public class TC_SearchItemsDDT_04 extends BaseClass 
{
    @Test(dataProvider="SearchTestData") // refer same data provider name to fetch the data
	public void searchDDT(String item) throws InterruptedException, IOException 
    {
    	String expectedPageTitle = null;
    	SearchItemsPage searchItemsPage = new SearchItemsPage(driver);
		
		searchItemsPage.setSearchInput(item);
		logger.info("Entered " +item+ " search");
		
		searchItemsPage.clickSearchButton();
		logger.info("Clicked on search Button");
		
		//Thread.sleep(3000);
        searchItemsPage.clearSearch();
        
		if(item.equals("books")) {
		    expectedPageTitle = "Books - Walmart.com - Walmart.com";	
		}else if(item.equals("cellphones")) {
			expectedPageTitle = "cellphones - Walmart.com";		
		}else if(item.equals("laptops")) {
			expectedPageTitle = "laptops - Walmart.com";	
		}else if(item.equals("tv")) {
			expectedPageTitle = "tv - Walmart.com";	
        }else if(item.equals("plants")) {
        	expectedPageTitle = "plants - Walmart.com";	
        }
		// verify the title of each page to ensure successful login.
		if(driver.getTitle().equals(expectedPageTitle))
		{
			Assert.assertTrue(true);
			logger.info(item + " search list successful");
		}
		else
		{
			captureScreen(driver,"booksSearch");
			Assert.assertTrue(false);
			logger.info(item + "search list failed");
		}
        
                
//Read data from excel and store data in 2D array
    }
		@DataProvider(name="SearchTestData")
		String [][] getData() throws IOException
		{
			String path=System.getProperty("user.dir")+"/src/test/java/com/eCommerce/testData/SearchTestData.xlsx";
			
			int rownum=ExcelUtility.getRowCount(path, "ItemsList");
			int colcount=ExcelUtility.getCellCount(path,"ItemsList",1);
			
			String searchData[][]=new String[rownum][colcount];
			
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					searchData[i-1][j] = ExcelUtility.getCellData1(path, "ItemsList" , i, j); //1,0
				}
					
			}
		return searchData;
		}
	
}
