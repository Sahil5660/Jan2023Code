package Day7;

public class SwappingNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=12;
		b=a+b; //means value of b=22
		a=b-a; //means value of a become a=12
		b=b-a;
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		

	}

}
