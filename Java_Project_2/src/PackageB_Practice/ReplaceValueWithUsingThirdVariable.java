package PackageB_Practice;

public class ReplaceValueWithUsingThirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		c=a+b; //c=30
		b=c-b; //b=10
		a=c-a; //a=20;
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);

	}

}
