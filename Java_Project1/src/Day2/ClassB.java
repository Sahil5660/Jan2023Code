package Day2;

public class ClassB {
	
	//((((10+2)+2)-2)*2)/2)
	
	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public int multi(int a,int b) {
		int c=a*b;
		return c;
	}
	public void devide(int a,int b) {
		int c=a/b;
		System.out.println("Devide result="+c);
		
	}

	public static void main(String[] args) {
	ClassB obj=new ClassB();
	int SumResult1=obj.sum(10, 2);
	System.out.println("Sum1 result="+SumResult1);
	int SumResult2=obj.sum(SumResult1, 2);
	System.out.println("Sum2 result="+SumResult2);
	int SubResult=obj.sub(SumResult2, 2);
	System.out.println("Sub result="+SubResult);
	int multiResult=obj.multi(SubResult, 2);
	System.out.println("multi result="+multiResult);
	obj.devide(multiResult, 2);
	

	}

}
