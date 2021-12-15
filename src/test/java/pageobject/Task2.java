package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task2 {
	

	public WebDriver driver;
	
	public Task2(WebDriver redriver) {
		driver = redriver;
		PageFactory.initElements(redriver, this);	
		
}

	@FindBy(xpath="//a[@data-task='signin']")
	WebElement signupbutton;
	
	@FindBy(id="i0116")
	WebElement txtemail;
	
	@FindBy(id="idSIButton9")
	WebElement nextbutton;
	
	@FindBy(id="i0118")
	WebElement txtpassword;
	

	@FindBy(xpath="//*[@data-report-event='Signin_Submit']")
	WebElement signinbutton;
	
	@FindBy(xpath="//*[@data-report-trigger='click']")
	WebElement yesbutton;
	
	@FindBy(id="id__6")
	WebElement newemail;
	
	@FindBy(xpath="//*[@role='presentation']/input")
	WebElement recipientmailid;
	
	@FindBy(xpath="//span[text()='Cc']")
	WebElement CC;
	
	@FindBy(xpath="//*[@aria-label='Cc']")
	WebElement CCmailid;
	
	@FindBy(xpath="//input[@aria-label='Add a subject']")
	WebElement mainsunject;
	

	@FindBy(xpath="//*[@aria-label='Message body']")
	WebElement message;
	
	@FindBy(xpath="//*[@title='Send (Ctrl+Enter)']")
	WebElement send;
	

	public void signup() {
	signupbutton.click();
	}
	public void email(String email) {
		txtemail.clear();
		txtemail.sendKeys(email);
		
	}
	public void nextb() {
		nextbutton.click();
	}
	public void password(String password) {
		txtpassword.clear();
		txtpassword.sendKeys(password);
		
	}
	public void signin() {
		signinbutton.click();
		}
	public void staysigin() {
		yesbutton.click();
		}
	public void newmessage() {
		newemail.click();
		}
	public void Remail(String tomail) {
		recipientmailid.clear();
		recipientmailid.sendKeys(tomail);
	
	}
	public void cliccc() {
		CC.click();
		}
	public void Rcc(String ccmail) {
		CCmailid.clear();
		CCmailid.sendKeys(ccmail);
	
	}
	public void subject(String sub) {
		mainsunject.clear();
		mainsunject.sendKeys(sub);
	
	}
	public void mainmessage(String msg) {
		message.clear();
		message.sendKeys(msg);
	
	}
	public void senkey() {
		send.click();
		}
	
	
	
}
