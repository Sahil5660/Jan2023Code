package PackageB_Practice;

import java.util.Scanner;

public class PatterenProgram {
	
	public void AcuteTriangle() {
		
		int i; int j; int k;
		System.out.println("Enter any number to print the AcuteTriangletable");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=0;i<=n;i++) { //to print the rows
			for(j=n;j>=i;j--) { // to print the space 
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
		//System.out.println("Enter any number to print the AcuteTriangletable");
		//Scanner s=new Scanner(System.in);
		for(i=0;i<=5;i++) { //to print the rows
			for(j=5;j>=i;j--) { // to print the space 
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
	//System.out.println("Enter any number to print the AcuteTriangletable");
	//Scanner s=new Scanner(System.in);
	for(i=0;i<=5;i++) { //to print the rows
		
		for(k=0;k<=i;k++) { //to print the space between *
			System.out.print("*");
		}
		System.out.println();
	}
}
public void ReverseTriangle() {
	
	int i; int j; int k;
	//System.out.println("Enter any number to print the AcuteTriangletable");
	//Scanner s=new Scanner(System.in);
	for(i=0;i<=5;i++) { //to print the rows
		
		for(k=5;k>=i;k--) { //to print the space between *
			System.out.print("*");
		}
		System.out.println();
	}
}
public void digitTriangle() {
	
	int i; int j; int k;
	//System.out.println("Enter any number to print the AcuteTriangletable");
	//Scanner s=new Scanner(System.in);
	for(i=1;i<=5;i++) { //to print the rows
		
		for(k=1;k<=i;k++) { //to print the space between *
			System.out.print(i);
		}
		System.out.println();
	}
}

	public static void main(String[] args) {
		PatterenProgram obj = new PatterenProgram();
		obj.AcuteTriangle();
		obj.LeftTriangle();
		obj.RightTriangle();
		obj.ReverseTriangle();
		obj.digitTriangle();

	}

}
