package Day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("../Java_Project1/TXTFileHandlingOutput.txt"); //created the connection
        FileWriter fw=new FileWriter(f, true);
        BufferedWriter obj=new BufferedWriter(fw); //To write data in new line by line
        obj.newLine();
        obj.write("Third Line");
        obj.newLine(); //it will move curser on next line
        obj.write("Fourth Line");
        obj.close(); //for saving and closing the file

	}

}
