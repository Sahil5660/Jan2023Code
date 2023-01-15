package Day6;

public class MethodOverloading {
	
	public void Airthmatic(int a,int b) {
		int c=(int) (a+b);
		System.out.println(c);
	}
	public void Airthmatic(float a,int b) {
		int c=(int) (a+b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.Airthmatic(2, 3);
		obj.Airthmatic(3, 4);
		

	}

}
