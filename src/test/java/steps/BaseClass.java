package steps;

import org.openqa.selenium.WebDriver;

import pageObjects.AssignmentPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;
import pageObjects.UserPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public UserPage up;
	public ProgramPage pp;
	public AssignmentPage ap;
}
