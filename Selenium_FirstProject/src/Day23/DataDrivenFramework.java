package Day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class DataDrivenFramework {
	
	//Execution of the TCs with multiple data we can say Data driven framework
	
	@Test(dataProvider="dataProvider2")
	public void method(String s1,String s2,String s3) {
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	@DataProvider
	public Object[][] dataprovider1(){
		
		Object[][] data=new Object[3][3];
		/*data[0][0]="UserName1";
		data[0][1]="Password1";
		data[1][0]="UserName2";
		data[1][1]="Password2";
		data[2][0]="UserName3";
		data[2][1]="Password3";
		data[3][0]="UserName4";
		data[3][1]="Password4";*/
		data[0][0]="UserName1";
		data[0][1]="Password";
		data[0][2]="ID1";
		data[1][0]="UserName2";
		data[1][1]="Password2";
		data[1][2]="ID2";
		data[2][0]="UserName3";
		data[2][1]="Password3";
		data[2][2]="ID3";
		
		
		return data;
		
	}
	@DataProvider
	public Object[][] dataProvider2() throws BiffException, IOException  {
	File f=new File("D:\\Java_Automation Tool\\DataDrivenExelWithMultipleData.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	Object[][] data=new Object[r][c];
	
	for(int i=0;i<r;i++) {
		for(int j=0;j<c; j++){
		Cell c1=ws.getCell(j, i);
		data[i][j]=c1.getContents();
		}
		
	}
	return data;
 

}
}
