package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelfileUtilities {
	public String readDatafromExcl(String Sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fis=new FileInputStream(IconstantUtilities.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
		
	}

}
