package Day11;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataRead {

	public static void main(String[] args) throws BiffException, IOException {
	File f=new File("../Java_Project1/Input.xls");
   Workbook wk=Workbook.getWorkbook(f);
   Sheet ws=wk.getSheet(0);// it will return the object of sheet
   int r=ws.getRows();
   int c=ws.getColumns();
   
   for(int i=0;i<r;i++) {
	   for(int j=0;j<c;j++) {
		   Cell c1=ws.getCell(j,i);
		   System.out.println(c1.getContents());
	   }
   }
	}

}
