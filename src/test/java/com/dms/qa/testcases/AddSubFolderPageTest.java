package com.dms.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dms.qa.base.TestBase;
import com.dms.qa.pages.AddSubFolderPage;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;

public class AddSubFolderPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	AddSubFolderPage addSubFolderPage;

public AddSubFolderPageTest() {
		
		super();
	}
@BeforeMethod

public void setUp() throws InterruptedException {
	
	initialization();
	
 loginpage = new LoginPage();
	//testUtil = new TestUtil();
 addSubFolderPage = new AddSubFolderPage();
 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
// addSubFolderPage = homepage.clickOnAddSubFolderLink();
}

@Test
public void verifyFolderLabelTest() {
//boolean flag = homepage.verifyLogoImage();
Assert.assertTrue(addSubFolderPage.verifyFolderLabel(), "addSubFolder label is missing on the page");
}

@AfterMethod
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);

	driver.quit();
	
}

}
