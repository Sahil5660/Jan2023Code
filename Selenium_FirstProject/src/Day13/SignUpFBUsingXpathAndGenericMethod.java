package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SignUpFBUsingXpathAndGenericMethod {

public void dropdown(WebElement element,String visibletext) {
	Select s=new Select(element);
	s.selectByVisibleText(visibletext);
	
}

	public static void main(String[] args) throws InterruptedException {
		SignUpFBUsingXpathAndGenericMethod ob=new SignUpFBUsingXpathAndGenericMethod();
		
		System.setProperty("webdriver.chrome.driver", "../Selenium_FirstProject/chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op=driver.manage();
		Window win=op.window();
		win.maximize();
		WebElement Create=driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy' or @data-testid='open-registration-form-button']"));
        Create.click();
        Thread.sleep(3000);
        WebElement FirstName=driver.findElement(By.xpath("//*[@*='firstname']"));
        FirstName.sendKeys("Sahil");
        Thread.sleep(3000);
        WebElement Surname=driver.findElement(By.xpath("//*[@*='lastname']"));
        Surname.sendKeys("Sharma");
        WebElement Email=driver.findElement(By.xpath(" //input[contains(@id,'u_2_g')]"));
        Email.sendKeys("8802777905");
        WebElement Password=driver.findElement(By.xpath("//*[@autocomplete='new-password']"));
	    Password.sendKeys("Test@123");
	    WebElement DOB=driver.findElement(By.xpath(" //*[@name='birthday_day']"));
	    ob.dropdown(DOB, "6");
	    WebElement Month=driver.findElement(By.xpath("//*[@name='birthday_month']"));
	    ob.dropdown(Month, "Jun");
	    WebElement Year =driver.findElement(By.xpath("//*[@name='birthday_year']"));
	    ob.dropdown(Year, "1992");
	    WebElement Gender=driver.findElement(By.xpath("//*[text()='Male']"));
	    Gender.click();
	    WebElement Submit=driver.findElement(By.xpath("//*[@name='websubmit']"));
	    Submit.click();
	}

}
