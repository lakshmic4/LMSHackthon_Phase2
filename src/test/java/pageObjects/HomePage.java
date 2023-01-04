package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	public HomePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
	@FindBy(xpath="//span[text()=' LMS - Learning Management System ']")
	WebElement headerLMS;
	
	@FindBy(xpath="//span[text()='Program']")
	WebElement headerProgram;
	
	@FindBy(xpath="//span[text()='Batch']")
	WebElement headerBatch;
	
	@FindBy(xpath="//span[text()='User']")
	WebElement headerUser;
	
	@FindBy(xpath="//span[text()='Assignment']")
	WebElement headerAssignment;
	
	@FindBy(xpath="//span[text()='Attendance']")
	WebElement headerAttendence;
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement logout;
	
	public void checkHeaderLMS() {
		//check if lms element visible
	     // boolean lms = headerLMS.isDisplayed();
	      if (headerLMS!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	}
	public void checkHeaderProgram() {
		//check if program element visible
	     // boolean prg =  headerProgram.isDisplayed();
	      if (headerProgram!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
}
	public void checkHeaderBatch() {
		//check if batch element visible
	      //boolean batch =  headerBatch.isDisplayed();
	      if (headerBatch!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
}
	public void checkHeaderUser() {
		//check if user element visible
	     // boolean user =  headerUser.isDisplayed();
	      if (headerUser!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
}
	public void checkHeaderAssignment() {
		//check if assignment element visible
	     // boolean asign =  headerAssignment.isDisplayed();
	      if (headerAssignment!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
}
	public void checkHeaderAttendence() {
		//check if attendence element visible
	     // boolean atn =  headerAttendence.isDisplayed();
	      
	      if (headerAttendence!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
}
	public void checklogout() {
		// boolean lg =  logout.isDisplayed();
		 if (logout!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	}
}
