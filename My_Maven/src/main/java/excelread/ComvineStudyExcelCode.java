package excelread;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ComvineStudyExcelCode 
{
	//file-->workbbok-->sheet-->row-->col-->value return
	//fileloc--.workbook--.Mysheet--.i--j--
	//data fetching database this class used
	//this class two methods 1)string value return 2)Integer value deturn
	//Example e = new Example();
	//int a;
	
	public static FileInputStream f ;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	//public static XSSFRow r;
	//public static XSSFCell c;
	
	
	//I need to get string value , this method is created by us
	public static String readStringFromExcel(int i, int j) throws IOException
	{
		f = new FileInputStream("C:\\Users\\MaluL\\OneDrive\\Desktop\\Book1.xlsx"); //fetching the file location
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1") ;//getSheet() is predefined
		XSSFRow r = s.getRow(i); //getRow() is predefined nd i indicates row
		XSSFCell c = r.getCell(j); //getCell() is predefined nd j indicates row
		return c.getStringCellValue(); //getStringCellValue()
	}
	public static double readIntegerData(int i , int j) throws IOException
	{
		f = new FileInputStream("C:\\Users\\MaluL\\OneDrive\\Desktop\\Book1.xlsx"); //fetching the file location
		w = new XSSFWorkbook(f); //workbook is inside the file
		s = w.getSheet("Sheet1") ; //sheet is inside the workbook
		XSSFRow r = s.getRow(i); //XSSFRow is predefined class nd it denoted to i nd used to fetch row
		XSSFCell c = r.getCell(j);//XSSFCell is predefined class nd it denoted to j nd used to fetch col
		return c.getNumericCellValue();	//it takes integer values
	}


		
	
	


}
