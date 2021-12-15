package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1 {
	
	public WebDriver driver;
	
	public Task1(WebDriver redriver) {
		driver = redriver;
		PageFactory.initElements(redriver, this);	
}
	@FindBy(id="reg_email")
	WebElement emailfield;
	
	@FindBy(id="username")
	WebElement txtemail;
	
	@FindBy(id="reg_password")
	WebElement passwordfield;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	
	@FindBy(xpath= "//*[@name='register']")
	WebElement registerbutton;
	
	@FindBy(xpath= "//*[@name='login']")
	WebElement loginbutton;
	
	
	public void email(String email) {
		emailfield.clear();
		emailfield.sendKeys(email);
		
		}      
	public void password(String password) {
		passwordfield.clear();
		passwordfield.sendKeys(password);
		
		}

		public void register() {
		registerbutton.click();
		}
		
		public void loginemail(String email) {
			txtemail.clear();
			txtemail.sendKeys(email);
			
			}
		public void loginpassword(String pass) {
			txtpassword.clear();
			txtpassword.sendKeys(pass);
			
			}

			public void login() {
			registerbutton.click();
			}

}
