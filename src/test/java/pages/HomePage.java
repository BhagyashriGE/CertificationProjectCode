package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage {

RemoteWebDriver driver;
	
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	By GoogleHomePage=By.xpath("//a[text()='Phones']");
	
	public boolean isGoogleHomePage() {
		return driver.findElement(GoogleHomePage).isDisplayed();
	}

}
