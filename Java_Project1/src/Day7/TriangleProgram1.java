package Day7;

import java.util.Scanner;

public class TriangleProgram1 {

	public static void main(String[] args) {
		int i;int j;int k;
		System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(i=0;i<=n;i++) {
			
		for(j=n;j>=i;j--) {
			System.out.print(" ");
			
		}
		for(k=1;k<=i;k++) {
			System.out.print("* ");
			
		}
		System.out.println();
		

	}

}
}
