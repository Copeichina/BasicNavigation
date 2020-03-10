package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationTest {
    public static void main(String[] args) {

       WebDriver driver=BrowserFactory.getDriver("edge");
        driver.get("http://google.com");

    }
}
