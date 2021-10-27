package com.hover.test;

import com.first.test.Setup;
import com.locators.test.HeaderLocators;
import com.locators.test.HowWeEngageLocators;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeEngageHover extends Setup implements HeaderLocators, HowWeEngageLocators {
    @Test(description = "How we engage Testing")
    public void howWeEngage(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Engage)).perform();
        boolean engageDisplay = driver.findElement(Engage).isDisplayed();
        Assert.assertEquals(engageDisplay, true);
        boolean managedTestingServiceDisplay = driver.findElement(managedTestingService).isDisplayed();
        Assert.assertEquals(managedTestingServiceDisplay, true);
        boolean projectBasedTestingDisplay = driver.findElement(projectBasedTesting).isDisplayed();
        Assert.assertEquals(projectBasedTestingDisplay, true);
        boolean globalDeliveryDisplay = driver.findElement(globalDelivery).isDisplayed();
        Assert.assertEquals(globalDeliveryDisplay, true);
        boolean riskBasedTestingDisplay = driver.findElement(riskBasedTesting).isDisplayed();
        Assert.assertEquals(riskBasedTestingDisplay, true);
        boolean strategicConsultancyDisplay = driver.findElement(strategicConsultancy).isDisplayed();
        Assert.assertEquals(strategicConsultancyDisplay, true);
        boolean managedCrowdTestingDisplay = driver.findElement(managedCrowdTesting).isDisplayed();
        Assert.assertEquals(managedCrowdTestingDisplay, true);
    }
}
