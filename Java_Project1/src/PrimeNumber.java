import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		Integer n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("Number is a prime number");
			}else {
				System.out.println("Not a prime number");
			}
		}

	}


