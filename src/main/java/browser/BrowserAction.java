package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserAction {

	public static WebDriver driver = null;
	String path = null;

	public String pathDriverFolder() {

		String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
			this.path = System.getProperty("user.dir") + "\\Drivers\\DriversForWindow";
		} else if (os.contains("Mac")) {
			this.path = System.getProperty("user.dir") + "\\Drivers\\DriversForMac";

		} else if (os.contains("Linux")) {
			this.path = System.getProperty("user.dir") + "\\Drivers\\DriversForLinux";

		}

		return this.path;
	}

	// ****************************************************************************************************

	public WebDriver openBrowser(String browsereName) {
		if (browsereName.equalsIgnoreCase("chrome")) {
			System.out.println(pathDriverFolder() + "\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", pathDriverFolder() + "\\chromedriver.exe");
			driver = new ChromeDriver();
			this.driver = driver;

		} else if (browsereName.equalsIgnoreCase("IE")) {

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			System.setProperty("webdriver.ie.driver", pathDriverFolder() + "\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver(capabilities);
			this.driver = driver;
		}

		else if (browsereName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.firefox.marionette", pathDriverFolder() + "\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			this.driver = driver;
		} else {

			System.out.println("Please enter Proper Browser keyWord i.e chrome, ie or ff. U entered incorrect value "
					+ browsereName);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return this.driver;

	}

}
