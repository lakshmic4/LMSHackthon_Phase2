package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.AssignmentPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserPage;

public class AssignmentSteps extends BaseClass {
	
	@Given("user is on user page")
	public void user_is_on_user_page() {
		
			System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
			driver.manage().window().maximize(); 
			lp =new LoginPage(driver);
			lp.setUsername();
			 lp.setPassword();
			 lp.loginbtn();
			hp=new HomePage(driver); 
			up=new UserPage(driver);
			up.userclk();
			
	}

	@When("user click on assigment button")
	public void user_click_on_assigment_button() {
		ap=new AssignmentPage(driver);
	   ap.assignment();
	}

	@Then("user lands on assignment page")
	public void user_lands_on_assignment_page() {
	  ap.assignmentPage();
		//System.out.println("Assignment page in LMS is displayed");
	}

	/*@Given("user is on assignment page")
	public void user_is_on_assignment_page() {
	   ap.assignmentPage();
	}

	@When("user validate {string} text on page")
	public void user_validate_text_on_page(String string) {
	   ap.pageHeading();
	}

	@Then("user lands on text Showing {string}")
	public void user_lands_on_text_showing(String string) {
	    ap.entries();
	}*/
	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String string) {
		up.userclk();
		ap.assignment();
	   ap.pageHeading();                                                                     
}
}
