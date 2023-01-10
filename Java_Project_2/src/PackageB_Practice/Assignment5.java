package PackageB_Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment5 {
	
	public void CopyPaste() throws IOException {
		File f=new File("../Java_Project_2/Assignment-1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		File F=new File("../Java_Project_2/Assignment-3.txt");
		FileWriter fw=new FileWriter(F);
		BufferedWriter bw=new BufferedWriter(fw);
		String data;
		while((data=br.readLine())!=null) {
			bw.write(data);
			bw.newLine();
			
		}
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Assignment5 obj=new Assignment5();
		obj.CopyPaste();

	}

}
