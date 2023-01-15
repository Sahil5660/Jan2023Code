package Day7;

public class SwappingNumberByUsingThirdVariable {

	public static void main(String[] args) {
	int a=12;
	int b=24;
	int c;
	c=a; //means c value become 12
	b=c; //b value become 12
	a=c+b; //value of a become c=24
	System.out.println("Value of a="+a);
	System.out.println("Value of b="+b);

	}

}
