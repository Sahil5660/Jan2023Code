package Day7;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int Armstrong=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any value");
		int number=scan.nextInt();
		int c=number;
		
		while (number>0) {
			int rem=number%10;
			Armstrong=(rem*rem*rem)+Armstrong;
			number=number/10;
			
			
		}
		if(c==Armstrong) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Not armstrong");
		}
		

	}

}
