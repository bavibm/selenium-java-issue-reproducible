package com.example.issue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class DriverFactory {

    public static WebDriver getDriver(DriverName driverName, String driverPath) {
		String systemProperty = "webdriver." + driverName.toString().toLowerCase() + ".driver";
		System.setProperty(systemProperty, driverPath);
		
		RemoteWebDriverBuilder driverBuilder = RemoteWebDriver.builder();

        switch (driverName) {
            case IE:
                InternetExplorerOptions ieOptions = new InternetExplorerOptions();
                driverBuilder.addAlternative(ieOptions);
                break;

            case CHROME:

                ChromeOptions chOptions = new ChromeOptions();
                driverBuilder.addAlternative(chOptions);
                break;

            default: // FIREFOX
                FirefoxOptions ffOptions = new FirefoxOptions();
                driverBuilder.addAlternative(ffOptions);

        }
		return driverBuilder.build();
	}

}
