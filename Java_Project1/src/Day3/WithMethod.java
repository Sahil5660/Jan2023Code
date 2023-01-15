package Day3;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class WithMethod {
	int a,b,c,d,e;
	public void m1(int a1,int b1,int c1,int d1,int e1) {
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;
	
		
	}
	public static void main(String[] args) {
		WithMethod obj=new WithMethod();
		obj.m1(1, 2, 3, 4, 5);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);

	}

}
