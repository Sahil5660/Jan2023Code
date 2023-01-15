package PackageA;

public class Calculation {
	//(10+2)(5-2)
	
	public int sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum Result is:"+c);
		return c;
		
		
	}
	public int sub(int d,int e) {
		int g=d-e;
		System.out.println("Sub Result is:"+g);
		return g;
		
	}
	public void multi(int i,int j) {
		int k=i*j;
		System.out.println("Final Result is:"+k);
		
		
	}
	

	public static void main(String[] args) {
		Calculation obj=new Calculation();
		int sum=obj.sum(10, 2);
		int sub=obj.sub(5, 2);
		obj.multi(sum, sub);

	}

}
