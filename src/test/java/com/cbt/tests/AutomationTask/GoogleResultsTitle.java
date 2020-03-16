package com.cbt.tests.AutomationTask;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleResultsTitle {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        WebElement searchBar=driver.findElement(By.xpath("//input[@title='Search']"));

        List<String> searchStr= Arrays.asList("Java","cucumber bdd","Selenium webbrowser automation");
        List<String> urls=new ArrayList<>();
        searchBar.sendKeys(searchStr.get(0)+ Keys.ENTER);
       String firstUrl= searchBar.findElement(By.xpath("//cite[@class='iUh30 tjvcx']")).getText();
        System.out.println(firstUrl);
        for(int i=0;i<searchStr.size();i++){
            searchBar.sendKeys(searchStr.get(i));


        }
    }
}
