package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class EdgeMethodTest {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String titleOfPage=driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String titleOfEtsy=driver.getTitle();
        driver.navigate().back();
        if(driver.getTitle().equals(titleOfPage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual "+titleOfPage);
            System.out.println("Expected "+driver.getTitle());
        }
        driver.navigate().forward();
        if( driver.getTitle().equals(titleOfEtsy)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+titleOfEtsy);
            System.out.println("Actual "+driver.getTitle());
        }
        driver.quit();
    }
}
