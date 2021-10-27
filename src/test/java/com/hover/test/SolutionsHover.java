package com.hover.test;

import com.first.test.Setup;
import com.locators.test.HeaderLocators;
import com.locators.test.SolutionsLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionsHover extends Setup implements HeaderLocators, SolutionsLocators {

    @Test(description = "Company Overview Test")
    public void companyOverviewTest(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Solution)).perform();
        boolean crmDisplay = driver.findElement(crm).isDisplayed();
        Assert.assertEquals(crmDisplay, true);
        boolean hrisDisplay = driver.findElement(hris).isDisplayed();
        Assert.assertEquals(hrisDisplay, true);
        boolean sapDisplay = driver.findElement(sap).isDisplayed();
        Assert.assertEquals(sapDisplay, true);
        boolean iotDisplay = driver.findElement(iot).isDisplayed();
        Assert.assertEquals(iotDisplay, true);
        boolean erpDisplay = driver.findElement(erp).isDisplayed();
        Assert.assertEquals(erpDisplay, true);
        boolean cloudTestingDisplay = driver.findElement(cloudTesting).isDisplayed();
        Assert.assertEquals(cloudTestingDisplay, true);
        boolean appAndWebDisplay = driver.findElement(appAndWeb).isDisplayed();
        Assert.assertEquals(appAndWebDisplay, true);
        boolean apiDisplay = driver.findElement(api).isDisplayed();
        Assert.assertEquals(apiDisplay, true);
    }

}
