package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerificationTests {
    public static void main(String[] args) {
        List<String> urls= Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String title1=driver.getTitle();
        String url1=driver.getCurrentUrl();
        driver.navigate().to(urls.get(1));
        String title2=driver.getTitle();
        String url2=driver.getCurrentUrl();
        driver.navigate().to(urls.get(2));
        String title3=driver.getTitle();
        String url3=driver.getCurrentUrl();

        StringUtility test=new StringUtility();
        test.verifyEquals(title1,title2);
        test.verifyEquals(title2,title3);
        test.verifyEquals(title1,title3);

        test.verifyStartsWith("http://practice.cybertekschool.com",url1);
       test.verifyStartsWith("http://practice.cybertekschool.com",url2);
        test.verifyStartsWith("http://practice.cybertekschool.com",url3);


        driver.close();
    }
}
