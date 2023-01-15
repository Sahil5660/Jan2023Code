package Day3;

public class Class3 {
	
	//This Keyword Use
	
	public Class3() {
		this(1);
		System.out.println("Default Constructor");
	}
	public Class3(int a) {
		this(1,2);
		System.out.println("1 Parametrized Constructor");
	}
	public Class3(int a, int b) {
		System.out.println("2 Parametrized Constructor");
	}
	public Class3(int a, int b, int c) {
		System.out.println("3 Parametrized Constructor");
	}

	public static void main(String[] args) {
		Class3 obj=new Class3();

	}

}
