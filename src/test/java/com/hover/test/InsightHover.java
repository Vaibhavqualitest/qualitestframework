package com.hover.test;

import com.first.test.Setup;
import com.locators.test.HeaderLocators;
import com.locators.test.InsightsLocators;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsightHover extends Setup implements HeaderLocators, InsightsLocators {

    @Test(description = "insightHover Test")
    public void insightHover(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Insight)).perform();
        boolean blogDisplay = driver.findElement(blog).isDisplayed();
        Assert.assertEquals(blogDisplay, true);
        boolean technicalHubDisplay = driver.findElement(technicalHub).isDisplayed();
        Assert.assertEquals(technicalHubDisplay, true);
        boolean webinarsDisplay = driver.findElement(webinars).isDisplayed();
        Assert.assertEquals(webinarsDisplay, true);
        boolean caseStudiesDisplay = driver.findElement(caseStudies).isDisplayed();
        Assert.assertEquals(caseStudiesDisplay, true);
        boolean podcastDisplay = driver.findElement(podcast).isDisplayed();
        Assert.assertEquals(podcastDisplay, true);
        boolean categoriesTagsDisplay = driver.findElement(categoriesTags).isDisplayed();
        Assert.assertEquals(categoriesTagsDisplay, true);
    }
}
