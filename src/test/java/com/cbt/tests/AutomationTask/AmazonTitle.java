package com.cbt.tests.AutomationTask;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.VerifyIfContains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTitle {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/m");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("candy");
        driver.findElement(By.className("nav-input")).click();
        String title=driver.getTitle();
        VerifyIfContains test=new VerifyIfContains();
        test.verifyIfURLContainsTitle(title,"candy");
        driver.close();
    }
}
