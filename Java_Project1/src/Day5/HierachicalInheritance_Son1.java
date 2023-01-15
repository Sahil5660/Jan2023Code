package Day5;

public class HierachicalInheritance_Son1 extends HierachicalInheritance_Father {
	//Both the son (Son1 and Son2)will be extend to Father properties in Hierachical

	public void Son1() {
		System.out.println("This is son1 method");
		
	}
	public static void main(String[] args) {
		
		HierachicalInheritance_Son1 obj=new HierachicalInheritance_Son1();
		obj.a=10;
		System.out.println(obj.a);
		obj.methodA();

	}

}
