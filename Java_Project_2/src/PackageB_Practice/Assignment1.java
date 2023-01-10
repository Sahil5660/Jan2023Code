package PackageB_Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.sun.xml.internal.stream.util.BufferAllocator;

public class Assignment1 {
	
	public void ReadData(int rowno) throws IOException {
		File f=new File("../Java_Project_2/Assignment-1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		//Scanner s=new Scanner(System.in);
		String Data;
		int deepak = 0;
		
		while((Data=br.readLine())!=null) {
			deepak=deepak+1;
			if(deepak>=rowno) {
				System.out.println(Data);
				break;
			}
			
			
		}
			
		
	}
	

	public static void main(String[] args) throws IOException {
		Assignment1 obj=new Assignment1();
		obj.ReadData(3);

	}

}
