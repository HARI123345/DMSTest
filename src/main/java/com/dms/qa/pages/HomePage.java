package com.dms.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dms.qa.base.TestBase;
import com.dms.qa.util.TestUtil;

public class HomePage extends TestBase {

	//Page Factory
	@FindBy(xpath="//*[@id=\"menu\"]/a/img")
	WebElement logoimagelabel;
	
//	@FindBy(xpath="//*[@id=\"my-list\"]/li[1]/a")
//	WebElement addsubfolderlink;

	@FindBy(xpath="//div[@class ='top_tggle']")
			WebElement dropdownmenu;
	
	
	@FindBy(xpath="//a[text() ='Admin-Tools']")
	WebElement adminToolslink ;
	
	
	@FindBy(xpath="//*[@id=\"admin-tools\"]/div[1]/a[1]")
	WebElement usermanagementlink;
	
	
	@FindBy(xpath="//i[@class='icon-group']")
	WebElement groupmanagementlink;
	
	@FindBy(xpath="//i[@class='icon-reorder']")
	WebElement globalkeywordslink;
	
	@FindBy(xpath="//i[@class='icon-columns']")
	WebElement categorieslink;
	
	@FindBy(xpath="//i[@class='icon-tags']")
	WebElement attributeslink;
	
	@FindBy(xpath="//i[@class='icon-bolt']")
	WebElement workflowactionslink;
	
	@FindBy(xpath="//i[@class='icon-star']")
	WebElement workflowstateslink;
	
	@FindBy(xpath="//i[@class='icon-sitemap']")
	WebElement workflowslink;;
	
	
	
	
	//Initializing the page method
		public HomePage () {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public boolean verifyLogoImage() {
			return logoimagelabel.isDisplayed();

		}
		public UserManagementPage clickOnUserManagementLink() {
			dropdownmenu.click();


			//TestUtil.IMPLICIT_WAIT;
		adminToolslink.click();
			//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

			usermanagementlink.click();
			return new UserManagementPage();
		}
		
		public GroupsManagementPage clickOnGroupsManagementLink() {
			dropdownmenu.click();
			adminToolslink.click();
			groupmanagementlink.click();
			return new GroupsManagementPage();

		}
		
		public GlobalKeywordsPage clickOnGlobalKeywordsLink() {
			dropdownmenu.click();
			adminToolslink.click();
			globalkeywordslink.click();
			return new GlobalKeywordsPage();
		}
	
		public  CategoriesPage clickOnCategoriesPageLink() {
			dropdownmenu.click();
			adminToolslink.click();
			categorieslink.click();
			return new CategoriesPage();
		}
		
		
		public AttributesPage clickOnAttributesPageLink() {
			dropdownmenu.click();
			adminToolslink.click();
			attributeslink.click();
			return new AttributesPage();
		}
		
		public WorkflowActionsPage clickOnWorkflowActionsPageLink() {
			dropdownmenu.click();
			adminToolslink.click();
			workflowactionslink.click();
			return new WorkflowActionsPage();
		}
	
		public WorkflowStatesPage clickOnWorkflowStatesPageLink() {
			dropdownmenu.click();
			adminToolslink.click();
			workflowstateslink.click();
			return new WorkflowStatesPage();
		}
		
		public WorkflowsPage clickOnWorkflowsPageLink() {
			dropdownmenu.click();
			adminToolslink.click();
			workflowslink.click();
			return new WorkflowsPage();
		}
		
		
		/*public  AddSubFolderPage clickOnAddSubFolderLinsk() {
			addsubfolderlink.click();
			return new AddSubFolderPage(); 
		}*/
		
}
