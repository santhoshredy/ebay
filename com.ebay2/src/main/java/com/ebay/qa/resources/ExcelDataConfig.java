package com.ebay.qa.resources;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import java.io.File;
import java.io.FileInputStream;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelDataConfig(String excelPath) {
		try {
			File src=new File(excelPath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		Catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(String sheetName,int row,int column) {
		sh=wb.getSheet(sheetName);
		String data=sh.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
