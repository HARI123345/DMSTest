package com.dms.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dms.qa.base.TestBase;
import com.dms.qa.pages.AttributesPage;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;
import com.dms.qa.pages.WorkflowsPage;
import com.dms.qa.util.TestUtil;

public class WorkflowsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
    TestUtil testUtil;
    WorkflowsPage workflowspage;

    
    
public  WorkflowsPageTest () {
		
		super();
	}

@BeforeMethod

public void setUp() throws InterruptedException {
	
	initialization();
	
loginpage = new LoginPage();
testUtil = new TestUtil();
workflowspage = new WorkflowsPage();
homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
 workflowspage =homepage.clickOnWorkflowsPageLink();
 
}

@Test
public void validateCreateNewWorkflows() {
	homepage.clickOnWorkflowsPageLink();
	workflowspage.createNewWorkflows("Test", "Created", "Created", "Approved", "Test2 - Hari", "Reviewed", "Created", "Rejected", "Test2 - Hari", "Rejected", "Reviewed", "Approved", "User2 - Harikrishna", "Released", "Reviewed", "Rejected", "User2 - Harikrishna", "Rejected");
	
}


@AfterMethod
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);

	driver.quit();
}
}
