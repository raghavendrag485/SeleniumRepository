package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingBrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		int count=links.size();
		System.out.println("no of links and imeages"+count);
		
		List<WebElement>activeLinks=new ArrayList<WebElement>();
		
		for(int i=0;i<links.size();i++){
			
			if(links.get(i).getAttribute("href")!=null){
				activeLinks.add(links.get(i));
			}
			System.out.println("No of active links"+activeLinks.size());
		}
		
		
		
		
		
		
		
		
		
		

	}

}
