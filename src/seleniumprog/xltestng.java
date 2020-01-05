package seleniumprog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xltestng {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\PRADAP\\Desktop\\book2.xlsx");
   FileInputStream fis=new FileInputStream(f);
   Workbook w=new XSSFWorkbook(fis);
   Sheet sh=w.getSheet("Sheet1");
   for(int i=0; i<sh.getPhysicalNumberOfRows();i++) {
	   Row r=sh.getRow(i);
   for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
	   Cell c=r.getCell(j);
	   if(c.getCellType()==0) {                           //iterate for all values
		   System.out.println(c.getNumericCellValue());
		    }
	   else if (c.getCellType()==1) {
		   System.out.println(c.getStringCellValue());
		
	}
	  
   }
   }
   }

	
}
	


