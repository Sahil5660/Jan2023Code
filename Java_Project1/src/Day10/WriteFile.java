package Day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("../Java_Project1/TXTFileHandlingOutput.txt"); //created the connection
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw); //To write data in new line by line
        bw.write("My Name is Sahil");
        bw.newLine(); //it will move curser on next line
        bw.write("I am from HP");
        bw.close(); //for saving and closing the file
        
        	 
        	
        }
	}


	

