package com.footer.test;

import com.first.test.Setup;
import com.locators.test.FooterLocators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterSolutions extends Setup implements FooterLocators {

    @Test(description = "Technology Test")
    public void technologyTest(){
        driver.findElement(YourTechnologies).click();
        String techUrl = driver.getCurrentUrl();
        Assert.assertEquals(techUrl, "https://qualitestgroup.com/your-technologies/");
    }

    @Test(description = "Initiative Test")
    public void initiativeTest(){
        driver.findElement(YourInitiative).click();
        String initiativeUrl = driver.getCurrentUrl();
        Assert.assertEquals(initiativeUrl, "https://qualitestgroup.com/your-initiatives/");
    }

    @Test(description = "Industry Test")
    public void industryTest(){
        driver.findElement(Industries).click();
        String industryUrl = driver.getCurrentUrl();
        Assert.assertEquals(industryUrl, "https://qualitestgroup.com/industries/");
    }
}
