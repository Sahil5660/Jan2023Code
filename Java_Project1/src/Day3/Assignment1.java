package Day3;

public class Assignment1 {
	
	//4 parametrized Constructor
	//3 Paramterized Constructor
	//Default Constructor
	//2 Paramterized Constructor
	//1 Paramterized Constructor
	
	public Assignment1() {
		this(1,2,3);
	
		System.out.println("Default Constructor");
	}
	public Assignment1(int a) {
		this(1,2);
		
		System.out.println("1 Parametrized Constructor");
	}
	public Assignment1(int a, int b) {
		this();
		System.out.println("2 Parametrized Constructor");
	}
	public Assignment1(int a, int b, int c) {
		this(1,2,3,4);
		System.out.println("3 Parametrized Constructor");
	}
	public Assignment1(int a, int b, int c, int d) {
		System.out.println("4 Parametrized Constructor");
	}

	public static void main(String[] args) {
		Assignment1 obj=new Assignment1(10);

	}

}
