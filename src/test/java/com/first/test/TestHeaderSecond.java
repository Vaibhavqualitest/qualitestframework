package com.first.test;

import com.locators.test.HeaderLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeaderSecond extends Setup implements HeaderLocators {

    @Test(description = "Solution Test")
    public void solutionTest(){
        driver.findElement(Solution).click();
        String solutionUrl = driver.getCurrentUrl();
        Assert.assertEquals(solutionUrl, "https://qualitestgroup.com/our-solutions/");
    }

    @Test(description = "Industry Test")
    public void industryTest(){
        driver.findElement(Industry).click();
        String industryUrl = driver.getCurrentUrl();
        Assert.assertEquals(industryUrl, "https://qualitestgroup.com/industries/");
    }

    @Test(description = "Engage Test")
    public void engageTest(){
        driver.findElement(Engage).click();
        String engageUrl = driver.getCurrentUrl();
        Assert.assertEquals(engageUrl, "https://qualitestgroup.com/how-we-engage/");
    }

    @Test(description = "Products Test")
    public void productTest(){
        driver.findElement(Products).click();
        String productUrl = driver.getCurrentUrl();
        Assert.assertEquals(productUrl, "https://qualitestgroup.com/products/");
    }

    @Test(description = "Partners Test")
    public void partnerTest(){
        driver.findElement(Partner).click();
        String partnerUrl = driver.getCurrentUrl();
        Assert.assertEquals(partnerUrl, "https://qualitestgroup.com/partners/");
    }

    @Test(description = "Insight Test")
    public void insightTest(){
        driver.findElement(Insight).click();
        String insightUrl = driver.getCurrentUrl();
        Assert.assertEquals(insightUrl, "https://qualitestgroup.com/insights/");
    }

    @Test(description = "logo Test")
    public void logoTest(){
        driver.findElement(Logo).click();
        String logoUrl = driver.getCurrentUrl();
        Assert.assertEquals(logoUrl, "https://qualitestgroup.com/");
    }

    @Test(description = "search Test")
    public void searchTest(){
        driver.findElement(SearchSymbol).click();
        WebElement textBox = driver.findElement(SearchBoxField);
        textBox.sendKeys("host");
        driver.findElement(SearchButton).click();
        String logoUrl = driver.getCurrentUrl();
        Assert.assertEquals(logoUrl, "https://qualitestgroup.com/?s=host");
    }

    @Test(description = "Contact Test")
    public void tc1_contactTest(){
        driver.findElement(Contact).click();
        String contactUrl = driver.getCurrentUrl();
        Assert.assertEquals(contactUrl, "https://qualitestgroup.com/contact-us/");
    }

}
