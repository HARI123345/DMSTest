package com.dms.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dms.qa.base.TestBase;

public class UserManagementPage extends TestBase {
	
	@FindBy(xpath = "//legend[text()='Users management']")
	WebElement usermanagementlabel;
		
	@FindBy(id="login")
	WebElement name;
	
	@FindBy(id="pwd")
	WebElement password;
	
	@FindBy(id="pwdconf")
	WebElement confirmpassword;
	
	
	@FindBy(id="name")
	WebElement fullname1;
	
	@FindBy(id="email")
	WebElement emailaddr;
	
	@FindBy(id="comment")
	WebElement comments;
	
	@FindBy(name="quota")
	WebElement text;
	
	@FindBy(xpath="//input[@type=\"file\"]")
	WebElement image;
	
	@FindBy(xpath="//button[@id=\"tp-btn\"]")
	WebElement  addBtn;
	
	
	
	//delete btns
	
//	@FindBy(xpath="//a[@class='btn']")
//	WebElement rebtn;
//	
//	@FindBy(xpath="//button[@type='submit']")
//	WebElement rebtn1;
	
	//esoft logo 
	
//	@FindBy(xpath="//a[@class='brand']")
//	WebElement logoimage;
			
	//Edit access page
	
//	@FindBy(xpath="//a[text()='Edit Access']")
//	WebElement editaccess;
//	
//	@FindBy(xpath="//input[@value='Add']")
//	WebElement addbtn;
	
	
	
	//admin menu 
//		@FindBy(xpath="//a[text()='Administrator']")
//		WebElement adminmenu;
		
		//sign out link
		
//		@FindBy(xpath="//a[text()='Sign out']")
//		WebElement signoutlink;
		
	//Initializing the page method
			public  UserManagementPage() {
				PageFactory.initElements(driver, this);
			}
			
			//Actions
			public boolean verifyUserManagementLabel() {
				return usermanagementlabel.isDisplayed();

			}
			//, String opt
			public void createNewUserManagement(String username, String pwd, String conpwd, String fullname, String email, String comment, String role,  String quota) throws InterruptedException {
				//, String user, String accessmode
			
			 //	WebElement ImageFile = driver.findElement(By.id("')]"));
//			     // This will Toggle the Check box		
 				// Select dropdown = new Select(driver.findElement(By.name("role")));
				 name.sendKeys(username);
				 
				 Thread.sleep(100);

				 password.sendKeys(pwd);
				// Thread.sleep(100);

				 confirmpassword.sendKeys(conpwd);
				 
				 fullname1.sendKeys(fullname);
				 emailaddr.sendKeys(email);
				 comments.sendKeys(comment);
				 
				 
//				 WebElement mySelectElement = driver.findElement(By.xpath("");
//				 Select dropdown= new Select(mySelectElement);
//				 WebElement option = dropdown.getFirstSelectedOption();
//				 System.out.println(option.getText()); //output "Selenium"
				 
				 //select.sendKeys(role);
				 
					Select select = new Select(driver.findElement(By.xpath("//select[@name=\"role\"]")));
					 select.selectByVisibleText("Administrator");
				    select.selectByValue("1");

//					
//				 WebElement opt1 = driver.findElement(By.xpath("//input[@name='isdisabled']"));							
//				 opt1.click();
				Thread.sleep(100);
//    			   Select dropdown1  = new Select(driver.findElement(By.xpath("//select[@name='notification_groups[]']/option")));
//				   dropdown1.selectByVisibleText("QA");
//				   dropdown1.selectByValue("76");
				 text.sendKeys(quota);
				 image.sendKeys("/home/haree/Pictures/download.jpeg");
				  //Thread.sleep(100);
			 				  
				 addBtn.click();
				 
//				 logoimage.click();
//				 
//				  Thread.sleep(100);
//
//				 editaccess.click();
				 
//				 Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='userid']")));
//				 dropdown.selectByVisibleText("User2 - Harikrishna");
//				 dropdown.selectByValue("150");
//				 
//				 
//				 Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[3]/td[2]/select")));
//				 dropdown1.selectByVisibleText("Read Permissions");
//				 dropdown1.selectByValue("2");
//				 
				 
//				 addbtn.click();
//				 
//				 adminmenu.click();
//				 
//				 signoutlink.click();
//				 
				 
//				 rebtn.click();
//				 
//				 rebtn1.click();
				 //Thread.sleep(100);

			}
}
