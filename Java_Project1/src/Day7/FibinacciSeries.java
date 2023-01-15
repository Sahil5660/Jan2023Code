package Day7;

import java.util.Scanner;

public class FibinacciSeries {

	public static void main(String[] args) {
		
		int a=0;int b=1; int c;
		System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		
		int number=scan.nextInt();
		
		for(int i=0;i<=number;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
