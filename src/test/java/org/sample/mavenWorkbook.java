	package org.sample;
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class mavenWorkbook {
		
		public static void main(String[] args) throws IOException {
			File a = new File ("D:\\Maven.xlsx");
			FileInputStream s = new FileInputStream(a);
			Workbook w= new XSSFWorkbook(s);
			Sheet sheet = w.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < physicalNumberOfRows; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);
					
					int cellType = cell.getCellType();
					if (cellType==1) {
						String stringCellValue = cell.getStringCellValue();	
						System.out.println(stringCellValue);
						}
					 else {
						 double numericCellValue = cell.getNumericCellValue();
						 System.out.println(numericCellValue);
						 
					}
					
				} 	
			}
				
			}
		}