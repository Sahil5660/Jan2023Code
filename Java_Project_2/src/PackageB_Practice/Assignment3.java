package PackageB_Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment3 {
	
	public void WriteData(int row) throws IOException {
	
	File f=new File("../Java_Project_2/Assignment-3.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	System.out.println("Enter data ");
	Scanner s=new Scanner(System.in);
	String data=s.nextLine();
	for(int i=1;i<=row;i++) {
		bw.write(data);
		bw.newLine();
		
	}
	bw.close();
	
	

	}
	public static void main(String[] args) throws IOException {
		Assignment3 obj=new Assignment3();
		obj.WriteData(3);

	}

}
