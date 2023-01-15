package PackageA;

public class ClassA {
	int a;
	
	public void method1() {
		System.out.println("This is a method1");
	}

	public static void main(String[] args) {
		ClassA obj1=new ClassA();
		obj1.a=200;
	    obj1.method1();
	    System.out.println(obj1.a);
	    
	}
}