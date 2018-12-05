package com.dms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dms.qa.base.TestBase;

public class CategoriesPage extends TestBase {

	
	
	//page factory
	
	
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath="*//button[@class='btn']")
	WebElement categorybtn;
	
	//Initializing the page method
		public  CategoriesPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Action
		public void createNewCategoriesPage(String entername ) {
			name.sendKeys(entername);
			categorybtn.click();
		}
		
	
	
}
