package Day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment4TxtFileHandling {
	
	public void WriteData(int initialRow,int EndRow) throws IOException {
		File f=new File("../Java_Project1/WriteData.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		//System.out.println("Enter the data");
		Scanner s=new Scanner(System.in);
		
		String Data=s.nextLine();
		bw.newLine(); //for keeping first line blank
		for(int i=initialRow;i<=EndRow;i++) {
			//Data=s.nextLine();
			bw.write(Data); 
			bw.newLine();
		}
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		Assignment4TxtFileHandling obj=new Assignment4TxtFileHandling();
		obj.WriteData(2, 5);
	

	}

}
