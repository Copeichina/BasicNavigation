package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.VerifyIfContains;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com",
                "https://www.westelm.com", "https://walmart.com");
        List<String> titles = new ArrayList<>();
        for (int i = 0; i < urls.size(); i++) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(urls.get(i));
            titles.add(driver.getTitle());


            VerifyIfContains test = new VerifyIfContains();
            test.verifyIfURLContainsTitle(urls.get(0), titles.get(0));
            test.verifyIfURLContainsTitle(urls.get(1), titles.get(1));
            test.verifyIfURLContainsTitle(urls.get(2), titles.get(2));
            test.verifyIfURLContainsTitle(urls.get(3), titles.get(3));

            driver.quit();
        }
    }
}
