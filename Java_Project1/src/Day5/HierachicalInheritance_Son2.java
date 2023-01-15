package Day5;

public class HierachicalInheritance_Son2 extends HierachicalInheritance_Father {
	//Both the son(Son1 and Son2) will be extend to Father properties in Hierachical
	public void Son2() {
		System.out.println("This is son2 method");
		
	}
	
	public static void main(String[] args) {
		HierachicalInheritance_Son2 obj=new HierachicalInheritance_Son2();
		obj.a=10;
		System.out.println(obj.a);
		obj.methodA();

	}

}
