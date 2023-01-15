package org.testing.Assertions;

public class Assert1 {
	
	public static void Assert(String ActualResult,String ExpectedResult) {
		
		if(ActualResult.equals(ExpectedResult)) {
			System.out.println("Assertion is getting passed");
		}else
		{
			System.out.println("Assertion is failed");
		}
		
	}
	
/*Below method to verify hard and soft combination assertions belongs to Test2
public static boolean Assert(String ActualResult,String ExpectedResult) {
		
		if(ActualResult.equals(ExpectedResult)) {
			System.out.println("Assertion is getting passed");
			return true;
		}else
		{
			System.out.println("Assertion is failed");
			return false;
		}
		
	}*/

}
