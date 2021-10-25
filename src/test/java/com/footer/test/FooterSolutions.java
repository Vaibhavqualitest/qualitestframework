package com.footer.test;

import com.first.test.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterSolutions extends Setup {

    @Test(description = "Technology Test")
    public void technologyTest(){
        driver.findElement(By.linkText("Your Technologies")).click();
        String techUrl = driver.getCurrentUrl();
        Assert.assertEquals(techUrl, "https://qualitestgroup.com/your-technologies/");
    }

    @Test(description = "Initiative Test")
    public void initiativeTest(){
        driver.findElement(By.linkText("Your Initiatives")).click();
        String initiativeUrl = driver.getCurrentUrl();
        Assert.assertEquals(initiativeUrl, "https://qualitestgroup.com/your-initiatives/");
    }

    @Test(description = "Industry Test")
    public void industryTest(){
        driver.findElement(By.linkText("Industries")).click();
        String industryUrl = driver.getCurrentUrl();
        Assert.assertEquals(industryUrl, "https://qualitestgroup.com/industries/");
    }
}
