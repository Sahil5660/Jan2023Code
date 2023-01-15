package Day7;

import java.util.Scanner;

public class ArmstrongNumberUsingMethod {
	
	public void Armstrong() {
		int Armstrong=0;
	System.out.println("Enter any number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int c=n;
	
	while(n>0) {
		int rem=n%10;
		Armstrong=(rem*rem*rem)+Armstrong;
		n=n/10;
	}
	if(c==Armstrong) {
		System.out.println("Armstrong number");
	}else {
		System.out.println("Not Armstrong Number");
	}
	}

	public static void main(String[] args) {
		
		ArmstrongNumberUsingMethod obj=new ArmstrongNumberUsingMethod();
		obj.Armstrong();
		

	}

}
