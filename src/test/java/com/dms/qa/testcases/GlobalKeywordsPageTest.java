package com.dms.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dms.qa.base.TestBase;
import com.dms.qa.pages.GlobalKeywordsPage;
import com.dms.qa.pages.GroupsManagementPage;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;
import com.dms.qa.util.TestUtil;

public class GlobalKeywordsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
    TestUtil testUtil;
    GlobalKeywordsPage globalkeywordspage;

    
public GlobalKeywordsPageTest  () {
		
		super();
	}

@BeforeMethod

public void setUp() throws InterruptedException {
	
	initialization();
	
 loginpage = new LoginPage();
	testUtil = new TestUtil();
 globalkeywordspage = new GlobalKeywordsPage();
 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

 globalkeywordspage =homepage.clickOnGlobalKeywordsLink();
}

@Test(priority=1)
public void verifyGlobalKeywordsPageLabel() {
	Assert.assertTrue(globalkeywordspage.verifyGlobalKeywordsPagelabel(), "GlobalKeywordsPage label is missing on the page);");
}


@Test(priority=2)
public void validateCreateNewGlobalKeywords() {
	homepage.clickOnGlobalKeywordsLink();
	globalkeywordspage.createNewGlobalKeywords("Emp policy", "Esoft policy");
}

@AfterMethod
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);

driver.close();
}
}
