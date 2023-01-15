package Day3;

public class ClassA {
	
	public ClassA() {
	System.out.println("Default Constructor");
	}
	
	public ClassA(float a) {
		System.out.println("Parametrized Constructor");
		}
	public ClassA(int a,int b) {
		System.out.println("Two Parametrized Constructor");
		}

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		ClassA obj2=new ClassA(1.2F);
		ClassA obj3=new ClassA(1,2);

	}

}
