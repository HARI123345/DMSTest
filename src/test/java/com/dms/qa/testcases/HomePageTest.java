package com.dms.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dms.qa.base.TestBase;
import com.dms.qa.pages.AttributesPage;
import com.dms.qa.pages.CategoriesPage;
import com.dms.qa.pages.GlobalKeywordsPage;
import com.dms.qa.pages.GroupsManagementPage;
//import com.dms.qa.pages.AddSubFolderPage;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;
import com.dms.qa.pages.UserManagementPage;
import com.dms.qa.pages.WorkflowActionsPage;
import com.dms.qa.pages.WorkflowStatesPage;
import com.dms.qa.pages.WorkflowsPage;
import com.dms.qa.util.TestUtil;


public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	UserManagementPage usermanagementpage;
	GroupsManagementPage groupsmanagementpage;
    TestUtil testUtil;
    GlobalKeywordsPage globalkeywordspage;
    CategoriesPage categoriespage;
    AttributesPage attributespage;
    WorkflowActionsPage workflowactionspage;
    WorkflowStatesPage workflowstatespage;
    WorkflowsPage workflowspage;
	//AddSubFolderPage addSubFolderPage;
	
	public HomePageTest() {
		
		super();
	}
	
	@BeforeMethod
	
	public void setUp() throws InterruptedException {
		
		initialization();
		
	 loginpage = new LoginPage();
		//testUtil = new TestUtil();
	// addSubFolderPage = new AddSubFolderPage();
	 usermanagementpage = new UserManagementPage(); 
	 groupsmanagementpage = new GroupsManagementPage();
	 globalkeywordspage = new GlobalKeywordsPage();
	 categoriespage = new CategoriesPage();
	 attributespage = new AttributesPage();
	 workflowactionspage = new WorkflowActionsPage();
	 workflowstatespage = new WorkflowStatesPage();
	 workflowspage = new WorkflowsPage();
	 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	

@Test(priority=1)
	public void verifyLogoImageTest() {
	boolean flag = homepage.verifyLogoImage();
	Assert.assertTrue(flag);
}

//@Test(priority=2) 
//public void verifyAddSubFolderLink() {
//	//testUtil.switchToFrame();
//	addSubFolderPage = homepage.clickOnAddSubFolderLink();
//}
	@Test(priority=2)
	public void verifyUserManagementLinkTest() {
			usermanagementpage =homepage.clickOnUserManagementLink();
	//		System.out.println(x);
		//return new UserManagementPage();
	}
	
	@Test(priority=3)
	public void verifyGroupManagementLinkTest() {
		groupsmanagementpage =homepage.clickOnGroupsManagementLink();
	//		System.out.println(x);
		//return new UserManagementPage();
	}
	
	@Test(priority=4)
	public void verifyGlobalKeywordsLinkTest() {
		
		globalkeywordspage = homepage.clickOnGlobalKeywordsLink();
		
	}
	
	@Test(priority=5)
	public void verifyCategoriesPageLinkTest() {
		categoriespage = homepage.clickOnCategoriesPageLink();	
	}
	
	@Test(priority=6)
	public void verifyAttributesPageLinkTest() {
		attributespage = homepage.clickOnAttributesPageLink();
	}
	
	@Test(priority=7)
	public void verifyWorkflowActionsPageLinkTest() {
		workflowactionspage = homepage.clickOnWorkflowActionsPageLink();
	}
	
	@Test(priority=8)
	public void verifyWorkflowStatesPageLink() {
		workflowstatespage = homepage.clickOnWorkflowStatesPageLink();
		
	}
	
	@Test(priority=9)
	public void verifyWorkflowsPageLinkTest() {
		workflowspage = homepage.clickOnWorkflowsPageLink();
		
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
		
	}
}