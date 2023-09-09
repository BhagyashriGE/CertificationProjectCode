package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;

public class SignUp {

	RemoteWebDriver kkk;

	public SignUp(RemoteWebDriver driver) {
		this.kkk = driver;
	}

	By SignUpLink = By.xpath("//a[@data-target='#signInModal']");

	public void clickOnSignUpLink() {
		kkk.findElement(SignUpLink).click();
	}

	public boolean isSignUpPopup() {

		return kkk.findElement(By.id("signInModal")).isDisplayed();
	}

	By inputUser = By.id("sign-username");
	By inputPassword = By.id("sign-password");
	By buttonSignUp = By.xpath("//button");

	public void isSignUp(String username, String password) {
		kkk.findElement(inputUser).sendKeys(username);
		kkk.findElement(inputPassword).sendKeys(password);
	}

	public void clickOnSignUpButton() {
		kkk.findElement(By.xpath("//button[text()='Sign up']")).click();
	}

}
