package com.dms.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dms.qa.base.TestBase;

public class AttributesPage extends TestBase{

	//page factory
	
	@FindBy(xpath="//input[@name='name']")
	WebElement na;
	
	
	@FindBy(xpath="//input[@name='minvalues']")
	WebElement minvalue;
	
	@FindBy(xpath="//input[@name='maxvalues']")
	WebElement maxvalue;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement savebutton;
	
	
	@FindBy(xpath="//button[text ()=' Remove attribute definition']")
	WebElement removebutton;
	
	//Initializing the page method
		public AttributesPage () {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public void createNewAttributes(String attname, String objecttype, String type, String minval, String maxval) {
			na.sendKeys(attname);
			 Select dropdown = new Select(driver.findElement(By.xpath("//select[@name ='objtype']")));
			 dropdown.selectByVisibleText("Folder");
			 dropdown.selectByValue("1");
			Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@name='type']")));
			dropdown1.selectByVisibleText("String");
			dropdown1.selectByValue("3");
			minvalue.sendKeys(minval);
			maxvalue.sendKeys(maxval);
			savebutton.click();
			removebutton.click();

		}
		
		
}
