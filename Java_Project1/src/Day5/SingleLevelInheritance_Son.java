package Day5;

public class SingleLevelInheritance_Son extends SingleLavelInheritance_Father {
	
	int b;
	
	public void method3() {
		System.out.println("This is a method-1 of Son Class");
	}
	public void method4() {
		System.out.println("This is a method-2 of Son Class");
	}

	public static void main(String[] args) {
		SingleLevelInheritance_Son obj=new SingleLevelInheritance_Son();
		obj.a=10;
		System.out.println("Variable of Father Class="+obj.a);
        obj.b=20;
        System.out.println("Variable of Son Class="+obj.b);
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
	}

}
