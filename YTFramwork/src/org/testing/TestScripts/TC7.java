package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeMethod
	public void BeforeMethodClass4() {
		
		System.setProperty("webdriver.chrome.driver", "../YTFramwork/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
	}
	
	@Test
	public void TestClass4() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Hamburg1 =driver.findElement(By.xpath("//*[@id='guide-icon' or @icon='yt-icons:menu'][1]"));
		Hamburg1.click(); 
		WebElement Signin=driver.findElement(By.id("sign-in-button"));
		Signin.click();
		Thread.sleep(2000); 
		WebElement UserName=driver.findElement(By.xpath("//input[@type='email']"));
		UserName.sendKeys("Selenium88888@gmail.com");
		Thread.sleep(2000);
		WebElement Next1=driver.findElement(By.xpath("//*[text()='Next']"));
		Next1.click();
		Thread.sleep(4000);
		WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Test@123");
		Thread.sleep(3000);
		WebElement Next2=driver.findElement(By.xpath("//*[text()='Next']"));
		Next2.click();
		Thread.sleep(3000);
		WebElement Hamburg2 =driver.findElement(By.xpath("//*[@id='guide-icon' or @icon='yt-icons:menu'][1]"));
		Hamburg2.click(); 
		Thread.sleep(3000);
		WebElement WatchLater=driver.findElement(By.xpath("//*[text()='Watch later'][1]"));
		WatchLater.click();
		Thread.sleep(4000);
		WebElement Y=driver.findElement(By.xpath("//img[@id='img' or @src='https://yt3.ggpht.com/yti/AJo0G0kWOSB1XIgV6fEEn9Mckum79f0k6XI5puQxNA=s88-c-k-c0x00ffffff-no-rj-mo'][1]"));
		Y.click();
		Thread.sleep(2000);
		WebElement SignOut=driver.findElement(By.xpath("//*[text()='Sign out']"));
		SignOut.click();
		
	
		
	}
	@AfterMethod
	public void BrowserClose() {
		driver.quit();
		System.out.println("Closing the browser");
		
	}
	
}



