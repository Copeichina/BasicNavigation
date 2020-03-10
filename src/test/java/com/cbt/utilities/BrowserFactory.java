package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String driverType) {

        WebDriver driver = null;
        if (driverType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("safari")) {
            driver = null;
        } else if (driverType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            // String driverPath="C:\\Users\\olgag\\Downloads";
            //String path = System.getProperty("user.dir") + "\\MicrosoftWebDriver.exe";
          //  System.setProperty("webdriver.edge.driver", path);
          //  EdgeOptions edgeOptions = new EdgeOptions();
          //  edgeOptions.setAcceptInsecureCerts(true);
            driver = new EdgeDriver();
        }
        return driver;


    }
}
