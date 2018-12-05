package com.dms.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.dms.qa.base.TestBase;
import com.dms.qa.pages.HomePage;
import com.dms.qa.pages.LoginPage;

public class LoginPageTest  extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
//	Logger log = Logger.getLogger(LoginPageTest.class);
	public LoginPageTest() {
		
		super();
	}
	
	//Test cases should be separated -- independent with each other
	//@Before each test case -- launch the browser and login
	//@Test -- execute test case
	//@After each test case -- close the browser
	
	
	@BeforeMethod
	
	public void setUp() throws InterruptedException {
		
		initialization();
		
	 loginpage = new LoginPage();	
	
	
	}
	
	@Test(priority=1)
		
		public void  loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "SurgiMedik: Sign in");
		
	
		
	}
	
	@Test(priority=2)
		public void esoftLogoImageTest() {
		
	
		boolean flag = loginpage.validateEsoftImage();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void loginTest() throws InterruptedException {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

		
	}


