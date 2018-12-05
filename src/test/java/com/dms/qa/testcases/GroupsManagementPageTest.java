package com.dms.qa.testcases;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dms.qa.base.TestBase;
import com.dms.qa.pages.GroupsManagementPage;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;
import com.dms.qa.util.TestUtil;

public class GroupsManagementPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	GroupsManagementPage groupsmanagementpage;
	 TestUtil testUtil;
	 String sheetName = "GroupManagementTestData";
	
public GroupsManagementPageTest () {
		
		super();
	}

@BeforeMethod

public void setUp() throws InterruptedException {
	
	initialization();
	
 loginpage = new LoginPage();
	//testUtil = new TestUtil();
 groupsmanagementpage = new GroupsManagementPage();

 //addSubFolderPage = new AddSubFolderPage();
 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
// addSubFolderPage = homepage.clickOnAddSubFolderLink();
 //usermanagementpage = homepage.clickOnUserManagementLink();
 groupsmanagementpage =homepage.clickOnGroupsManagementLink();
}

//@Test(priority=1)
//public void verifyGroupsManagementLabel() {
//	Assert.assertTrue(groupsmanagementpage.verifyGroupsManagementPageLabel(), "Group Management label is missing on the page");
//}

@DataProvider

public Object[][] getDMSTestData( ) {
	Object data[][] =TestUtil.getTestData(sheetName);
	return data;
}

@Test(priority=2, dataProvider="getDMSTestData")
public void validateCreateNewGroupsManagement(String name, String comment) throws InterruptedException {
	homepage.clickOnGroupsManagementLink();
  
	groupsmanagementpage.createNewGroupsManagement(name, comment);
	
	System.out.println(driver.getCurrentUrl());
	Assert.assertTrue(driver.getCurrentUrl().contains("http://surgimedik.esoftech.in/out/out.GroupMgr.php?groupid"), "Group is not able to added- group already exists");
	System.out.println("Page url verified-  New Group added in successfully");

}

//@Test(priority=3)
//public void validateAddMember() {
//	//groupsmanagementpage.verifyMemberSelection("Admin4 - Hari");
//}

@AfterMethod
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);

	//driver.quit();
}
}

