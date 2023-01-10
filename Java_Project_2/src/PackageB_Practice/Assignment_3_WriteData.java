package PackageB_Practice;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment_3_WriteData {
	
	public void WriteData(int rowCount,int columnCount) throws IOException, RowsExceededException, WriteException {
		File f=new File("../Java_Project_2/Output.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Sahil", 0);
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				
				Label L=new Label(j, i, "My Name is Sahil Sharma");
				ws.addCell(L);
				
			}
			wk.write();
			wk.close();
		}
	}

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		Assignment_3_WriteData obj=new Assignment_3_WriteData();
		obj.WriteData(1, 2);

	}

}
