package Day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment2FileHandling {
	
/*create a method named readdataofrange and pass the initial row number and end row number
that method will read the data of that particular range*/

	public void ReadDataOfRange(int start , int end) throws IOException {
		File f=new File("../Java_Project1/TXTFileHandling.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int readdata=0;
		
		
		while((s=br.readLine())!=null) {
			
			readdata=readdata+1;
			if(readdata>=start && readdata<=end) {
			 System.out.println(s);
			}
			
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		Assignment2FileHandling obj=new Assignment2FileHandling();
		
		obj.ReadDataOfRange(1, 3);
		
		

	}

}
