package Day5;

public class MultiLevelInheritance_Son extends MutliLevelInheritance_Father {
	
	int c;
	
	public void Son() {
		System.out.println("This is a method of Son Class");
	}

	public static void main(String[] args) {
		MultiLevelInheritance_Son obj=new MultiLevelInheritance_Son();
		
		obj.a=10;
		System.out.println("Variable of Grandfather "+obj.a);
		obj.Grandfather();
		obj.b=20;
		System.out.println("Variable of Father "+obj.b);
		obj.Father();
		obj.c=30;
		System.out.println("Variable of Son "+obj.c);
		obj.Son();

	}

}
