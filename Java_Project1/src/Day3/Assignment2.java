package Day3;

public class Assignment2 {
	public void m1() {
		this.m4(1, 2, 3);
	
		System.out.println("Default Method");
	}
	public void m2(int a) {
		this.m3(1, 2);
		
		System.out.println("1 Parametrized method");
	}
	public void m3(int a, int b) {
		this.m1();
		System.out.println("2 Parametrized method");
	}
	public void m4(int a, int b, int c) {
		this.m5(1, 2, 3, 4);
		System.out.println("3 Parametrized method");
	}
	public void m5(int a, int b, int c, int d) {
		System.out.println("4 Parametrized method");
	}

	public static void main(String[] args) {
		Assignment2 obj=new Assignment2();
		obj.m2(1);

	}

}
