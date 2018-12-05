package com.dms.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dms.qa.base.TestBase;

public class WorkflowsPage extends TestBase {

	//page factory
	
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath="//i[@class='icon-save']")
	WebElement savebtn;
	
	@FindBy(xpath="//input[@value='Add']")
	WebElement addbtn;
	
	//Initializing the page method
			public WorkflowsPage () {
				PageFactory.initElements(driver, this);
			}	
			
			//Actions
			public void createNewWorkflows(String name1, String intial, String state, String action, String users, String nextstate, String state1, String action1, String users1, String nextstate1, String state2, String action2, String users2, String nextstate2, String state3, String action3, String users3, String nextstate3 ) {
					//, String action1, String users1, String nextstate1, String state2, String action2, String users2, String nextstate2, String state3, String action3, String users3, String nextstate3) {
				
				name.sendKeys(name1);
				
				 Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='initstate']")));
				 dropdown.selectByVisibleText("Created");
				 dropdown.selectByValue("35");
				 savebtn.click();
				 
				 //1
				 
				 Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@name='state']")));
				 dropdown1.selectByVisibleText("Created");
				 dropdown1.selectByValue("35");
				 
				 
				 Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@name='action']")));
				 dropdown2.selectByVisibleText("Approved");
				 dropdown2.selectByValue("66");
				 
				 Select dropdown3 = new Select(driver.findElement(By.xpath("//select[@name='users[]']")));
				 dropdown3.selectByVisibleText("Test2 - Hari");
				 dropdown3.selectByValue("158");
				 
				 Select dropdown4 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/table/tbody/tr/td[1]/select[2]")));
				 dropdown4.selectByVisibleText("Reviewed");
				 dropdown4.selectByValue("41");
				 
				 addbtn.click();
				 
				 //2
				 
				 Select dropdown5 = new Select(driver.findElement(By.xpath("//select[@name='state']")));
				 dropdown5.selectByVisibleText("Created");
				 dropdown5.selectByValue("35");
				 
				 
			 Select dropdown6 = new Select(driver.findElement(By.xpath("//select[@name='action']")));
				 dropdown6.selectByVisibleText("Rejected");
				 dropdown6.selectByValue("37");
				 
			 Select dropdown7 = new Select(driver.findElement(By.xpath("//select[@name='users[]']")));
				 dropdown7.selectByVisibleText("Test2 - Hari");
				 dropdown7.selectByValue("158");
				 
				 Select dropdown8 = new Select(driver.findElement(By.xpath("//select[@name='nextstate']")));
				 dropdown8.selectByVisibleText("Rejected");
			   dropdown8.selectByValue("33");
			 		 addbtn.click();

			 //3
     			 Select dropdown9 = new Select(driver.findElement(By.xpath("//select[@name='state']")));
				 dropdown9.selectByVisibleText("Reviewed");
				 dropdown9.selectByValue("41");
			 
				 
				 Select dropdown10 = new Select(driver.findElement(By.xpath("//select[@name='action']")));
				 dropdown10.selectByVisibleText("Approved");
				 dropdown10.selectByValue("66");
				 
				 Select dropdown11 = new Select(driver.findElement(By.xpath("//select[@name='users[]']")));
				 dropdown11.selectByVisibleText("User2 - Harikrishna");
				 dropdown11.selectByValue("150");
				 
			 Select dropdown12 = new Select(driver.findElement(By.xpath("//select[@name='nextstate']")));
			 dropdown12.selectByVisibleText("Released");
				 dropdown12.selectByValue("43");
				 
				 addbtn.click();

				 //4
				 
				 Select dropdown13 = new Select(driver.findElement(By.xpath("//select[@name='state']")));
				 dropdown13.selectByVisibleText("Reviewed");
				 dropdown13.selectByValue("41");
				 
				 
				 Select dropdown14 = new Select(driver.findElement(By.xpath("//select[@name='action']")));
				 dropdown14.selectByVisibleText("Rejected");
				 dropdown14.selectByValue("37");
				 
			 Select dropdown15 = new Select(driver.findElement(By.xpath("//select[@name='users[]']")));
			 dropdown15.selectByVisibleText("User2 - Harikrishna");
				 dropdown15.selectByValue("150");
				 
				 Select dropdown16 = new Select(driver.findElement(By.xpath("//select[@name='nextstate']")));
			 dropdown16.selectByVisibleText("Rejected");
				 dropdown16.selectByValue("33");
				 addbtn.click();

			}
}


