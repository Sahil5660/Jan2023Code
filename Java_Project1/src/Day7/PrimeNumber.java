package Day7;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the value of number");
		 int number=s.nextInt();
		  for(int i=1;i<=number;i++) {
			  if(number%i==0) {
				  count++;
			  }
		  }
			  if(count==2) {
				  System.out.println("Number is a prime number");
			  }else {
				  System.out.println("Number is not a prime number");
			  }
		  }
		 
		
	}
	
		
	
