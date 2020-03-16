package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.VerifyIfContains;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls= Arrays.asList("https://luluandgeorgia.com","https://wayfair.com",
                "https://www.westelm.com","https://walmart.com");
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String title0=driver.getTitle();
        driver.navigate().to(urls.get(1));
        String title1=driver.getTitle();
        driver.navigate().to(urls.get(2));
        String title2=driver.getTitle();
        driver.navigate().to(urls.get(3));
        String title3=driver.getTitle();

        VerifyIfContains test=new VerifyIfContains();
        test.verifyIfURLContainsTitle(urls.get(0),title0);
        test.verifyIfURLContainsTitle(urls.get(1),title1);
        test.verifyIfURLContainsTitle(urls.get(2),title2);
        test.verifyIfURLContainsTitle(urls.get(3),title3);

        driver.quit();
    }
}
