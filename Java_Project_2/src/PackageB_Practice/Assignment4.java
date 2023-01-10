package PackageB_Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment4 {
	public void WriteDataInRange(int intitial, int end) throws IOException {
		
		File f=new File("../Java_Project_2/Assignment-3.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter data ");
		Scanner s=new Scanner(System.in);
		String data=s.nextLine();
		bw.newLine();
		
		for(int i=intitial;i<=end;i++) {
			bw.write(data);
			bw.newLine();
		}
		bw.close();
		
		
	}

	public static void main(String[] args) throws IOException {
		Assignment4 obj=new Assignment4();
		obj.WriteDataInRange(2, 7);

	}

}
