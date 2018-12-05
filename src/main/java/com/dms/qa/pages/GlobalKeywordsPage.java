package com.dms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dms.qa.base.TestBase;

public class GlobalKeywordsPage extends TestBase{
	
	//page factory
	
	@FindBy(xpath="//legend[text () ='Global Keywords']")
	WebElement globalkeywordslabel;
	
	@FindBy(xpath="//input[@name ='name']")
	WebElement keywordname;
	
	@FindBy(xpath="//input[@value='Add Keyword']")
	WebElement keywordbtn ;
	
	@FindBy(xpath="//input[@name='keywords']")
	WebElement keyword;
	
	@FindBy(xpath="//*[@id='tp-btn']")
	WebElement keyworaddbtn;
	
	
	@FindBy(xpath="//button[@title='Delete']")
	WebElement deletebtn;
	
	//Initializing the page method
	public GlobalKeywordsPage () {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyGlobalKeywordsPagelabel() {
		return globalkeywordslabel.isDisplayed();
		
	}
	
	//Actions
	 public void createNewGlobalKeywords(String name, String keyword1) {
		 keywordname.sendKeys(name);
		 keywordbtn.click();
		 keyword.sendKeys(keyword1);
		 keyworaddbtn.click();
		 deletebtn.click();
	 }
}
