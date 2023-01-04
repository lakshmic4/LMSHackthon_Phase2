package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class Login_steps extends BaseClass{
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		lp =new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
		driver.manage().window().maximize();  
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		 lp.setUsername();
		 lp.setPassword();
	}

	@When("click on login")
	public void click_on_login() {
		lp.loginbtn();  
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
	  String expectedTitle="LMS";
	  String actualTitle=driver.getTitle();
	  if (actualTitle.equals(expectedTitle)) {
		System.out.println("pass");
	} else {
System.out.println("Fail");
	}
	}

	@Then("close Browser")
	public void close_browser() {
	   driver.close();
	}


}
