package DDF;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excell3 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fise=new FileInputStream("C:\\Users\\Triveni bora\\eclipse-workspace\\javaselenium\\ExternalResources\\TDdata.xlsx");
		Workbook wb=WorkbookFactory.create(fise);
		 Double Data=wb.getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(Data);

}
}
