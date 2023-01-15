package Day7;

import java.util.Scanner;

public class ElseIfCondition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=s.nextInt();
		if((marks>=0) && (marks<=35)) 
		{
			System.out.println("Failed");
		}
		else if((marks>=35)&&(marks<=60)) {
			System.out.println("Passed");
		}
		else if((marks>=60)&&(marks<=80)) {
			System.out.println("First Division");
		}
		else if((marks>=80)&&(marks<=100)) {
			System.out.println("Topper");
		}
		else {
			System.out.println();
		}
	}

}
