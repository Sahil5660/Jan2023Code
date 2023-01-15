package Day7;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		int rem; int Palindrom=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int c=n; //storing the value of n into c variable for furhter use
		
		while(n>0) {
			rem=n%10;
			Palindrom=(Palindrom*10)+rem;
			n=n/10;
			
		}
		if(c==Palindrom) {
			System.out.println("Palindrom Number");
		}else {
			System.out.println("Not a palindrom number");
		}

	}

}
