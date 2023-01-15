import java.util.Scanner;

public class PalindromNumber {
	
	public void Palindrom() {
		int palindrom=0;
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		Integer number=s.nextInt();
		
		int c=number;
		
		while(number>0) {
			int rem=number%10;
			palindrom=(palindrom*10)+rem;
			number=number/10;
			
		}
		if(c==palindrom) {
			System.out.println("Number is a palindrom number");
		}else {
			System.out.println("Not a palindrom number");
		}
	}

	public static void main(String[] args) { 
		PalindromNumber obj=new PalindromNumber();
		obj.Palindrom();
		

	}

}
