package Day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTxt {

	public static void main(String[] args) throws IOException {
		File f=new File("../Java_Project1/TXTFileHandling.txt"); //created the connection
        FileReader fr=new FileReader(f);
         int a; //took variable here int because return type of read method is Int
        while((a=fr.read())!=-1) {
        	System.out.println((char)a);
        }
	}

}
