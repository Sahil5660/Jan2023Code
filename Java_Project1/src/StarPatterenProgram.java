
public class StarPatterenProgram {
	
	public void AcuteTriangle() {
		
		int i;int j;int k;
		
		for(i=0;i<=5;i++) {
			for(j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
public void LeftAngleTriangle() {
		
		int i;int j;int k;
		
		for(i=0;i<=5;i++) {
			for(j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public void ReverseTriangle() {
	
	int i;int j;int k;
	
	for(i=1;i<=5;i++) {
		for(j=5;j>=i;j--) {
			System.out.print("*");
		}
		
		System.out.println();
	}
}
public void RightAngleTriangle() {
	
	int i;int j;int k;
	
	for(i=1;i<=5;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
}
public void digitTriangle() {
	
	int i;int j;
	
	for(i=1;i<=5;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(i);
		}
		
		System.out.println();
	}
}
public void digitTriangle2() {
	
	int i;int j;
	
	for(i=1;i<=5;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(j);
		}
		
		System.out.println();
	}
}

	public static void main(String[] args) {
		StarPatterenProgram obj=new StarPatterenProgram();
		obj.AcuteTriangle();
		obj.LeftAngleTriangle();
		obj.ReverseTriangle();
		obj.RightAngleTriangle();
		obj.digitTriangle();
	    obj.digitTriangle2();

	}

}
