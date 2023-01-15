import java.util.Scanner;

public class ArmstrongNumber {
	
	public void ArmstrongNumber() {
		int arm=0;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		Integer No=s.nextInt();
		int c=No;
		
		while(No>0) {
			int rem=No%10;
			arm=(rem*rem*rem)+arm;
			No=No/10;
			
		}
		if(c==arm) {
			System.out.println("No is a armstrong");
		}else {
			System.out.println("Not a armstrong");
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber obj=new ArmstrongNumber();
		obj.ArmstrongNumber();

	}

}
