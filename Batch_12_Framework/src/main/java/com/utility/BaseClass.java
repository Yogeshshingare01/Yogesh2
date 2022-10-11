package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider confi;
	@BeforeSuite
	public void BS() throws Exception {
		 confi=new ConfigDataProvider();
	}
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get(confi.get_BaseUrl_QA1());
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void AM() {
		driver.close();
	}
	

}
