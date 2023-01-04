package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement PassWord;
	
	@FindBy(id="login")
	WebElement Loginbtn;
	
	public void setUsername() {
		 UserName.clear();
		UserName.sendKeys("LMS");
	}
		public void setPassword() {
			PassWord.clear();
			PassWord.sendKeys("LMS");
			
		}
		public void loginbtn() {
			Loginbtn.click();
	}
}
