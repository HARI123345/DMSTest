package com.dms.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dms.qa.base.TestBase;
import com.dms.qa.pages.AttributesPage;
import com.dms.qa.pages.GlobalKeywordsPage;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;
import com.dms.qa.util.TestUtil;

public class AttributesPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
    TestUtil testUtil;
    AttributesPage attributespage;

public  AttributesPageTest () {
		
		super();
	}

@BeforeMethod

public void setUp() throws InterruptedException {
	
	initialization();
	
 loginpage = new LoginPage();
	testUtil = new TestUtil();
	attributespage = new AttributesPage();
 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

 attributespage =homepage.clickOnAttributesPageLink();
 
}

@Test
public void validateCreateNewAttributes() {
	homepage.clickOnAttributesPageLink();
	attributespage.createNewAttributes("Doc Number", "Folder", "String", "0", "0");
}

@AfterMethod
public void tearDown() throws InterruptedException {
	
	Thread.sleep(3000);

	driver.quit();
	
}
}
