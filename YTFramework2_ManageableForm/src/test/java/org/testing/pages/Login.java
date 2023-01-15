package org.testing.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void Signin() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		WebElement Hamburg1 =driver.findElement(By.xpath(pr.getProperty("Hamburg1")));
		Hamburg1.click(); 
		WebElement Signin=driver.findElement(By.id(pr.getProperty("Signin")));
		Signin.click();
		ScreenshotCapture.takeScreenshot(driver, "D:\\Java_Automation Tool\\Screenshots\\TC2.png");
		Thread.sleep(2000);
		LogsCapture.takelog("Test1", "Login is Succesfully"); 
		LogsCapture.takelog("Test1", "TestCase1 Passed Sucessfully");
		WebElement UserName=driver.findElement(By.xpath(pr.getProperty("UserName")));
		UserName.sendKeys("Selenium88888@gmail.com");
		Thread.sleep(2000);
		WebElement Next1=driver.findElement(By.xpath(pr.getProperty("Next1")));
		Next1.click();
		Thread.sleep(4000);
		WebElement Password=driver.findElement(By.xpath(pr.getProperty("Password")));
		Password.sendKeys("Test@123");
		Thread.sleep(3000);
		WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
		Next2.click();
		Thread.sleep(4000);
		WebElement Hamburg2 =driver.findElement(By.xpath(pr.getProperty("Hamburg2")));
		Hamburg2.click();
		
	}

}
