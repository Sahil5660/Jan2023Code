package Day17;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElementsUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium_FirstProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		List<WebElement> all=driver.findElements(By.id("video-title"));
		
		//ac.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		//to perform multiple event we will use build().perform and for single event only .perform
		System.out.println("Total videos "+all.size());
		
		/*for(WebElement element:all) {
			element.click();
			Thread.sleep(3000);
			driver.navigate().back();
			driver.navigate().refresh();
			all=driver.findElements(By.id("video-title"));
			
			
			
		}*/
		for(int i=0;i<all.size();i++) {
			all.get(i).click();
			Thread.sleep(3000);
			driver.navigate().back(); //we were getting error here not intractable so we did refresh the page below and then again reinitialize the element
			driver.navigate().refresh();
			all=driver.findElements(By.id("video-title"));
			
		}
	}

}
