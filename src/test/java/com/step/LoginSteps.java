package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hook.Hooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user opens the login page")
	public void user_opens_the_login_page() {		
		System.out.println("user opens the login page");			    
	}
	@When("user enters username {string}")
	public void user_enters_username(String username) {
	 		
		 WebElement email = Hooks.driver.findElement(
	                By.xpath("//input[@name='email']"));

	        email.sendKeys(username);

	        System.out.println("Enter Username Successfully");	
		
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		
		 Hooks.driver.findElement(
	                By.xpath("//input[@name='pass']"))
	                .sendKeys(password);

	        System.out.println("Enter Password Successfully");
	      
	}

	@When("user clicks login")
	public void user_clicks_login() {

		Hooks.driver.findElement(
                By.xpath("//span[text()='Log in']"))
                .click();

        System.out.println("Button Click Successfully");
	    
	    
	}

	@Then("user should see home page")
	public void user_should_see_home_page() {


	  
		System.out.println("user should see home page");
	    
	}
	
	

	@Then("user should see error message")
	public void user_should_see_error_message() {

System.out.println("user should see error message");
	    
	    
	}


}
