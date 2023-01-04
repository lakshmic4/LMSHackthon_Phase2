package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	WebDriver ldriver;
	public UserPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement PassWord;
	
	@FindBy(id="login")
	WebElement Loginbtn;
	
	@FindBy(xpath="//span[text()='User']")
	WebElement Userclk;
	
	@FindBy(xpath="//span[text()='Showing 1 to 4 of 4 entries']")
	WebElement entriesText;
	
	@FindBy(xpath="//div[text()=' In total there are 4 users.']")
	WebElement tableText;
	
	@FindBy(xpath="//span[text()='Add New User']")
	WebElement addnewtext;
	
	//@FindBy(xpath="(//span[@class='p-button-label'])[2]")
	//WebElement addnewbtn;
	
	//@FindBy(id="new")
	//WebElement clickonUser;
	
	@FindBy(xpath="//span[text()='Add New User']")
	WebElement  addnewbtn;
	
	@FindBy(xpath="//span[text()='User Details']")
	WebElement userdetails;
	
	@FindBy(xpath="//table[@role='grid']/thead/tr")
	WebElement tableheader;
	
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
		public void userclk() {
			Userclk.click();
		}
		//footer
		public void entriesText() {
			//entriesText.getText();
			String expectedText="Showing 1 to 4 of 4 entries";
			//WebDriver driver = null;
			String actualText=ldriver.findElement(By.xpath("(//div[@class='box'])[1]")).getText();
			if(actualText.equals(expectedText)) {
			System.out.println("pass");
			}
			else {
			System.out.println("Fail");
			}
}
		public void tableText() {
			//tableText.getText();
			String expectedText="In total there are 4 users.";
			//WebDriver driver = null;
			String actualText=ldriver.findElement(By.xpath("(//div[@class='box'])[1]")).getText();
			//String actualText=tableText.getText();
			if(actualText.equals(expectedText)) {
			System.out.println("pass");
			}
			else {
			System.out.println("Fail");
			}	
		}
		//add new
		public void addnewText() {
			//addnewtext.getText();
			String expectedText="+ Add New User";
			String actualText=ldriver.findElement(By.xpath("//span[text()='Add New User']")).getText();
			if(actualText.equals(expectedText)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
		}
		public void clkonaddnew() {
			addnewbtn.click();
		}
		public void userDetails() {
			//userdetails.getText();
			String expectedText="User Details";
			String actualText=ldriver.findElement(By.xpath("//span[text()='User Details']")).getText();
			if (actualText.equals(expectedText)) {
				System.out.println("pass");
				
			} else {
              System.out.println("fail");
			}
			
		}
		//tab;e header
		public void tableheader() {
			List<WebElement>allheader=ldriver.findElements(By.xpath("//table[@role='grid']/thead/tr"));
			int si=allheader.size();
			for(int i=0; i<si; i++) {
				WebElement tableheader=allheader.get(i);
				tableheader.getText();
			}
		}
}
