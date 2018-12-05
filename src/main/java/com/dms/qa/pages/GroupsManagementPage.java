package com.dms.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dms.qa.base.TestBase;

public class GroupsManagementPage extends TestBase{
  //Page factory
	
	@FindBy(xpath ="//legend[text()='Groups Management']")
    WebElement groupsmanagementlabel;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement name1;
	
	@FindBy(xpath="//textarea[@id='comment']")
	WebElement comm ;

	@FindBy(xpath="//button[@class='btn']")
	WebElement gmbtn;
	
	@FindBy(xpath="//input[@value='Add']")
	WebElement mbtn;
	
	@FindBy(xpath="//i[@class='icon-random']")
	WebElement togglebtn;
	
	
	@FindBy(xpath="//button[@class='btn btn-mini']")
	WebElement amd;
	
	@FindBy(xpath="//a[@class='btn']")
	WebElement removebtn;
	
	@FindBy(xpath="//button[text()=' Remove this group']")
	WebElement removebtn1;
	
//Initializing the page method
public GroupsManagementPage () {
	PageFactory.initElements(driver, this);
}

//Actions
public boolean verifyGroupsManagementPageLabel() {
	return groupsmanagementlabel.isDisplayed();

}

public void createNewGroupsManagement(String name, String comment) throws InterruptedException {
	//, String member
	name1.sendKeys(name);
	comm.sendKeys(comment);
	gmbtn.click();
//	 Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@name='userid']")));
// 	 dropdown2.selectByVisibleText("member");
// 	 dropdown2.selectByValue("154");
// 	WebElement checkbox = driver.findElement(By.xpath("//input[@name='manager']"));
// 	checkbox.click();
// 	mbtn.click();
//	  Thread.sleep(100);
//
// 	togglebtn.click();
// 	amd.click();
 	
 	//removebtn.click();
 	//removebtn1.click();
}

//public void verifyMemberSelection(String member) {
//	 Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@name='userid']")));
// 	 dropdown2.selectByVisibleText("Admin4 - Hari");
// 	 dropdown2.selectByValue("154");
// 	WebElement checkbox = driver.findElement(By.xpath("//input[@name='manager']"));
// 	checkbox.click();
// 	mbtn.click();
//}

}