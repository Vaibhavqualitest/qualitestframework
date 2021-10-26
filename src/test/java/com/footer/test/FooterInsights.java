package com.footer.test;

import com.first.test.Setup;
import com.locators.test.FooterLocators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class FooterInsights extends Setup implements FooterLocators {

    @Test(description = "Blog Test")
    public void blogTest(){
        driver.findElement(Blog).click();
        String blogUrl = driver.getCurrentUrl();
        Assert.assertEquals(blogUrl, "https://qualitestgroup.com/insights/blog/");
    }

    @Test(description = "Webinars Test")
    public void webinarTest(){
        driver.findElement(Webinars).click();
        String webinarUrl = driver.getCurrentUrl();
        Assert.assertEquals(webinarUrl, "https://qualitestgroup.com/insights/webinars/");
    }

    @Test(description = "Podcast Test")
    public void podcastTest(){
        driver.findElement(Podcast).click();
        String podcastUrl = driver.getCurrentUrl();
        Assert.assertEquals(podcastUrl, "https://qualitestgroup.com/insights/podcasts/");
    }

    @Test(description = "Technical Hub Test")
    public void technicalHubTest(){
        driver.findElement(TechnicalHub).click();
        String technicalUrl = driver.getCurrentUrl();
        Assert.assertEquals(technicalUrl, "https://qualitestgroup.com/insights/technical-hub/");
    }
}
