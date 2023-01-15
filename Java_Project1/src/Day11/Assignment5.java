package Day11;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment5 {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File f1=new File("../Java_Project1/Input.xls");
		Workbook wk=Workbook.getWorkbook(f1);
		Sheet ws=wk.getSheet(0);
		int row=ws.getRows();
		int column=ws.getColumns();
		/*for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				Cell c1=ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}*/
		File f2=new File("../Java_Project1/Output3.xls");
		WritableWorkbook WW=Workbook.createWorkbook(f2);
		WritableSheet wt=WW.createSheet("Sahil4", 0);
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				Cell c1=ws.getCell(j,i);
				Label L=new Label(j, i, c1.getContents());
				wt.addCell(L);
			}
		}
		WW.write();
		WW.close();
		
		

	}

}
