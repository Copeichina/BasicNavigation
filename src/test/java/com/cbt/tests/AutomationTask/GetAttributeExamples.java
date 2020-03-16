package com.cbt.tests.AutomationTask;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeExamples {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("Chrome");
        driver.get("https://www.ebay.com/");
        WebElement input=driver.findElement(By.id("gh-ac"));
        //get title
        System.out.println(driver.getTitle());

        //get current url
        System.out.println(driver.getCurrentUrl());

        //get page source
        System.out.println(driver.getPageSource());

        WebElement myEbay=driver.findElement(By.linkText("My eBay"));

        String classValue=myEbay.getAttribute("class");
        System.out.println(classValue);

        String href=myEbay.getAttribute("href");
        System.out.println(href);

        System.out.println(myEbay.getText());

        //.getAttribute("innerHTML")-->returns the text of the element
        System.out.println(myEbay.getAttribute("innerHTML"));

        //.getAttribute("outerHTML")-->get the html information of element
        System.out.println(myEbay.getAttribute("outerHTML"));
}}
