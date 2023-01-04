package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPage {
	WebDriver ldriver;
	public AssignmentPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
	@FindBy(xpath="//button[@routerlink='/assignment']")
	WebElement assignmentclk;
	
	
	//heading
		 @FindBy(xpath="(//div[@class='box'])[1]")
			WebElement ManageAssignment;
		 
		 @FindBy(xpath="//span[@class='p-paginator-current ng-star-inserted']")
			WebElement entriesText;

			@FindBy(xpath="//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
			WebElement assignmentText;
			
			@FindBy(xpath="//i[@class='pi pi-search']")
			WebElement Search;
			
			@FindBy(xpath="(//div[@role='checkbox'])[2]")
			WebElement checkBox;
			
			@FindBy(xpath="//button[@icon='pi pi-pencil'])[1]")
			WebElement  edit;
			
			@FindBy(xpath="//span[text()='Assigment Details']")
			WebElement AsignDetails;
			
			@FindBy(xpath="//input[@id='assignment']")
			WebElement  Ename;
			
			@FindBy(xpath="//input[@id='assignmentDescription']")
			WebElement  Edescription;
			
			@FindBy(xpath="//input[@id='assignmentGraderId']")
					WebElement EGrade;
			
			@FindBy(xpath="//span[@class='p-button-icon pi pi-calendar']")
					WebElement Calbutton;

			@FindBy(xpath="//span[@class='ng-tns-c105-8 p-highlight p-ripple ng-star-inserted']")
					WebElement Edate;
			
			@FindBy(xpath="//button[@class='p-button-rounded p-button-success p-button p-component ng-star-inserted']")
			WebElement Save;
			
			@FindBy(xpath = "//div[@class='p-toast-summary ng-tns-c90-13']")
			WebElement alert;
			
			public void assignment() {
				 assignmentclk.click();	
			}
			
			public void assignmentPage() {
				 String expectedurl="https://lms-frontend-phase2.herokuapp.com/assignment";
				   String actualurl=ldriver.getCurrentUrl();
				   if (actualurl.equals(expectedurl)) {
					System.out.println("pass");
				} else {
			        System.out.println("fail");
				}
			}
	public void pageHeading() {
	String expectedText="Manage Assignment";
	String actualText=ManageAssignment.getText();
	if (actualText.equals(expectedText)) {
		System.out.println("pass");
	} else {
		System.out.println("fail");

	}
}
	//footer
	
	public void entries() {
	String expectedText="Showing 1 to 3 of 3 entries";
	String actualText=entriesText.getText();
	if(actualText.equals(expectedText)) {
	System.out.println("pass");
	}
	else {
	System.out.println("Fail");
	}
}
	public void assignmentText() {
		
		String expectedText="assignmentText";
		 String actualText=assignmentText.getText();
		 if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
            System.out.println("Fail");
		}
}
	//Search
	
	
	
	public void searchAssignment() {
		Search.clear();
		Search.sendKeys("Sql");
	}
	//edit
	
	public void checkbox() throws InterruptedException {
		Thread.sleep(3000);
		checkBox.click();
}
	public void selectAssignment() {
		boolean chkBoxStatus=checkBox.isSelected();
}
	public void checkEdit() throws InterruptedException {
		Thread.sleep(3000);
		edit.click();
}
	public void assignDetailsfrom() {
		edit.click();
		String confirmtext=ldriver.switchTo().alert().getText();
	}
	public void editName() throws InterruptedException {
		
		 Ename.clear();
		 Ename.sendKeys("Sql Assignment");
}
	public void editDescription() {
		Edescription.clear();
		Edescription.sendKeys("SQL Practice");
}
	public void editGrade() {
		 EGrade.clear();
		 EGrade.sendKeys("3");
	}
	public void gradeStatus() {
		boolean grdstatus=EGrade.isDisplayed();
	}
	public void calenderbtn() {
		Calbutton.click();
}
	public void editdate() {
		 Edate.clear();
		 Edate.sendKeys("21");
	}
	public void dateUpdate() {
		boolean update=Edate.isDisplayed();
	}
	public void save() throws InterruptedException {
		 Save.click();
		 Thread.sleep(500);
	        
	        try {
			
			 // Switching to Alert        
	        Alert alert = ldriver.switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage= alert.getText();		
	        		
	        // Displaying alert message		
	        System.out.println("alertMessage: "+alertMessage);	
	        }
	        catch(Exception e)
	        {
	        	
	}
}
}
