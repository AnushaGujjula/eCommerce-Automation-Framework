package com.eCommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object class used to identify all the web elements for departments page.
 * 
 * @author Anusha Gujjula.
 *
 */
 public class DepartmentsPage 
  {	 
	public DepartmentsPage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
	}

   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]/img[1]")
   WebElement menu;

   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[3]")
   WebElement electronics;
  
   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/a[1]/div[1]")
   WebElement laptops;
   
   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[5]/div[1]/span[1]/a[1]")
   WebElement cellPhones;
   
   @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/button[1]/span[1]/span[1]/span[2]")
	WebElement account;
   
   @FindBy(className = "x_a x_i")
	WebElement lnklogout;
  
  public void clickMenu()
	{
		menu.click();
	}
  public void clickElectronics()
 	{
 		electronics.click();
 	}
  public void clickLaptops()
 	{
 		laptops.click();
 	}
  public void clickCellPhones()
 	{
 		cellPhones.click();
 	}
  }