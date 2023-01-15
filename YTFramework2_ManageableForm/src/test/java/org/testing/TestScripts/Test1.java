package org.testing.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.pages.LogOut;
import org.testing.pages.Login;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class Test1 extends Base {
	@Test
	public void Test() throws InterruptedException, IOException {
		Login login=new Login(driver, pr);
		login.Signin();
		String ExpectedUrl="https://www.youtube.com/";
		Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl );
		/*Thread.sleep(3000);
		WebElement Hamburg1 =driver.findElement(By.xpath(pr.getProperty("Hamburg1")));
		Hamburg1.click(); 
		WebElement Signin=driver.findElement(By.id(pr.getProperty("Signin")));
		Signin.click();
		ScreenshotCapture.takeScreenshot(driver, "D:\\Java_Automation Tool\\Screenshots\\TC1.png");
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
		Hamburg2.click();*/
		Thread.sleep(4000);
		WebElement Trending =driver.findElement(By.xpath(pr.getProperty("Trending")));
		Trending.click();
		/*Thread.sleep(4000);
		WebElement Y=driver.findElement(By.xpath(pr.getProperty("Y")));
		Y.click();
		Thread.sleep(2000);
		WebElement SignOut=driver.findElement(By.xpath(pr.getProperty("SignOut")));
		SignOut.click();*/
		LogOut logout=new LogOut(driver, pr);
		logout.logout();
		
		
	
		
	}
}
