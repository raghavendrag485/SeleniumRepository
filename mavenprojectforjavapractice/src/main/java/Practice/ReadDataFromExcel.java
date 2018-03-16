package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class ReadDataFromExcel {
	WebDriver driver=new FirefoxDriver();
	DesiredCapabilities firefox=DesiredCapabilities.firefox();
	

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		
		Iterator<Row> rowitr=sheet.iterator();
		while(rowitr.hasNext()){
			Row row=rowitr.next();
			Iterator<Cell> cellitr=row.cellIterator();
			while(cellitr.hasNext()){
				
				Cell cell=cellitr.next();
				
				
			}
		}
	}

}
