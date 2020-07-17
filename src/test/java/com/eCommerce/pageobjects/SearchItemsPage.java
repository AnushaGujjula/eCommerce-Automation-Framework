package com.eCommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object class used to identify search items on home page.
 * 
 * @author Anusha Gujjula.
 *
 */
public class SearchItemsPage 
{
	public SearchItemsPage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
    }

	 @FindBy(id="global-search-input")
	 WebElement searchInput;
	 
	 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/form[1]/button[3]/span[1]/img[1]")
	 WebElement searchButton;
	 
	 public void clearSearch()
		{
		 searchInput.clear();
		}
	 
	 public void setSearchInput(String items)
		{
		 searchInput.sendKeys(items);
		}
	 public void clickSearchButton()
		{
		 searchButton.click();
		}
	
	
}	