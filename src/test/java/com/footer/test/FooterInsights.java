package com.footer.test;

import com.first.test.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterInsights extends Setup {

    @Test(description = "Blog Test")
    public void blogTest(){
        driver.findElement(By.linkText("Blog")).click();
        String blogUrl = driver.getCurrentUrl();
        Assert.assertEquals(blogUrl, "https://qualitestgroup.com/insights/blog/");
    }

    @Test(description = "Webinars Test")
    public void webinarTest(){
        driver.findElement(By.linkText("Webinars")).click();
        String webinarUrl = driver.getCurrentUrl();
        Assert.assertEquals(webinarUrl, "https://qualitestgroup.com/insights/webinars/");
    }

    @Test(description = "Podcast Test")
    public void podcastTest(){
        driver.findElement(By.linkText("Podcast: The Testing Show")).click();
        String podcastUrl = driver.getCurrentUrl();
        Assert.assertEquals(podcastUrl, "https://qualitestgroup.com/insights/podcasts/");
    }

    @Test(description = "Technical Hub Test")
    public void technicalHubTest(){
        driver.findElement(By.linkText("Technical Hub")).click();
        String technicalUrl = driver.getCurrentUrl();
        Assert.assertEquals(technicalUrl, "https://qualitestgroup.com/insights/technical-hub/");
    }
}
