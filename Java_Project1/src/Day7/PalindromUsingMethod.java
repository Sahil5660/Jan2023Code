package Day7;

import java.util.Scanner;

public class PalindromUsingMethod {
	
	public void Palindrom() {
		int Palindrom = 0;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=n;
		while(n>0) {
			int rem=n%10;
			Palindrom=(Palindrom*10)+rem;
			n=n/10;
		}
		if(c==Palindrom) {
			System.out.println("Number is a palindrom");
		}else {
			System.out.println("Number is not a palindrom");
		}
	}

	public static void main(String[] args) {
		PalindromUsingMethod obj=new PalindromUsingMethod();
		obj.Palindrom();

	}

}
