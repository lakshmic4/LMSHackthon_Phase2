package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.UserPage;

public class UserSteps extends BaseClass{
	@Given("User opens url {string}")
	public void user_opens_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
		driver.manage().window().maximize();
		up=new UserPage(driver);
	}

	@Then("user enters userName as {string} and password as {string}")
	public void user_enters_user_name_as_and_password_as(String string, String string2) {
	   up.setUsername();
	   up.setPassword();
	}

	@Then("clicks on Login")
	public void clicks_on_login() {
	   up.loginbtn();
	}

	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() throws InterruptedException {
	   Thread.sleep(2000);
	}

	@When("User clicks the Tab {string}")
	public void user_clicks_the_tab(String string) {
		up=new UserPage(driver);
	    up.userclk();
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {
	   String expectedurl="https://lms-frontend-phase2.herokuapp.com/user";
	   String actualurl=driver.getCurrentUrl();
	   if (actualurl.equals(expectedurl)) {
		System.out.println("pass");
	} else {
        System.out.println("fail");
	}
	}

	@Then("Close Browser")
	public void close_browser() {
	   
	}
	//Heading
	@When("User is on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() {
	    up.userclk();
	}

	@Then("User should see the page heading as {string}")
	public void user_should_see_the_page_heading_as(String string) {
		String expectedText="Manage User";
		String actualText=driver.findElement(By.xpath("(//div[@class='box'])[1]")).getText();
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");

		}
		
	}
	//footer
	@Given("User is logged on to the LMS website")
	public void user_is_logged_on_to_the_lms_website() throws InterruptedException {
	    Thread.sleep(2000);
	}

	@When("User lands on Manage User page")
	public void user_lands_on_manage_user_page() {
	  up.userclk();
	}

	@Then("User should see the table footer as {string}")
	public void user_should_see_the_table_footer_as(String string) {
		up.tableText();
	}

	@Then("User should see the text  {string} below the user table")
	public void user_should_see_the_text_below_the_user_table(String string) {
	   up.entriesText();
	}
//Add new button
	@Then("User should see the button with text {string}")
	public void user_should_see_the_button_with_text(String string) {
	   up.addnewText();
	}

	@Given("User is on Manage user page")
public void user_is_on_manage_user_page() throws InterruptedException {
   up.userclk();
    
	}

	@When("User clicks Add New User button")
	public void user_clicks_add_new_user_button() {
	   up.clkonaddnew();
	}

	@Then("User should see the {string} dialog box")
	public void user_should_see_the_dialog_box(String string) {
	  up.userDetails();
	}
//table header
	/*@Then("User should see the table header as {string}")
	public void user_should_see_the_table_header_as(String string) {
	   up.tableheader();
	}

	@Given("User table is displayed in manage user page")
	public void user_table_is_displayed_in_manage_user_page() throws InterruptedException {
	    Thread.sleep(2000);
	}

	@When("User clicks sort icon in table header")
	public void user_clicks_sort_icon_in_table_header() {
	   
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
	   
	}

	@When("User checks empty checkbox in header")
	public void user_checks_empty_checkbox_in_header() {
	   
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
	    
	}

	@When("User unchecks checkbox in header")
	public void user_unchecks_checkbox_in_header() {
	    
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
	   
	}*/


	

}


	