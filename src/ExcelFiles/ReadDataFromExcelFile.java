package ExcelFiles;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class ReadDataFromExcelFile 
{

	
	public static void main(String[] args) throws Exception
	{
		
		File f=new File("E:\\interview\\test.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		//Workbook
		XSSFWorkbook wbk = new XSSFWorkbook(fis);
		
		XSSFSheet sh=wbk.getSheetAt(0);
		
		int totalRows=sh.getLastRowNum();
		
		XSSFRow r1=sh.getRow(0);
		
		int col=r1.getLastCellNum();
		System.out.println(col);
		
		
		
		for(int i=0; i<=totalRows; i++)
		{
			String rowcontent="";
			XSSFRow r=sh.getRow(i); 
			int totalCol=r.getLastCellNum();
			for(int j=0; j<totalCol; j++)
			{
				rowcontent=rowcontent+r.getCell(j).getStringCellValue()+ " ";
			}
			
			System.out.println(rowcontent.trim());
		}
		
		wbk.close();
		
		//XSSFRow r=sh.getRow(0);
		
		//XSSFCell c=r.getCell(0);
		
		//String s=sh.getRow(0).getCell(0).
		
		
	}
	
}
