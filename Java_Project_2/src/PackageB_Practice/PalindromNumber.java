package PackageB_Practice;

import java.util.Scanner;

public class PalindromNumber {
	
	public void PalindromNumber() {
		int palindrom=0;
		System.out.println("Enter Number ");
		Scanner s=new Scanner(System.in);
		Integer value=s.nextInt();
	    int c=value;
		
		while(value>0) {
			int rem=value%10;
			palindrom=(palindrom*10)+rem;
			value=value/10;
		}
		if(c>=palindrom) {
			System.out.println("Number is a palndrom");
		}else {
			System.out.println("Not a palindrom");
		}
		
	}

	public static void main(String[] args) {
		
		PalindromNumber obj=new PalindromNumber();
		obj.PalindromNumber();
	}

}
