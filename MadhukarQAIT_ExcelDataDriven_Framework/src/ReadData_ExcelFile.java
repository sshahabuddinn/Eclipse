import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_ExcelFile {

	public static void main(String[] args) throws IOException {
		//to specify file location
				FileInputStream fi= new FileInputStream("D:\\demodata.xlsx");
				//to specify workbook
				XSSFWorkbook workbook= new XSSFWorkbook(fi);
				//to specify worksheet
				XSSFSheet sheet=workbook.getSheet("Students");
				//to find number of rows
				int rows=sheet.getLastRowNum();
				int cols=sheet.getRow(0).getLastCellNum();
				System.out.println("Number of rows are: "+(rows+1));
				System.out.println("Number of columns are: "+cols);
				
				for(int r=0; r<= rows; r++) 
				{
					XSSFRow row=sheet.getRow(r);
					for(int col=0; col<cols;col++)
					{
						XSSFCell cell= row.getCell(col);
						String myVal=cell.toString();
						System.out.println(myVal);
					}
				}


	}

}
