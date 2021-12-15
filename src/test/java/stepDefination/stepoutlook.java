package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobject.Task2;


public class stepoutlook {
	public WebDriver driver;
	public Task2 ol;

	
	@Given("User Launch on  Chrome Browser")
	public void user_launch_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		ol=new Task2(driver);
	}

	@When("User  open url with {string}")
	public void user_open_url_with(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	@When("click on signup")
	public void click_on_signup() {
		ol.signup();
	   
	}

	@When("Enter the Registered emailid as {string}")
	public void enter_the_registered_emailid_as(String email) throws InterruptedException {
	    ol.email(email);
	    Thread.sleep(3000);
	}

	@When("click on next")
	public void click_on_next() throws InterruptedException {
		ol.nextb();
		 Thread.sleep(3000);
	   
	}

	@When("enter the password {string}")
	public void enter_the_password(String password) throws InterruptedException {
		ol.password(password);
		 Thread.sleep(3000);
	   
	}

	@When("click signin")
	public void click_signin() throws InterruptedException {
	  ol.signin();
	  Thread.sleep(3000);
	}

	@When("click on yes")
	public void click_on_yes() throws InterruptedException {
		ol.staysigin();
		Thread.sleep(3000);
	    
	}

	/*@Then("user should login  Successfully login")
	public void user_should_login_successfully_login() {
	    
	}*/

@When("click on new mail")
public void click_on_new_mail() {
	ol.newmessage();
   
}

@When("add recipient mail id {string}")
public void add_recipient_mail_id(String tomail) throws InterruptedException {
	Thread.sleep(5000);
	    ol.Remail(tomail);
	    Thread.sleep(2000);
}

@When("click on cc")
public void click_on_cc() throws InterruptedException {
	Thread.sleep(2000);
	ol.cliccc();
	  
}

@When("add cc recipient mail id {string}")
public void add_cc_recipient_mail_id(String ccmail) throws InterruptedException {
	Thread.sleep(2000);
    ol.Rcc(ccmail);
    
}

@When("add subject {string}")
public void add_subject(String sub) throws InterruptedException {
	 Thread.sleep(2000);
    ol.subject(sub);
    Thread.sleep(2000);
}

@When("add content {string}")
public void add_content(String msg) throws InterruptedException {
	Thread.sleep(2000);
    ol.mainmessage(msg);
  
}

@When("click on send")
public void click_on_send() throws InterruptedException {
	 Thread.sleep(2000);
  ol.senkey();
 
}
@Then("Verify mail has been sent successfully")
public void verify_mail_has_been_sent_successfully() {
   driver.findElement(By.xpath("//div/div[2]/*[@title='Sent Items']")).click();
   driver.findElement(By.xpath("//*[@role='option'][1]/div/div/div/div[2]/div[2]/div/span")).getText();
}


@Then("verify warned with a warning message")
public void verify_warned_with_a_warning_message() {
	driver.findElement(By.xpath("//span[text()='This message must have at least one recipient.']")).getText();
   
}

}
