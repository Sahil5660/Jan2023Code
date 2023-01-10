package PackageB_Practice;

import java.util.Scanner;

public class PrimeNumber {
	
	public void primeNumber() {
		System.out.println("Enter Number ");
		Scanner s=new Scanner(System.in);
		Integer value=s.nextInt();
		int count=0;
		for(int i=1;i<=value;i++) {
			if(value%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Number is a prime");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

	public static void main(String[] args) {
		PrimeNumber obj=new PrimeNumber();
		obj.primeNumber();

	}

}
