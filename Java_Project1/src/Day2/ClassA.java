package Day2;

public class ClassA {
	
	int Sahil; //Global variable
	public void m1() {
		Sahil=Sahil+1; //Local variable
		System.out.println("The variable value is="+Sahil);
		int r; // cannot use in other method due to local variable
	}
	public void m2() {
		//r=r+1; // cannot use in other method due to local variable so the error is displaying	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj=new ClassA();
		System.out.println(obj.Sahil);
		obj.m1();
		//r=r+1; 

	}

}
