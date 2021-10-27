package com.hover.test;

import com.first.test.Setup;
import com.locators.test.FooterLocators;
import com.locators.test.IndustriesLocators;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndustriesHover extends Setup implements FooterLocators, IndustriesLocators {

    @Test(description = "Hover Test Industries")
    public void industryHoverTest(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Industries)).perform();
        boolean industryDisplay = driver.findElement(Industries).isDisplayed();
        Assert.assertEquals(industryDisplay, true);
        boolean bankingAndFinancialDisplay = driver.findElement(bankingAndFinancial).isDisplayed();
        Assert.assertEquals(bankingAndFinancialDisplay, true);
        boolean telecomDisplay = driver.findElement(telecom).isDisplayed();
        Assert.assertEquals(telecomDisplay, true);
        boolean retailDisplay = driver.findElement(retail).isDisplayed();
        Assert.assertEquals(retailDisplay, true);
        boolean utilitiesDisplay = driver.findElement(utilities).isDisplayed();
        Assert.assertEquals(utilitiesDisplay, true);
        boolean insuranceDisplay = driver.findElement(insurance).isDisplayed();
        Assert.assertEquals(insuranceDisplay, true);
        boolean healthcareDisplay = driver.findElement(healthcare).isDisplayed();
        Assert.assertEquals(healthcareDisplay, true);
        boolean mediaAndEntertainmentDisplay = driver.findElement(mediaAndEntertainment).isDisplayed();
        Assert.assertEquals(mediaAndEntertainmentDisplay, true);
        boolean medicalDevicesDisplay = driver.findElement(medicalDevices).isDisplayed();
        Assert.assertEquals(medicalDevicesDisplay, true);
    }
}
