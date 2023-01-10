package PackageB_Practice;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment1_JXLHandling {
	public void ReadDataBasedUponRowNoColumnNo(int rowNo,int columnNo) throws BiffException, IOException {
		File f=new File("../Java_Project_2/Input.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet s=wk.getSheet(0);
		int row=s.getRows();
		int column=s.getColumns();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if((i==rowNo) && (j==columnNo)) {
					
					Cell c1=s.getCell(j, i);
					System.out.println(c1.getContents());
					
				}
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		Assignment1_JXLHandling obj=new Assignment1_JXLHandling();
		obj.ReadDataBasedUponRowNoColumnNo(1, 2);

	}

}
