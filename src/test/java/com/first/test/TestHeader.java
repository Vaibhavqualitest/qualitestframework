package com.first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHeader extends Setup{

//    public WebDriver driver;
//
//
////    @BeforeTest
//    public void setup(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav.bajpai\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://qualitestgroup.com/");
//        driver.manage().window().maximize();
//    }

    @Test(description = "News Test")
    public void aboutTest(){
        driver.findElement(By.cssSelector("#mega-menu-item-14712 > a")).click();
        String urlNews = driver.getCurrentUrl();
        Assert.assertEquals(urlNews, "https://qualitestgroup.com/news-center/");
    }

    @Test(description = "Career Test")
    public void careerTest(){
        driver.findElement(By.linkText("Careers")).click();
        String urlCareers = driver.getCurrentUrl();
        Assert.assertEquals(urlCareers, "https://qualitestgroup.com/careers/");
    }
}
