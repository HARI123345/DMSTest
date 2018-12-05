package com.dms.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dms.qa.base.TestBase;
import com.dms.qa.pages.CategoriesPage;
import com.dms.qa.pages.GlobalKeywordsPage;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;
import com.dms.qa.util.TestUtil;

public class CategoriesPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
    TestUtil testUtil;
    CategoriesPage categoriespage;

    
public  CategoriesPageTest () {
		
		super();
	}

@BeforeMethod

public void setUp() throws InterruptedException {
	
	initialization();
	
 loginpage = new LoginPage();
	testUtil = new TestUtil();
	categoriespage = new CategoriesPage();
 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

 categoriespage = homepage.clickOnCategoriesPageLink();
}

@Test(priority=1)
public void validateCreateNewCategoriesPage() {
	homepage.clickOnCategoriesPageLink();
	categoriespage.createNewCategoriesPage("QA");
	
}

@AfterMethod
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);

	driver.quit();
}

}
