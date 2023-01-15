package Day6;

public class MethodOverriding_ClassB extends MethodOverriding_ClassA {
	public void airthmatic(int a,int b) {
		int d=a*b;
		System.out.println("Value of d="+d);
	}

	public static void main(String[] args) {
		MethodOverriding_ClassB obj=new MethodOverriding_ClassB();
		obj.airthmatic(2, 3);
		obj.airthmatic(1, 2, 3);
		

	}

}
