package Day7;

import java.util.Scanner;

public class TriangleProgramByUsingMethod {
	
	public void AcuteTriangle() {
		int i; int j; int k;
		System.out.println("Enter any number to print the AcuteTriangletable");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=0;i<=n;i++) { //to print the rows
			for(j=n;j>i;j--) { // to print the space 
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) { //to print the space between *
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void LeftTriangle() {
		int i; int j; int k;
		System.out.println("Enter any number to print the LeftAngletable");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=0;i<=n;i++) { //to print the rows
			for(j=n;j>i;j--) { // to print the space 
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) { //to print the space between *
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void RightTriangle() {
		int i; int j; int k;
		System.out.println("Enter any number to print the RightAngletable");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=0;i<=n;i++) { //to print the rows i=0 
			for(j=0;j<=i;j++) { //to print the space between *
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void SquareBox() {
		int i; int j; int k;
		System.out.println("Enter any number to print the RightAngletable");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=0;i<=n;i++) { //to print the rows i=0 
			for(j=0;j<=n;j++) { //to print the column
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void SquareBoxInt() {
		int i; int j;
		for(i=1;i<=5;i++) { //to print the rows  
			for(j=1;j<=5;j++) { //to print the column
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	//********************************************
	
	public void SquareBoxInt1() {
		int i; int j;
		for(i=1;i<=5;i++) { //to print the rows  
			for(j=1;j<=5;j++) { //to print the column
				System.out.print(j);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		TriangleProgramByUsingMethod obj=new TriangleProgramByUsingMethod();
		obj.AcuteTriangle();
		obj.LeftTriangle();
		obj.RightTriangle();
		obj.SquareBox();
		obj.SquareBoxInt();
		obj.SquareBoxInt1();

	}

}
