package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class Data_Driven_Read 	{
	
	public static void read_Particular_Data()throws IOException {
	
	
		File F = new File("C:\\Users\\Kamali\\eclipse-workspace\\Maven\\Customer_Details.xlsx");

		FileInputStream Fis = new FileInputStream(F);

		Workbook W = new XSSFWorkbook(Fis);

		Sheet sheetAt = W.getSheetAt(0);
		
		int row = sheetAt.getPhysicalNumberOfRows();
		
		int column = sheetAt.getRow(0).getPhysicalNumberOfCells();
		
		
		for (int i = 0; i<row; i++) {
			
			Cell cell = sheetAt.getRow(i).getCell(0);
			
			if (cell.getCellType().equals(CellType.STRING)) {
				
		          String value = cell.getStringCellValue();
		          System.out.println(value);
			}
			else if (cell.getCellType().equals(CellType.NUMERIC)) {
				
		          double celltext = cell.getNumericCellValue();
		          int num = (int) celltext;
		          System.out.println(num);
		          
		          
			}
		}
			
	}
	
	public static void main(String[] args) throws Throwable {
		read_Particular_Data();
	}
		}


	