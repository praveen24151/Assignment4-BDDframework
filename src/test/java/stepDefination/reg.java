package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobject.Task1;


public class reg {
	
	public WebDriver driver;
	public Task1 rp;
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		rp=new Task1(driver);
	  
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("enters Email as {string} and password as {string}")
	public void enters_email_as_and_password_as(String email, String password) {
	    rp.email(email);
	    rp.password(password);
	}

	@When("click on register")
	public void click_on_register() {
		rp.register();
	   
	}

	@Then("User should be successfully registered")
	public void user_should_be_successfully_registered() {

Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']")).isDisplayed());
	    
	}
	@When("enters Username as {string} and password as {string}")
	public void enters_username_as_and_password_as(String email, String pass) {
		rp.loginemail(email);
		rp.loginpassword(pass);
	   
	}

	@When("click on login")
	public void click_on_login() {
		rp.login();
	  
	    
	}


}
