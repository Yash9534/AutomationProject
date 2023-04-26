package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fs=new FileInputStream("./data/testscript.xlsx");
Workbook wb = WorkbookFactory.create(fs);
int rowCount =wb.getSheet("InvalidLogin").getLastRowNum();
for(int i=1;i<=rowCount;i++)
{
	String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
	String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
	System.out.println(un+" "+pw);
}
	}
}
