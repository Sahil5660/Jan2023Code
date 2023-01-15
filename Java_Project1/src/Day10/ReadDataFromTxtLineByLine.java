package Day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTxtLineByLine {

	public static void main(String[] args) throws IOException {
		File f=new File("../Java_Project1/TXTFileHandling.txt"); //created the connection
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);//To read data line by line
        String a;
        while((a=br.readLine())!=null) {
        	System.out.println(a);
        	
        	
        }
	}

}
