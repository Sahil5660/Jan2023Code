package Day7;

public class DoWhileLoop {

	public static void main(String[] args) {
	 int i=0;
	 
	 do {
		 System.out.println("Print the value of i "+i);
		 i=i+1;
	 }
	 while(i<10);

	}

}

//Loops at least work because condition is checking at very last 

/*public static void main(String[] args) {
 int i=0;
 
 do {
	 System.out.println("Print the value of i "+i);
	 i=i+1;
 }
 while(i>10); condition is false but still body will execute once 

}

}*/