package org.testing.TestScripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.pages.LogOut;
import org.testing.pages.Login;
import org.testng.annotations.Test;

public class Test6 extends Base {
	@Test
	public void TestClass6() throws InterruptedException, IOException {
		Login login=new Login(driver, pr);
		login.Signin();
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
		Thread.sleep(4000);*/
		WebElement VideoClick=driver.findElement(By.id(pr.getProperty("VideoClick")));
		VideoClick.click();
		//JavascriptExecutor js= (JavascriptExecutor)driver; 
		//js.executeScript("window.scrollBy(0,5000)","");
		
		
		//Actions ac=new Actions(driver);

		Thread.sleep(4000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",Comment);
		js.executeScript("window.scrollBy(0,400)");
		
		//ac.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(6000);
		WebElement Comment=driver.findElement(By.xpath(pr.getProperty("Comment")));
		Thread.sleep(6000);
		Comment.click();
		Thread.sleep(2000);
		WebElement SendKeys=driver.findElement(By.xpath(pr.getProperty("SendKeys")));
		SendKeys.sendKeys("Nice Video");
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath(pr.getProperty("Submit")));
		submit.click();
		
		//WebElement cancel=driver.findElement(By.id("cancel-button"));
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",Comment);
		
		
		//Comment.click();
		//js.executeScript("arguments[0].scrollIntoView();",Comment);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);",Comment);
		//Thread.sleep(3000);
		//Comment.click();
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
