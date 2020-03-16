package com.cbt.tests.AutomationTask;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.VerifyEndsWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaUrl {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
       WebElement button= driver.findElement(By.tagName("button"));
       button.click();
       WebElement link= driver.findElement(By.linkText("Selenium (software)"));
       link.click();
       String actualURL=driver.getCurrentUrl();

        VerifyEndsWith test=new VerifyEndsWith();
        test.EndsWith(actualURL,"Selenium_(software)");
    }
}
