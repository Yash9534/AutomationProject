package com.actitime.generic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class for data driver testing
 * @author Asus
 *
 */
public class FileLib {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getPropertyData(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;	
}
/**
 * 
 * @param SheetName
 * @param row
 * @param cell
 * @return String
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * 
 * @param SheetName
 * @param row
 * @param cell
 * @param data
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void setExcelValue(String SheetName,int row,int cell,String data) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(SheetName).getRow(row).getCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();	
}
}
