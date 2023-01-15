package Day9;

public class StaticKeyWord {
	
	 //In case of static keyword memory will be saved on class level
	//We can make method and variable as a static
	//Static method can use only static variables
	//Non static method can use static and non static variables
	
	static int a;
	 
	public static void abc() {
		a=20;
		System.out.println("Enter number");
	}
	

	public static void main(String[] args) {
		
		StaticKeyWord.a=10;
		System.out.println(a);
		StaticKeyWord.abc();

	}

}
