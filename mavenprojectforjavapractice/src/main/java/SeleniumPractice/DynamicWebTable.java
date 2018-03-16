package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/table/");
		
		//to locate web t table
		WebElement myTable=driver.findElement(By.xpath("/html/body/table/tbody"));
		
		//to get no of rows
		List<WebElement> rows=myTable.findElements(By.tagName("tr"));
		int rowcount=rows.size();
		System.out.println("No of rows:"+rowcount);
		
		//loop will execute till the last row of table
		for(int i=0;i<rowcount;i++){
	    		
		//to get no of columns
		List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
		int colcount=col.size();
		System.out.println("No of column count:"+colcount);
		for(int j=0;j<colcount;j++){
		String data=col.get(j).getText();
		System.out.println("cell value of row no:"+i+"and col no"+j +"is"+data);	
		
		}

	}
	}
}
