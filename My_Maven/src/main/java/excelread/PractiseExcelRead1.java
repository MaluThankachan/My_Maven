package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PractiseExcelRead1
{
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	public static XSSFRow r;
	public static XSSFCell c;
	
	public static String readStringValueFromExcel(int i , int j) throws IOException
	{
		f = new FileInputStream("C:\\Users\\MaluL\\OneDrive\\Desktop\\PractiseExcelRead.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sample1");
		r = s.getRow(i);
		c = r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static int readIntegerValueFromExcel(int i , int j) throws IOException
	{
		f = new FileInputStream("C:\\Users\\MaluL\\OneDrive\\Desktop\\PractiseExcelRead.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sample1");
		r = s.getRow(i);
		c = r.getCell(j);
		return (int) c.getNumericCellValue();
	}

}
