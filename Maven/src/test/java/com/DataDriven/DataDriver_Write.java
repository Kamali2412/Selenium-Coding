package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver_Write {

	public static void Write_Data() throws Throwable {

		File f = new File("C:\\Users\\Kamali\\eclipse-workspace\\Maven\\Customer_Details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet Createsheet = w.createSheet("User Detail");

		Row CreateRow = Createsheet.createRow(0);

		Cell CreateCell = CreateRow.createCell(0);

		CreateCell.setCellValue("Keerthana");

		w.getSheet("User Detail").getRow(0).createCell(1).setCellValue("010");
		w.getSheet("User Detail").createRow(1).createCell(0).setCellValue("Vasu");
		w.getSheet("User Detail").getRow(1).createCell(1).setCellValue("011");
		w.getSheet("User Detail").createRow(2).createCell(0).setCellValue("Preethi");
		w.getSheet("User Detail").getRow(2).createCell(1).setCellValue("012");
		
		FileOutputStream Fos = new FileOutputStream(f);

		w.write(Fos);

		w.close();

	}

	public static void main(String[] args) throws Throwable {
		Write_Data();
	}

}
