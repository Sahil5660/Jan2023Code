package Day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment1FileHandling {
	/*Create a method named readdata and pass the row number and that method
	will read the data of that particular row*/
	
	public void ReadData(int rownumber) throws IOException {
		File f=new File("../Java_Project1/TXTFileHandling.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int readline=0;
		 
		while((s=br.readLine()) != null) {
			readline=readline+1;
			if(readline==rownumber) {
				System.out.println(s);
				break;
			}
			
			
			
		}
	}
	

	public static void main(String[] args) throws IOException {
		Assignment1FileHandling obj=new Assignment1FileHandling();
		obj.ReadData(3);

	}

}
