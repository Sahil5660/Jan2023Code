package Day17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModifierKeyHandles {
	
	//This code is switching in between 2 windows tab only

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Selenium_FirstProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement element=driver.findElement(By.id("video-title"));
		//to perform multiple event we will use build().perform and for single event only .perform
		ac.keyDown(Keys.CONTROL).click(element).click(element).click(element).click(element).keyUp(Keys.CONTROL).build().perform();
		String FirstWindowAddress=driver.getWindowHandle();
		System.out.println("Before Switching URL is "+driver.getCurrentUrl());
		Set<String>AllWindowsAddress=driver.getWindowHandles();
		System.out.println("To find the number of total windows= "+AllWindowsAddress.size());
		int sahil=0;
		for(String s:AllWindowsAddress) {
			sahil=sahil+1;
			
			if(sahil==3) {
				driver.switchTo().window(s);
				break;
			}
		}
		System.out.println("After Switching URL is "+driver.getCurrentUrl());
		//driver.switchTo().window(FirstWindowAddress);
		//System.out.println("Finally URL is "+driver.getCurrentUrl());
		
		
		

	}

}
