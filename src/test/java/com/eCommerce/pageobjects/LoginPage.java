package com.eCommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object class used to identify all the web elements for Login page.
 * 
 * @author Anusha Gujjula.
 *
 */
public class LoginPage {	
	 
	public LoginPage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/button[1]/span[1]/span[1]/span[1]/img[1]")
	WebElement account;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/span[1]/div[1]")
	WebElement clickSignin;
	
	@FindBy(id = "email")
	WebElement txtUserName;
		
	@FindBy(id = "password")
	WebElement txtPassword;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/button[1]")
	WebElement signin;
	
	@FindBy(className = "bot-message")
	WebElement robotLogin;
	
	public void clickAccount()
	{
		account.click();
	}
	public void clickSignIn()
	{
		clickSignin.click();
	}	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}	
	
	public void signIn()
	{
		signin.click();
	}	
	
	public String robotLogin() 
	{
		return robotLogin.getText();
	}	
}
