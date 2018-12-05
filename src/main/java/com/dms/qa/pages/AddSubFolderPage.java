package com.dms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dms.qa.base.TestBase;

public class AddSubFolderPage extends TestBase {
	

	@FindBy(xpath="/html/body/div[2]/div/div[2]/legend")
	WebElement folderlabel;

	//Initializing the page method
			public AddSubFolderPage () {
				PageFactory.initElements(driver, this);
			}
			
			//Actions
			public boolean verifyFolderLabel() {
				return folderlabel.isDisplayed();

			}

}
