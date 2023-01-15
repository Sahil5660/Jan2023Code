package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
    
	@BeforeMethod
	public void BeforeMethod() throws IOException {
		System.setProperty("webdriver.chrome.driver", "../YTFramwork/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		File f=new File("../YTFramework2_ManageableForm/Object.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
		} 
	@AfterMethod
	public void BrowserClose() {
		driver.quit();
		System.out.println("Closing the browser");
		
	}
}
