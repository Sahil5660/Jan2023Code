package Day7;

import java.util.Scanner;

public class ifelseladder {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	
	if(a>0) {
		if(a%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	
	if(a%2==1) {
		System.out.println("Even number again");
	}
	else {
		System.out.println("Odd number again");
	}
	}
		else {
			System.out.println("Enter positive number");
		}
	}
	}

