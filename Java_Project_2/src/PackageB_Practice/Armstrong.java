package PackageB_Practice;

import java.util.Scanner;

public class Armstrong {
	public void Armstrong() {
		int Armstrong=0;
		System.out.println("Enter Number ");
		Scanner s=new Scanner(System.in);
		Integer value=s.nextInt();
	    int c=value;
	    
	    while(value>0) {
	    	int rem=value%10;
	    	Armstrong =(rem*rem*rem)+Armstrong;
	    	value=value/10;
	    	
	    	
	    }if(c==Armstrong) {
	    	System.out.println("Number is a armstrong");
	    }else
	    {
	    	System.out.println("Not a armstrong");
	    }
	    
	}

	public static void main(String[] args) {
	
    Armstrong arm=new Armstrong();
    arm.Armstrong();
	}

}
