package pageObjects;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage {
	WebDriver ldriver;
	public ProgramPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	
	//header
	@FindBy(xpath="(//div[@class='box'])[1]")
	WebElement ManageProgram;
	
	//footer
	@FindBy(xpath="//span[text()='Showing 1 to 5 of 9 entries']")
	WebElement PrgEntries;
	
	@FindBy(xpath="//div[text()=' In total there are 9 programs. ']")
	WebElement prgText;
	
	//delete btn
	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	WebElement Deletebtn;
	
	//search
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement SearchBox;
	
	@FindBy(xpath="(//div[@role='checkbox'])[2]")
	WebElement CheckBox;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-pencil'])[1]")
	WebElement Editbtn;
	
	@FindBy(xpath="//span[text()='Program Details']")
	WebElement PrgDetails;
	
	@FindBy(id="programName")
	WebElement ename;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement SaveBtn;
	
	@FindBy(id="programDescription")
	WebElement eDescription;
	
	@FindBy(xpath="//div[@class='p-radiobutton-box']")
	WebElement Activebtn;
	
	@FindBy(xpath="//button[@label='Cancel']")
	WebElement CancelBtn;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-trash'])[1]")
	WebElement Delete;
	
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement DeleteConfirm;
	
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-check']")
	WebElement ConfirmYes;
	
	@FindBy(xpath="//button[@ng-reflect-ng-class='p-confirm-dialog-reject']")
	WebElement ConfirmNo;
	
	@FindBy(xpath="//span[text()='A New Program']")
	WebElement Addnewprg;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement SaveBtn1;
	
	@FindBy(xpath="//small[text()='Name is required.']")
	WebElement RequiredName;
	
	@FindBy(id="programName")
	WebElement PrgName;
	
	@FindBy(id="programDescription")
	WebElement PrgDescription;
	
	@FindBy(xpath="(//div[@class='p-radiobutton-box'])[1]")
	WebElement RadioBtn1;
	
	@FindBy(xpath="//span[@class='p-button-icon p-button-icon-left pi pi-check']")
	WebElement saveBtn;
	
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancel;
	
	@FindBy(xpath="(//div[@role='checkbox'])[2]")
	WebElement checkBox1;
	
	@FindBy(xpath="(//div[@role='checkbox'])[3]")
	WebElement checkBox2;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-trash'])[1]")
	WebElement DeleteBtn;
	
	@FindBy(xpath="//span[@class='p-dialog-title ng-tns-c133-62 ng-star-inserted']")
	WebElement confirm;
	
	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[1]")
	WebElement accendingBtn;
	
	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[2]")
	WebElement accenDescripBtn;
	
	@FindBy(xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[3]")
	WebElement accenPrgStatus;
	
	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[1]")
	WebElement decendingBtn;
	
	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[2]")
	WebElement decenDescripBtn;
	
	@FindBy(xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[3]")
	WebElement decenPrgStatus;
	
	public void progrmHeading() {
		String expectedText="Manage Program";
		String actualText=ldriver.findElement(By.xpath("(//div[@class='box'])[1]")).getText();
		if(actualText.equals(expectedText)) {
			System.out.println("pass");
	}
		else {
			System.out.println("Fail");
			}
}
	public void prgEntriesText() {
		String expectedText="Showing 1 to 5 of 9 entries";
		String actualText=ldriver.findElement(By.xpath("//span[text()='Showing 1 to 5 of 9 entries']")).getText();
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
			
		} else {
           System.out.println("fail");
		}
	}
	public void prgText() {
		String expectedText=" In total there are 9 programs.";
		String actualText=ldriver.findElement(By.xpath("//div[text()=' In total there are 9 programs. ']")).getText();
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
			
		} else {
           System.out.println("fail");
		}
		
	}
	public void deletebtn() {
		//Deletebtn.click();
		boolean deleteStatus=ldriver.findElement(By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']")).isDisplayed();
		System.out.println(deleteStatus);
	}
	/*public void Searchboxclick() {
		SearchBox.click();
	}*/
	public void textProgram() {
		SearchBox.clear();
		SearchBox.sendKeys("Ninja");
		
	}
	public void prgname() {
	boolean prgname=ldriver.findElement(By.xpath("//input[@placeholder='Search...']")).isDisplayed();
	}
	public void checkbox() {
		CheckBox.click();
	}
	public void selectCheckbox() {
		//ldriver.findElement(By.xpath("//div[@role='checkbox'])[2]")).click();
		boolean chkBoxStatus=CheckBox.isSelected();
		
	}
	public void editBtn() {
		Editbtn.click();
	}
	public void prgDetails() {
		String expectedText="Program Detais";
		String actualText=ldriver.findElement(By.xpath("//span[text()='Program Details']")).getText();
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
  System.out.println("fail");
		}
	}
	public void editName() {
		ename.clear();
		ename.sendKeys("Python");
	}
	public void saveBtn() {
		SaveBtn.click();
	}
	public void updateName() {
		 WebElement baseTable = ldriver.findElement(By.tagName("table"));
		  
		 //To find first row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[2]"));
	     String rowtext = tableRow.getText();
		 System.out.println("First row of table : "+rowtext);
		 
		 if(rowtext.equals("Python")) {
			 System.out.println("text updated successfully");
		 }
		 else {
			 System.out.println("text not updated successfully");
		 }
	}
	public void eDescription() {
		eDescription.clear();
		eDescription.sendKeys("PSelenium");
	}
	public void updateDescription() {
		WebElement baseTable = ldriver.findElement(By.tagName("table"));
		  
		 //To find first row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[3]"));
	   String rowtext = tableRow.getText();
		 System.out.println("First row of table : "+rowtext);
		 
		 if(rowtext.equals("PSelenium")) {
			 System.out.println("text updated successfully");
		 }
		 else {
			 System.out.println("text updated not successfully");
		 }
	}
	public void activeBtn() {
		boolean radioStatus=Activebtn.isSelected();
		Activebtn.click();
		System.out.println(radioStatus);
	}
	
	public void updateprgStatus() {
		WebElement baseTable = ldriver.findElement(By.tagName("table"));
		  
		 //To find first row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[4]"));
	  String rowtext = tableRow.getText();
		 System.out.println("First row of table : "+rowtext);
		 if(rowtext.equals("Active")) {
			 System.out.println("text updated successfully");
		 }
		 else {
			 System.out.println("text updated not successfully");
		 }
}
	public void cancel() {
		CancelBtn.click();
	}
	public void notLandPpage() {
		 if(ldriver.getPageSource().contains("Manage Program")) {

			 System.out.println("User not on Program Details Page");
		     }
		 else
		 {

			 System.out.println("User still on Program Details Page");
}
	}
	public void Stringmsg() throws InterruptedException {
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
	public void delete() {
		Delete.click();
	}
	public void delConfirm() {
		String expectedText="Confirm";
		String actualText=ldriver.findElement(By.xpath("//span[text()='Confirm']")).getText();
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
System.out.println("fail");
		}
	}
	public void confirmYes() {
		ConfirmYes.click();
		//ldriver.switchTo().alert().accept();
	}
	public void confirmNo() {
		ConfirmNo.click();
		//ldriver.findElement(By.xpath(""))
		//ldriver.switchTo().alert().dismiss();
	}
	public void addNew() {
		Addnewprg.click();
	}
	public void SavePrg() {
		SaveBtn1.click();
		
	}
	public void requiredName() {
		String expectedText="Name is required.";
		String actualText=RequiredName.getText();
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");

		}
		
	}
	public void addPName() {
		PrgName.clear();
		PrgName.sendKeys("Ninja");
	}
	public void stringName() {
		saveBtn.click();
		boolean stringName=PrgName.isDisplayed();
	}
	public void addDescription() {
		PrgDescription.clear();
		PrgDescription.sendKeys("Ninja Testers");
	}
	public void stringDescription() {
		saveBtn.click();
		boolean stringDescription=PrgDescription.isDisplayed();
	}
	public void radioBtn() {
		//boolean radioStatus=RadioBtn.isSelected();
		RadioBtn1.click();
		//System.out.println(radioStatus);
	}
	public void radioBtnStatus() {
		boolean radioStatus=RadioBtn1.isSelected();
		//RadioBtn1.click();
		System.out.println(radioStatus);
		
	}
	public void save() {
		saveBtn.click();
	}
	public void cancelBtn() {
		Cancel.click();
	}
	public void checkBox1() {
		checkBox1.click();
	}
	public void checkBox2() {
		checkBox2.click();
	}
	public void multiChkStatus() {
		boolean chkBoxStatus=checkBox1.isSelected();
		boolean chkBoxStatus1=checkBox2.isSelected();
	}
	public void deleteBtn() {
		DeleteBtn.click();
	}
	public void confirm() {
		String expectedText="Confirm";
		String actualText=ldriver.findElement(By.xpath("//span[@class='p-dialog-title ng-tns-c133-62 ng-star-inserted']")).getText();
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
System.out.println("fail");
		}
	}
	public void accendingPName() {
		accendingBtn.click();
	}
	public void accendingProgram() {
		boolean accendingPrmStatus=accendingBtn.isDisplayed();
	}
	public void accenDescrip() {
		accenDescripBtn.click();
	}
	public void accenDescription() {
		boolean accenDescription=accenDescripBtn.isDisplayed();
	}
	public void accenStatus() {
		accenPrgStatus.click();
	}
	public void acenPrgStatus() {
		boolean prgStatus=accenPrgStatus.isDisplayed();
	}
	public void decendingPName() {
		decendingBtn.click();
	}
	public void decendingProgram() {
		boolean accendingPrmStatus=decendingBtn.isDisplayed();
	}
	public void decenDescrip() {
		decenDescripBtn.click();
	}
	public void decenDescription() {
		boolean accenDescription=decenDescripBtn.isDisplayed();
	}
	public void decenStatus() {
		decenPrgStatus.click();
	}
	public void decenPrgStatus() {
		boolean prgStatus=decenPrgStatus.isDisplayed();
	}
}

