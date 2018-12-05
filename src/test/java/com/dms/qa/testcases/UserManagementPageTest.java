package com.dms.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dms.qa.base.TestBase;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;
import com.dms.qa.pages.UserManagementPage;
import com.dms.qa.util.TestUtil;

public class UserManagementPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	UserManagementPage usermanagementpage;
    TestUtil testUtil;
	String sheetName = "UserManagementTestData";


public UserManagementPageTest () {
		
		super();
	}

@BeforeMethod

public void setUp() throws InterruptedException {
	
	initialization();
	
 loginpage = new LoginPage();
	//testUtil = new TestUtil();
 usermanagementpage = new UserManagementPage();
 //addSubFolderPage = new AddSubFolderPage();
 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
// addSubFolderPage = homepage.clickOnAddSubFolderLink();
 usermanagementpage = homepage.clickOnUserManagementLink();
}

//@Test(priority=1)
//public void verifyUserManagementLabel() {
////boolean flag = homepage.verifyLogoImage();
//Assert.assertTrue(usermanagementpage.verifyUserManagementLabel(), "UsersManagement label is missing on the page");
//}


@DataProvider

public Object[][] getDMSTestData( ) {
	Object data[][] =TestUtil.getTestData(sheetName);
	return data;
}

					
@Test(priority=2, dataProvider="getDMSTestData")
//@Test(priority=2)
public void validateCreateNewUserManagement(String username, String pwd, String conpwd, String fullname, String email, String comment, String role,  String quota, String opt) throws InterruptedException {
	homepage.clickOnUserManagementLink();
	//usermanagementpage.createNewUserManagement("hari123", "12345689", "12345689", "Vaka", "hari@esoftech.org", "Na", "Administrator", "190.73 MB");
	usermanagementpage.createNewUserManagement(username, pwd, conpwd, fullname, email, comment, role, quota);
	System.out.println(driver.getCurrentUrl());
	Assert.assertTrue(driver.getCurrentUrl().contains("http://surgimedik.esoftech.in/out/out.UsrMgr.php?userid="), "User is not able to added- user already exists");
//	Assert.assertTrue(driver.getCurrentUrl().contains("http://18.223.158.6/organization/dashboard"), "User is not able to login- Invalid Credentails");
	System.out.println("Page url verified-  New user added in successfully");

	}

@AfterMethod
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);

	//driver.quit();
	
}
}
