package Day3;

public class Assignment3 {
	
	//Third use of variable
	
	int Sahil;
	
	public void m1(int Sahil) {
		this.Sahil=Sahil; //Assign value to global variable
	}

	public static void main(String[] args) {
		Assignment3 obj=new Assignment3();
		obj.m1(10); // Calling m1 method and assigned value 10 to local variable and it goes from local to global
		System.out.println(obj.Sahil);

	}

}
