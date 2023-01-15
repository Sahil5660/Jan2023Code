package Day7;

import java.util.Scanner;

//By using method

public class PrimeNumberDuplicate {
	int count;
	
	
	public void Prime(int n) {
		//System.out.println("Enter any value");
		//Scanner s=new Scanner(System.in);
		//n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("Number is a prime number");
			}
			else {
				System.out.println("Not  prime number");
			}
		
	}

	public static void main(String[] args) {
		PrimeNumberDuplicate obj=new PrimeNumberDuplicate();
		obj.Prime(9);
		
		
		
			
		}
	//**********************Another way
	/*public void Prime() {
		//System.out.println("Enter any value");
		//Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("Number is a prime number");
			}
			else {
				System.out.println("Not  prime number");
			}
		
	}

	public static void main(String[] args) {
		PrimeNumberDuplicate obj=new PrimeNumberDuplicate();
		obj.Prime();
		
		
		
			
		}*/

	}


