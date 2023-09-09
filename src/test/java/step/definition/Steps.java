package step.definition;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Alert;
import pages.HomePage;
import pages.SignUp;
import utilities.BrowserUtil;

public class Steps {

	RemoteWebDriver driver;

	@Given("Open the Google browser")
	public void user_open_the_browser() throws Exception {
		driver = BrowserUtil.getDriver();
	}

	@When("Enter the URL")
	public void user_navigates_to_the_url() {
		driver.get("https://www.demoblaze.com/");

	}

	@When("click on the Sign Up site link")
	public void click_on_the_Sign_Up_site_link() {
		SignUp signup = new SignUp(driver);
		signup.clickOnSignUpLink();
	}

	@Then("Navigate to Google homepage")
	public void Navigate_to_Google_homepage() {
		HomePage homePage = new HomePage(driver);
		boolean flag = homePage.isGoogleHomePage();
		Assert.assertEquals(flag, true);
	}

	@Then("Navigate to signup popup")
	public void Navigate_to_signup_popup() {
		SignUp signup = new SignUp(driver);
		boolean flag = signup.isSignUpPopup();
		Assert.assertEquals(flag, true);
	}

	@When("user inputs valid {string} and {string}")
	public void user_inputs_valid_and(String username, String password) {
		SignUp signup = new SignUp(driver);
		signup.isSignUp(username, password);
	}

	@When("Click on SignUp")
	public void click_on_SignUp() {
		SignUp signup = new SignUp(driver);
		signup.clickOnSignUpButton();
	}

	@Then("accept the alert")
	public void accept_the_alert() {
		Alert alert = new Alert(driver);
		alert.isAlertBox();
	}

}
