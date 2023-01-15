package Day11;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment3 {
	public void ReadDataBasedUponRange(int Initialrow,int endRow) throws BiffException, IOException {
		File f=new File("../Java_Project1/Input.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		
		int row=s.getRows();
		int column=s.getColumns();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(i>=Initialrow && i<endRow) {
					Cell c1=s.getCell(j, i);
					System.out.println(c1.getContents());
				}
			}
		}
		
	}

	public static void main(String[] args) throws BiffException, IOException {
	Assignment3 obj =new Assignment3();
	obj.ReadDataBasedUponRange(0, 3);

	}

}
