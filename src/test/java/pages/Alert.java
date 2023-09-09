package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Alert {

	
RemoteWebDriver driver;
	
	public Alert(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public void isAlertBox() {
		driver.switchTo().alert().accept();
	}
}
