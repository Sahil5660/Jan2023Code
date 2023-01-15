package Day7;

import java.util.Scanner;

public class FibanociiSeriesByUsingMethod {
	
	public void Fibnocci() {
	int a=0;int b=1; int c;
	System.out.println("Enter number to print Fibonocci series");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	for(int i=0;i<=n;i++) {
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
	}

	public static void main(String[] args) {
		FibanociiSeriesByUsingMethod obj=new FibanociiSeriesByUsingMethod();
		obj.Fibnocci();
	

	}

}
