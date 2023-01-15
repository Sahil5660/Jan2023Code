package org.testing.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assert1;
import org.testing.base.Base;
import org.testing.pages.LogOut;
import org.testing.pages.Login;
import org.testng.annotations.Test;

public class Test2 extends Base {
	@Test
	public void TestClass2() throws InterruptedException, IOException {
		
		Login login=new Login(driver, pr);
		login.Signin();
		String ExpectedUrl="https://www.youtube.com/";
		Assert1.Assert(driver.getCurrentUrl(), ExpectedUrl);
		
		/*Hard and Soft Combination for assertion as below by using assertTrue method
		Assert.assertTrue(Assert1.Assert(driver.getCurrentUrl(), "ExpectedUrl"));*/
		
		/*Thread.sleep(3000);
		WebElement Hamburg1 =driver.findElement(By.xpath(pr.getProperty("Hamburg1")));
		Hamburg1.click(); 
		WebElement Signin=driver.findElement(By.id(pr.getProperty("Signin")));
		Signin.click();
		Thread.sleep(2000); 
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
		Thread.sleep(4000);*/
		WebElement History=driver.findElement(By.xpath(pr.getProperty("History")));
		History.click();
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
