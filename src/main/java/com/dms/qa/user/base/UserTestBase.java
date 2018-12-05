package com.dms.qa.user.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UserTestBase {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {

		Properties prop = new Properties ();
		FileInputStream ip = new FileInputStream("/home/haree/Desktop/Hari/DMSTest/src/main/java/com/dms/qa/config/config.properties");
		prop.load(ip);

		//System.out.println(prop.getProperty("name"));
		String url1 = prop.getProperty("url");

		//System.out.println(url);

		String browserName = prop.getProperty("browser");

		//System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/Hari/chromedriver");
			driver = new ChromeDriver(); // launch chrome
		} 
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/internetexplorerdriver");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url1);
		
		driver.findElement(By.xpath(prop.getProperty("name1_xpath"))).sendKeys(prop.getProperty("name"));
		driver.findElement(By.xpath(prop.getProperty("pass1_xpath"))).sendKeys(prop.getProperty("pass"));
        driver.findElement(By.xpath(prop.getProperty("btn_xpath"))).click();

        Thread.sleep(1000);
         driver.close();
}
}