package com.first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeaderSecond extends Setup{

    @Test(description = "Solution Test")
    public void solutionTest(){
        driver.findElement(By.linkText("Solutions")).click();
        String solutionUrl = driver.getCurrentUrl();
        Assert.assertEquals(solutionUrl, "https://qualitestgroup.com/our-solutions/");
    }

    @Test(description = "Industry Test")
    public void industryTest(){
        driver.findElement(By.linkText("Industries")).click();
        String industryUrl = driver.getCurrentUrl();
        Assert.assertEquals(industryUrl, "https://qualitestgroup.com/industries/");
    }

    @Test(description = "Engage Test")
    public void engageTest(){
        driver.findElement(By.linkText("How We Engage")).click();
        String engageUrl = driver.getCurrentUrl();
        Assert.assertEquals(engageUrl, "https://qualitestgroup.com/how-we-engage/");
    }

    @Test(description = "Products Test")
    public void productTest(){
        driver.findElement(By.linkText("Products")).click();
        String productUrl = driver.getCurrentUrl();
        Assert.assertEquals(productUrl, "https://qualitestgroup.com/products/");
    }

    @Test(description = "Partners Test")
    public void partnerTest(){
        driver.findElement(By.linkText("Partners")).click();
        String partnerUrl = driver.getCurrentUrl();
        Assert.assertEquals(partnerUrl, "https://qualitestgroup.com/partners/");
    }

    @Test(description = "Insight Test")
    public void insightTest(){
        driver.findElement(By.linkText("Insights")).click();
        String insightUrl = driver.getCurrentUrl();
        Assert.assertEquals(insightUrl, "https://qualitestgroup.com/insights/");
    }

    @Test(description = "logo Test")
    public void logoTest(){
        driver.findElement(By.id("qualitest_logo")).click();
        String logoUrl = driver.getCurrentUrl();
        Assert.assertEquals(logoUrl, "https://qualitestgroup.com/");
    }

    @Test(description = "search Test")
    public void searchTest(){
        driver.findElement(By.cssSelector("#search_toggle > i")).click();
        WebElement textBox = driver.findElement(By.id("search_input"));
        textBox.sendKeys("host");
        driver.findElement(By.id("search_button")).click();
        String logoUrl = driver.getCurrentUrl();
        Assert.assertEquals(logoUrl, "https://qualitestgroup.com/?s=host");
    }

    @Test(description = "Contact Test")
    public void contactTest(){
        driver.findElement(By.cssSelector("#updated_nav > div.main-nav__search > a.main-nav-btn > span")).click();
        String contactUrl = driver.getCurrentUrl();
        Assert.assertEquals(contactUrl, "https://qualitestgroup.com/contact-us/");
    }

}
