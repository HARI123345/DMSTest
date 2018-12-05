package com.dms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dms.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//page factory -
	
	@FindBy(name="login")
	WebElement login;
	@FindBy(name="pwd")
     WebElement pwd;
	
	@FindBy(xpath="//*[@id=\"form\"]/div[4]/button")
	WebElement signinbtn;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgotpasswordlink;
	
	@FindBy(xpath="/html/body/div/div/div/div/div/img")
	WebElement esoftlogo;
	
	//Initializing the page method
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateEsoftImage() {
		return esoftlogo.isDisplayed();
	}
	
	public HomePage login(String un, String password) throws InterruptedException {
		
		login.sendKeys(un);
		pwd.sendKeys(password);
		
		signinbtn.click();
		return new HomePage();
	}
}
