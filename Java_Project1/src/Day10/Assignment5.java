package Day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment5 {
	
	public void CopyPaste() throws IOException {
		File f1=new File("../Java_Project1/TXTFileHandlingOutput.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		
		
		
		File f2=new File("../Java_Project1/Output.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		String a;
		while((a=br.readLine())!=null) {
		      bw.write(a);
		      bw.newLine();
		}
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		Assignment5 obj=new Assignment5();
		obj.CopyPaste();

	}

}
