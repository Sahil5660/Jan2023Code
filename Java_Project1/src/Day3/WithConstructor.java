package Day3;

public class WithConstructor {
		int a,b,c,d,e;
		public WithConstructor(int a1,int b1,int c1,int d1,int e1) {
			a=a1;
			b=b1;
			c=c1;
			d=d1;
			e=e1;
		
			
		}

	public static void main(String[] args) {
		
		WithConstructor obj=new WithConstructor(1, 2, 3, 4, 5);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	}

}
