package Day23;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

//This is a exact code to validate login page with multiple user accounts


public class GmailLoginWithMultipleData {
	
	ChromeDriver driver;
	@Test(dataProvider="dataProvider2")
	public void GoogleAccount(String s1, String s2) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium_FirstProject/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys(s1);
		WebElement Password=driver.findElement(By.name("pass"));
		Password.sendKeys(s2);
		WebElement name=driver.findElement(By.name("login"));
		name.click();
		driver.navigate().back();
		WebElement email2=driver.findElement(By.name("email"));
		email.sendKeys(s1);
		WebElement Password2=driver.findElement(By.name("pass"));
		Password.sendKeys(s2);
		WebElement name2=driver.findElement(By.name("login"));
		name.click();
		driver.navigate().back();
		WebElement email3=driver.findElement(By.name("email"));
		email.sendKeys(s1);
		WebElement Password3=driver.findElement(By.name("pass"));
		Password.sendKeys(s2);
		WebElement name3=driver.findElement(By.name("login"));
		name.click();
		
		
		
		
	}
	
	
	@DataProvider
	public Object[][] dataProvider2() throws BiffException, IOException  {
	File f=new File("D:\\Java_Automation Tool\\Gmail.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	Object[][] data=new Object[r][c];
	
	for(int i=0;i<r;i++) {
		for(int j=0;j<c; j++){
		Cell c1=ws.getCell(j, i);
		data[i][j]=c1.getContents();
		}
		
	}
	return data;
 

}

	
}
