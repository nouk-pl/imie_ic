package app.functional;

import java.io.File;
import java.util.HashMap;

import org.fluentlenium.cucumber.adapter.FluentCucumberTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

@Deprecated
public class SeleniumTests {

	private WebDriver driver;

	public SeleniumTests() {

		// VM arg :
		// -Dchrome.driver.path=C:/_work/tools/GoogleChromePortable/chromedriver.exe
		final String driverPath = System.getProperty("chrome.driver.path");
		// VM arg :
		// -Dchrome.portable.path=C:/_work/tools/GoogleChromePortable/GoogleChromePortable.exe
		final String browserPath = System.getProperty("chrome.portable.path");

		ChromeOptions options = new ChromeOptions();
        options.setBinary(browserPath);

        HashMap<String, Object> chromePrefs = new HashMap<>();
        options.setExperimentalOption("prefs", chromePrefs);
        // Play with the window size
        options.addArguments("--start-maximized"); // full screen
        // options.addArguments("window-size=1024,768"); // or special size

        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, driverPath);

        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(driverPath))
                .usingAnyFreePort()
                .build();

        driver = new ChromeDriver(service, options);
	}

	public WebDriver getDriver() {
		return driver;
	}

}
