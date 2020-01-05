package seleniumprog;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xltest1 {
public static void main(String[] args) throws Exception {
	File f=new File("C:\\Users\\PRADAP\\Desktop\\book2.xlsx");
	   FileInputStream fis=new FileInputStream(f);
	   Workbook w=new XSSFWorkbook(fis);
	   Sheet sh=w.getSheet("Sheet1");
	   Row r=sh.getRow(0);
	   Cell c=r.getCell(1);
	   System.out.println(c.getStringCellValue());
	  
		}
		  
}

