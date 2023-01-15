package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
	
	public void dropDownHandling(WebElement element,String Visibletext) {
		Select s=new Select(element);
		s.selectByVisibleText(Visibletext);
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SignUp obj=new SignUp();
	  System.setProperty("webdriver.chrome.driver", "../Selenium_FirstProject/chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      
      //driver.manage/window.maximize();
      Options op=driver.manage();
      Window wi=op.window();
      wi.maximize();
      
      /*WebElement user=driver.findElement(By.cssSelector("input#email"));
      user.sendKeys("Deepakdeps");
      WebElement Password=driver.findElement(By.cssSelector("input#pass"));
      Password.sendKeys("12345");*/
      Thread.sleep(3000);
      WebElement CreateAccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
      CreateAccount.click();
      Thread.sleep(4000);
      WebElement FirstName=driver.findElement(By.name("firstname"));
      FirstName.sendKeys("Sahil");
      WebElement LastName=driver.findElement(By.cssSelector("input[name='lastname']"));
      LastName.sendKeys("Sharma");
      WebElement MobNo=driver.findElement(By.cssSelector("input[name='reg_email__']"));
      MobNo.sendKeys("8802777905");
      WebElement Password=driver.findElement(By.cssSelector("input[data-type='password']"));
      Password.sendKeys("Test@123");
      WebElement Day=driver.findElement(By.name("birthday_day"));
      obj.dropDownHandling(Day, "24");
      Thread.sleep(3000);
      WebElement Month=driver.findElement(By.name("birthday_month"));
      obj.dropDownHandling(Month, "Jun");
      Thread.sleep(3000);
      WebElement Year=driver.findElement(By.name("birthday_year"));
      obj.dropDownHandling(Year, "1992");
      Thread.sleep(3000);
      WebElement Gender=driver.findElement(By.xpath("//*[text()='Male']"));
      Gender.click();
	}

}
