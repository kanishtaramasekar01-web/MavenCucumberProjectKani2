package com.hook;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;

public class Hooks {
	
public static WebDriver driver;
	
	@BeforeStep
	public static void BeforeStep() {
	
		System.out.println("......Test Execution Started.......");
	
	}		
	@Before	
	public void setUp() {		
		//To Open Chrome
		
	driver=new ChromeDriver();
	
	
	
	//To Launch Url
	
	
	driver.get("https://www.facebook.com/");
	
	
		
	//To maximize window
	
	driver.manage().window().maximize();
	
	System.out.println(" Setup Successfully");
		
		
	}
	
	
	@After
	public void tearDown() {
		
		
		driver.quit();
		
	System.out.println("Cleanup browser Successfully");	
			
	}
	
@AfterStep
public static void AfterStep() {
		
		
		System.out.println("......Test Execution Ended.......");
		
		
	}
	
}
