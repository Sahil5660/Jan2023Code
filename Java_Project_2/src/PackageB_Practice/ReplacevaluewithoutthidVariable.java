package PackageB_Practice;

public class ReplacevaluewithoutthidVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a+b; //30
		b=a-b; //b=10
		a=a-b;
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);

	}

}
