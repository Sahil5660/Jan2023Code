package Day4;

import java.util.Scanner;

public class Assignment2 {
	
	//(((((x1+x2)+x3)*x4)-x5)/x6)
	
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println("Result of sum1 is= "+c);
		
		return c;
	}
	public int multi(int a,int b) {
		int c=a*b;
		return c;
	}
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public void devide(int a,int b) {
		int c=a/b;
		System.out.println("Final result is="+c);
	}

	public static void main(String[] args) {
		Assignment2 obj=new Assignment2();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1=s.nextInt();
		System.out.println("Enter the value of y1");
		int y1=s.nextInt();
		int sum1=obj.sum(x1, y1);
		
		System.out.println("Enter the value of x2");
		int x2=s.nextInt();
		int sum2=obj.sum(sum1, x2);
		System.out.println("Result of sum2 is= "+sum2);
		System.out.println("Enter the value of x3");
		int x3=s.nextInt();
		int multi=obj.multi(sum2, x3);
		System.out.println("Result of multi is= "+multi);
		System.out.println("Enter the value of x4");
		int x4=s.nextInt();
		int sub=obj.sub(multi, x4);
		System.out.println("Multi result is= "+sub);
		System.out.println("Enter the value of x5");
		int x5=s.nextInt();
		obj.devide(sub, x5);
		
		
		

	}

}
