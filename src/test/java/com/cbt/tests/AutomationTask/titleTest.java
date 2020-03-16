package com.cbt.tests.AutomationTask;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class titleTest {
    /*

     */

    public static void main(String[] args) throws InterruptedException {
titleTest();
shortcutTest();
    }

    private static void shortcutTest() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("Chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        String expectedTitle="Dasboard";
        String actualTitle=driver.getTitle();

        verifyStartsWith(expectedTitle, actualTitle);

        WebElement shortcutIcon=driver.findElement(By.cssSelector("a[title='Shortcuts']"));
        shortcutIcon.click();

        WebElement allLinks=driver.findElement(By.linkText("See full list"));
        allLinks.click();

        Thread.sleep(2000);
        WebElement opportunities=driver.findElement(By.linkText("Opportunities"));
        opportunities.click();

        Thread.sleep(2000);
        verifyStartsWith("Open Opportunities",driver.getTitle());

        shortcutIcon.click();
        allLinks.click();

        Thread.sleep(2000);
        WebElement vehicleServiceLogs=driver.findElement(By.linkText("Vehicle services logs"));
        vehicleServiceLogs.click();

        //vehicleServiceLogs.isDisplayed();
        Thread.sleep(2000);
        WebElement errorMessage=driver.findElement(By.cssSelector(".message"));
        String errorMessageText=errorMessage.getText();
        System.out.println(errorMessageText);

    }

    private static void verifyStartsWith(String expectedTitle, String actualTitle) {
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Expected " + expectedTitle);
            System.out.println("Actual " + actualTitle);
        }
    }

    private static void titleTest() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("Chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        WebElement profileName=driver.findElement(By.cssSelector("a[href='javascript: void(0);']"));
        Thread.sleep(2000);
        profileName.click();

        Thread.sleep(2000);
        WebElement myConfiguration=driver.findElement(By.cssSelector("ul.dropdown-menu>li>a[href='/config/user/profile']"));
        myConfiguration.click();

        Thread.sleep(1000);
        String expected=profileName.getText();
        String actual=driver.getTitle();

        if(actual.startsWith(expected)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected "+expected);
            System.out.println("Actual "+actual);
        }
    }
}
