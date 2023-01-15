package Day7;

import java.util.Scanner;

public class LoopsCondition {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Please Enter a number");
	int a=s.nextInt();
	
	if(a%2==0) {
		System.out.println("Even Number");
	}
	else 
	{
        System.out.println("odd number");
	}

}
}