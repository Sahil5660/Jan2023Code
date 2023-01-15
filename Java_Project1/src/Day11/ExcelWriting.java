package Day11;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWriting {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File f=new File("../Java_Project1/Output.xls");
		
	    WritableWorkbook wk=Workbook.createWorkbook(f);
	    
	    WritableSheet ws=wk.createSheet("Sahil", 0);
	    
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		
	    		Label L=new Label(j, i, "Sahillll");
	    		ws.addCell(L);
	    		
	    	}
	    }
	    	wk.write(); //for saving the file
	    	wk.close(); //for closing the file
	    }

	

}
