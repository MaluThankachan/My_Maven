package excelread;

import java.io.IOException;

public class CombineStudyExcelMainClass {

	public static void main(String[] args) throws IOException 
	{
		
		
		String s = ComvineStudyExcelCode.readStringFromExcel(1, 0);
		double d = ComvineStudyExcelCode.readIntegerData(1, 1);
		System.out.println(s);
		System.out.println(d);

	}

}
