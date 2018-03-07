package com.makemytrip.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageStpsdef {
	
	
	public WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.close();
	}

	@When("^User verifies title of the page$")
	public void user_verifies_title_of_the_page() {
		
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights &amp; Holiday","Title is not matched");
		
	   }

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() {
	   
		driver.findElement(By.id("ch_login_icon")).click();
		driver.findElement(By.xpath("//input[@id='ch_signup_email']")).sendKeys("raghu.gummmmm@gmail.com");
		driver.findElement(By.xpath("//input[@id='ch_login_password']")).sendKeys("handssys");
		driver.findElement(By.xpath("//button[@id='ch_login_btn']")).click();
	}

	@Then("^user is on Homepage$")
	public void user_is_on_Homepage() {

		String homeTitle=driver.getTitle();
		System.out.println(homeTitle);

	}
	//@Then("^close the application$")
	//public void close_the_application()  {
	  //  driver.quit();
	//}



}
