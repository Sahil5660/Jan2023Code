package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationPoints {
ChromeDriver driver;
     @Test
	public void isDisplayed() {
		System.setProperty("webdriver.chrom.driver", "../Selenium_FirstProject/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Boolean element=driver.findElement(By.id("email")).isEnabled();
		System.out.println(element);
		Boolean IsDisplayed=driver.findElement(By.id("email")).isDisplayed();
		System.out.println(IsDisplayed);
	}
}
