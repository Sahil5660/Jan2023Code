package Day17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AnotherLogicWindowsSwitching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","../Selenium_FirstProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Options op=driver.manage();
	     Window win =op.window();
	     win.maximize();
	     Actions ac=new Actions(driver);
	     WebElement video=driver.findElement(By.id("video-title"));
	     ac.keyDown(Keys.CONTROL).click(video).click(video).click(video).click(video).keyUp(Keys.CONTROL).build().perform();
	      String firsttab=driver.getWindowHandle(); //storing first tab address
	      System.out.println("Before switching URL is "+driver.getCurrentUrl());
	      Set<String>alltabs=driver.getWindowHandles();
	      System.out.println(alltabs.size());
	      String thirdtabURL="https://www.youtube.com/watch?v=ElZfdU54Cp8";
	      
	      for(String s:alltabs) {
	    	  driver.switchTo().window(s);
	    	  if(driver.getCurrentUrl().equals(thirdtabURL)) {
	    	  break;
	      }
	      }
	      System.out.println("After switching URL is "+driver.getCurrentUrl());
	      

	}

}
