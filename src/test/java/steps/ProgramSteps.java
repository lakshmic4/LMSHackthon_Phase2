package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;

public class ProgramSteps extends BaseClass {
	
	@When("User is on Program page")
	public void user_is_on_program_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
		driver.manage().window().maximize(); 
		lp =new LoginPage(driver);
		lp.setUsername();
		 lp.setPassword();
		 lp.loginbtn();
		hp=new HomePage(driver);
		pp =new ProgramPage(driver);
		
	}

	@Then("User should see the heading as {string}")
	public void user_should_see_the_heading_as(String string) {
	   pp.progrmHeading();
	}
	//Footer
	@Then("User should see the text as {string}")
	public void user_should_see_the_text_as(String string) {
	   pp.prgEntriesText();
	}

	@Then("User should see the footer as {string}")
	public void user_should_see_the_footer_as(String string) {
	    pp.prgText();
	}
//delete buttonpp.
	@Then("User should see the Delete button on the top left hand side as Disabled")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
	    pp.deletebtn();
	}
	//search program
	@Then("Text box used for search has text as {string}")
	public void text_box_used_for_search_has_text_as(String string) throws InterruptedException {
	   // pp.Searchboxclick();
		 pp.textProgram();
		Thread.sleep(2000);
	}

	@When("User enters  <name phrase> into search box.")
	public void user_enters_name_phrase_into_search_box() {
	    pp.textProgram();
	}

	@Then("Entries for <name phrase> are shown.")
	public void entries_for_name_phrase_are_shown() {
	   pp.prgname();
	}
	//edit program
	@When("User selects Program using checkbox")
	public void user_selects_program_using_checkbox() {
	   pp.checkbox();
	}

	@Then("Program gets selected")
	public void program_gets_selected() {
		pp.selectCheckbox();
	}

	@When("User clicks on <Edit> button")
	public void user_clicks_on_edit_button() {
	   pp.editBtn();
	}

	@Then("User lands on Program Details form.")
	public void user_lands_on_program_details_form() {
	   pp.prgDetails();
	}

	@Given("User is on Program Details form")
	public void user_is_on_program_details_form() {
		System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
		driver.manage().window().maximize(); 
		lp =new LoginPage(driver);
		lp.setUsername();
		 lp.setPassword();
		 lp.loginbtn();
		hp=new HomePage(driver);
		pp =new ProgramPage(driver);
		 pp.checkbox();
		 pp.selectCheckbox();
	    pp.editBtn();
	    pp.prgDetails();
	}

	@When("User edits Name and selects the Save button")
	public void user_edits_name_and_selects_the_save_button() {
	    pp.editName();
	    pp.saveBtn();
	}

	@Then("User can see updated Name")
	public void user_can_see_updated_name() {
	  pp.updateName();  
	}

	@When("User edits Description and selects the Save button")
	public void user_edits_description_and_selects_the_save_button() {
	    pp.eDescription();
	    pp.saveBtn();
	}

	@Then("User can see updated Description")
	public void user_can_see_updated_description() {
	   pp.updateDescription();
	}

	@When("User changes status and selects the Save button")
	public void user_changes_status_and_selects_the_save_button() {
	   pp.activeBtn();
	   pp.saveBtn();
	}

	@Then("User can see updated program Status")
	public void user_can_see_updated_program_status() {
	    pp.updateprgStatus();
	}

	@When("User clicks <Cancel> button")
	public void user_clicks_cancel_button() {
	   pp.cancel();
	}

	@Then("User can see Program Details form disappears")
	public void user_can_see_program_details_form_disappears() {
	   pp.notLandPpage();
	}

	@When("User clicks <Save> button")
	public void user_clicks_save_button() {
	    pp.saveBtn();
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String string) throws InterruptedException {
	   pp.Stringmsg();
	}
	//delete start
	@When("User clicks on <Delete> button")
	public void user_clicks_on_delete_button() {
		System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
		driver.manage().window().maximize(); 
		lp =new LoginPage(driver);
		lp.setUsername();
		 lp.setPassword();
		 lp.loginbtn();
		hp=new HomePage(driver);
		pp =new ProgramPage(driver);
		 pp.checkbox();
		 pp.selectCheckbox();
	   pp.delete(); 
	}

	@Then("User lands on Program Confirm Deletion form del")
	public void user_lands_on_program_confirm_deletion_form_del() {
	   pp.delConfirm();
	}

	@Given("User is on Confirm Deletion form")
	public void user_is_on_confirm_deletion_form() {
		System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
		driver.manage().window().maximize(); 
		lp =new LoginPage(driver);
		lp.setUsername();
		 lp.setPassword();
		 lp.loginbtn();
		hp=new HomePage(driver);
		pp =new ProgramPage(driver);
		 pp.checkbox();
		 pp.selectCheckbox();
	   pp.delete();
	   pp.delConfirm();
	}

	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() {
		
	    pp.confirmYes();
	}

	@When("User clicks <No> button")
	public void user_clicks_no_button() {
	    pp.confirmNo();
	}

	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() throws InterruptedException {
	    pp.Stringmsg();
	}
	//addnewprogram
	@When("User clicks <A New Program> button")
	public void user_clicks_a_new_program_button() {
	   pp.addNew();
	}

	@Given("User is on Program Details form to add new program")
	public void user_is_on_program_details_form_to_add_new_program() {
		System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
		driver.manage().window().maximize(); 
		lp =new LoginPage(driver);
		lp.setUsername();
		 lp.setPassword();
		 lp.loginbtn();
		hp=new HomePage(driver);
		pp =new ProgramPage(driver);
		 pp.addNew();
	   pp.prgDetails();
	}

	@When("User clicks <Save> button without entering data")
	public void user_clicks_save_button_without_entering_data() {
	   pp.SavePrg();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String string) {
	    pp.requiredName();
	}

	@When("User enters <Name> in name text box")
	public void user_enters_name_in_name_text_box() {
	    pp.addPName();
	    
	}

	@Then("User can see {string} entered in name")
	public void user_can_see_entered_in_name(String string) throws InterruptedException {
		pp.stringName();
	    Thread.sleep(2000);
	}

	@When("User enters <Name> in description text box")
	public void user_enters_name_in_description_text_box() {
	    pp.addDescription();
	    
	}

	@Then("User can see {string} entered in description")
	public void user_can_see_entered_in_description(String string) {
	   pp.stringDescription();
	}

	@When("User selects <Status> using radiobutton")
	public void user_selects_status_using_radiobutton() {
pp.radioBtn();
	}

	@Then("User can see {string} status selected")
	public void user_can_see_status_selected(String string) {
	   pp.radioBtnStatus();
	}

	@When("User clicks <Save> button on add new program")
	public void user_clicks_save_button_on_add_new_program() {
	   pp.save();
	}

	@Then("User gets message {string} on add new program")
	public void user_gets_message_on_add_new_program(String string) throws InterruptedException {
	   pp.Stringmsg();
	}

	@When("User clicks <Cancel> button on add new program")
	public void user_clicks_cancel_button_on_add_new_program() {
	    pp.cancelBtn();
	}
	//multi Delete
	@When("User selects more than one Program using checkbox")
	public void user_selects_more_than_one_program_using_checkbox() {
	    pp.checkBox1();
	    pp.checkBox2();
	}

	@Then("Programs get selected")
	public void programs_get_selected() {
	    pp.multiChkStatus();
	}

	@When("User clicks on <Delete> button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
		 pp.checkBox1();
		    pp.checkBox2();
		    pp.multiChkStatus();
	    pp.deleteBtn();
	}

	@Then("User lands on Program Confirm Deletion form.")
	public void user_lands_on_program_confirm_deletion_form() {
		
	    pp.confirm();
	}

	@Given("User is on Program Confirm Deletion form")
	public void user_is_on_program_confirm_deletion_form() {
	    
    pp.deleteBtn();
    pp.delConfirm();
    pp.confirmYes();

}
	//accending order
	@When("User clicks on the Ascending arrow down near to the Program name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_name() {
	  pp.accendingPName();
	}

	@Then("User can see the results in Ascending order of Program name")
	public void user_can_see_the_results_in_ascending_order_of_program_name() {
	    pp.accendingProgram();
	}

	@When("User clicks on the Ascending arrow down near to the Program Description")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_description() {
	    pp.accenDescrip();
	}

	@Then("User can see the results in Ascending order of Program Description")
	public void user_can_see_the_results_in_ascending_order_of_program_description() {
	    pp.accenDescription();
	}

	@When("User clicks on the Ascending arrow down near to the Program Status")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_status() {
	    pp.accenStatus();
	}

	@Then("User can see the results in Ascending order of Program Status")
	public void user_can_see_the_results_in_ascending_order_of_program_status() {
	   pp.acenPrgStatus();
	}

	//decendig order
	
	@When("User clicks on the Descending arrow down near to the Program name")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_name() {
	   pp.decendingPName();
	}

	@Then("User can see the results in Descending order of Program name")
	public void user_can_see_the_results_in_descending_order_of_program_name() {
		 pp.decendingProgram();
	}

	@When("User clicks on the Descending arrow down near to the Program Description")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_description() {
	   pp.decenDescrip();
	}

	@Then("User can see the results in Descending order of Program Description")
	public void user_can_see_the_results_in_descending_order_of_program_description() {
	   pp.accenDescription();
	}

	@When("User clicks on the Descending arrow down near to the Program Status")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_status() {
	   pp.decenStatus();
	}

	@Then("User can see the results in Descending order of Program Status")
	public void user_can_see_the_results_in_descending_order_of_program_status() {
	   pp.decenPrgStatus();
	}



}


	