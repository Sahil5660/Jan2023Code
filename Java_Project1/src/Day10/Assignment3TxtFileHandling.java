package Day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment3TxtFileHandling {
	
	public void WriteData(int rowcount) throws IOException {
		File f=new File("../Java_Project1/WriteDataTillrow.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner s=new Scanner(System.in);
		String Data=s.nextLine();
		for(int i=1;i<=rowcount;i++) {
			
			bw.write(Data);
			bw.newLine();
				
		}
		bw.close();
		
		
		
	}

	public static void main(String[] args) throws IOException {
		Assignment3TxtFileHandling obj=new Assignment3TxtFileHandling();
		obj.WriteData(3);

	}

}
