package com.hover.test;

import com.first.test.Setup;
import com.locators.test.HeaderLocators;
import com.locators.test.ProductLocators;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsHover extends Setup implements HeaderLocators, ProductLocators {
    @Test(description = "Products Tests")
    public void productTest(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Products)).perform();
        boolean testPredictorDisplay = driver.findElement(testPredictor).isDisplayed();
        Assert.assertEquals(testPredictorDisplay, true);
        boolean aiPoweredDisplay = driver.findElement(aiPowered).isDisplayed();
        Assert.assertEquals(aiPoweredDisplay, true);
        boolean testConsolidatorDisplay = driver.findElement(testConsolidator).isDisplayed();
        Assert.assertEquals(testConsolidatorDisplay, true);
        boolean qualiviewDisplay = driver.findElement(qualiview).isDisplayed();
        Assert.assertEquals(qualiviewDisplay, true);
        boolean qualicoachDisplay = driver.findElement(qualicoach).isDisplayed();
        Assert.assertEquals(qualicoachDisplay, true);
        boolean qualiframeDisplay = driver.findElement(qualiframe).isDisplayed();
        Assert.assertEquals(qualiframeDisplay, true);
        boolean qualidexDisplay = driver.findElement(qualidex).isDisplayed();
        Assert.assertEquals(qualidexDisplay, true);
        boolean qualihubDisplay = driver.findElement(qualihub).isDisplayed();
        Assert.assertEquals(qualihubDisplay, true);
    }
}
