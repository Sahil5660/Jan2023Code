package PackageB_Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment2 {
	
	public void ReadDataOfRange(int intitial, int end) throws IOException {
		File f=new File("../Java_Project_2/Assignment-1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String Data;
		int deepak=0;
		while((Data=br.readLine())!=null) {
			deepak=deepak+1;
			
			if(deepak>=intitial && deepak<=end) {//1>=2 || 1<=3;2>=2 ||2<=3;3>=2 ||3<=3
				System.out.println(Data);
			}
			
			
		}
	}

	public static void main(String[] args) throws IOException {
	Assignment2 obj=new Assignment2();
	obj.ReadDataOfRange(2, 3);

	}

}
