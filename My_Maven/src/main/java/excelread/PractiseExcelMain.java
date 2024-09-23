package excelread;

import java.io.IOException;

public class PractiseExcelMain 
{

	public static void main(String[] args) throws IOException
	{
	String s =  PractiseExcelRead1.readStringValueFromExcel(0,2);
	System.out.println(s);
	int i = PractiseExcelRead1.readIntegerValueFromExcel(0,0);
	System.out.println(i);
	}
	
}
