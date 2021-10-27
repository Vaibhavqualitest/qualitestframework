package com.hover.test;

import com.first.test.Setup;
import com.locators.test.HeaderLocators;
import com.locators.test.PartnersLocators;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PartnersHover extends Setup implements HeaderLocators, PartnersLocators {

    @Test(description = "Partners Test")
    public void partnerTest(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Partner)).perform();
        boolean microsoftDisplay = driver.findElement(microsoft).isDisplayed();
        Assert.assertEquals(microsoftDisplay, true);
        boolean headspinDisplay = driver.findElement(headspin).isDisplayed();
        Assert.assertEquals(headspinDisplay, true);
        boolean smartBearDisplay = driver.findElement(smartBear).isDisplayed();
        Assert.assertEquals(smartBearDisplay, true);
        boolean keysightTechnologiesDisplay = driver.findElement(keysightTechnologies).isDisplayed();
        Assert.assertEquals(keysightTechnologiesDisplay, true);
        boolean tricentisDisplay = driver.findElement(tricentis).isDisplayed();
        Assert.assertEquals(tricentisDisplay, true);
        boolean sauceLabsDisplay = driver.findElement(sauceLabs).isDisplayed();
        Assert.assertEquals(sauceLabsDisplay, true);
        boolean testbirdsDisplay = driver.findElement(testbirds).isDisplayed();
        Assert.assertEquals(testbirdsDisplay, true);
        boolean digitalAiDisplay = driver.findElement(digitalAi).isDisplayed();
        Assert.assertEquals(digitalAiDisplay, true);
        boolean qualiDisplay = driver.findElement(quali).isDisplayed();
        Assert.assertEquals(qualiDisplay, true);
        boolean veracodeDisplay = driver.findElement(veracode).isDisplayed();
        Assert.assertEquals(veracodeDisplay, true);

    }
}
