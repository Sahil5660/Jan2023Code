package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut {
   ChromeDriver driver;
   Properties pr;
   public LogOut(ChromeDriver driver,Properties pr) {
	   this.driver=driver;
	   this.pr=pr;
   }

	public void logout() throws InterruptedException {
		Thread.sleep(4000);
		WebElement Y=driver.findElement(By.xpath(pr.getProperty("Y")));
		Y.click();
		Thread.sleep(2000);
		WebElement SignOut=driver.findElement(By.xpath(pr.getProperty("SignOut")));
		SignOut.click();
			
		}
	}


