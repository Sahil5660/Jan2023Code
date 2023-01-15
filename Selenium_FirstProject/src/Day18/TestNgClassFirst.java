package Day18;

//Before suit is a collection of test cases
//Main method is not required in testNg
// We can set test case priority small value will execute first
//We can set dependency as below on TestNG, lets suppose TestCase1 is depend on Testcase2
//Before method and After method will execute with every test case
//Most important difference we can execute multiple classes having mandatory annotation test using testNg.xml
//We can generate the report from TestNG just refresh the project and you will get test-output folder and in that folder you will get index.html just open with browser that file
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClassFirst {
	
	@Test/*(priority=1)*/ (dependsOnMethods="abc")
	public void xyz() {
		System.out.println("Test1 Annotation");
	}
	@Test(priority=0)
	public void abc() {
		System.out.println("Test2 Annotation");
	}
    
	@BeforeSuite
	public void m1() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void m2() {
		System.out.println("After Suite");
	}
	@BeforeTest
	public void m3() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void m4() {
		System.out.println("After Test");
	}
	@BeforeClass
	public void m5() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void m6() {
		System.out.println("After Class");	
	}
	@BeforeMethod
	public void m7() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void m8() {
		System.out.println("After Method");	
	}
}
