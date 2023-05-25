import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Excel {
	
	

	public static void main(String[] args) throws IOException { 
	
	  FileInputStream fi=new FileInputStream("D:\\kpmg.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fi);
	  XSSFSheet sheet=workbook.getSheet("Astrus");
	  
	  int rows=sheet.getLastRowNum();
	  int cols=sheet.getRow(0).getLastCellNum();
	     
		   
		   
	
	
}

}
