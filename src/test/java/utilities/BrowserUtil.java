package utilities;

import java.time.Duration;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserUtil {
	private static final Long IMPLICIT_WAIT=30l;
	private static final Long PAGE_LOAD_WAIT=60l;
	
	public static RemoteWebDriver getDriver() throws Exception {
		Logger log=Logging.getLogger(BrowserUtil.class.getName());
		
		String browser=System.getProperty("browser");
		System.out.println("******Browser passed from mvn command-line is:="+browser);
		log.info("******Browser passed from mvn command-line is:="+browser);
		RemoteWebDriver driver=null;
		if(browser==null) {
			System.out.println("Browser command-line argument is null. Defaulting driver to Chrome.");
			log.warn("Browser command-line argument is null. Defaulting driver to Chrome.");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("browstack")) {
			
		}
		else {
			throw new Exception("Invalid browser value:="+browser);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_WAIT));
		return driver;
	}

}
