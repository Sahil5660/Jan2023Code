package Day11;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment4 {
	
	public void writeData(int rowCount, int columnCount) throws IOException, RowsExceededException, WriteException {
		File f=new File("../Java_Project1/NewWrite.xls");
		
	  WritableWorkbook wb=Workbook.createWorkbook(f);
	  WritableSheet ws=wb.createSheet("Sahil2", 0);
	  for(int i=0;i<rowCount;i++) {
		  for(int j=0;j<columnCount;j++) {
			  Label L=new Label(j, i, "Deepak");
			  ws.addCell(L);
		  }
	  }
	  wb.write();
	  wb.close();
	}

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		// TODO Auto-generated method stub
		Assignment4 obj=new Assignment4();
		obj.writeData(2, 3);

	}

}
