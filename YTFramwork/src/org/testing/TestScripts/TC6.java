package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC6 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeMethod
	public void BeforeMethodClass6() {
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "../YTFramwork/chromedriver.exe");
		ChromeOptions option=new ChromeOptions(); //Tp disable notifications
		option.addArguments("--disable-notifications");
		 driver=new ChromeDriver(option);
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
	}
	
	@Test
	public void TestClass6() throws InterruptedException {
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
		Thread.sleep(4000);
		WebElement VideoClick=driver.findElement(By.id("video-title"));
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
		WebElement Comment=driver.findElement(By.xpath("//*[@id='placeholder-area' and @class='style-scope ytd-comment-simplebox-renderer']"));
		Thread.sleep(6000);
		Comment.click();
		Thread.sleep(2000);
		WebElement SendKeys=driver.findElement(By.xpath("//*[@id='contenteditable-root' or @aria-label='Add a comment...']"));
		SendKeys.sendKeys("Nice Video");
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//*[@id='submit-button']"));
		submit.click();
		
		//WebElement cancel=driver.findElement(By.id("cancel-button"));
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",Comment);
		
		
		//Comment.click();
		//js.executeScript("arguments[0].scrollIntoView();",Comment);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);",Comment);
		//Thread.sleep(3000);
		//Comment.click();
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



