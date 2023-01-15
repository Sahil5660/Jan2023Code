package Day17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium_FirstProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		for(int i=0;i<=5;i++) {
			Thread.sleep(3000);
		ac.sendKeys(Keys.TAB).perform();
		}
	}

}
