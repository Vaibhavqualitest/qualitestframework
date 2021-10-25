package com.footer.test;

import com.first.test.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterWhyQualitest extends Setup {

    @Test(description = "Testimonials Test")
    public void testimonialsTest(){
        driver.findElement(By.linkText("Testimonials")).click();
        String testimonialsUrl = driver.getCurrentUrl();
        Assert.assertEquals(testimonialsUrl, "https://www.qualitestgroup.com/why-qualitest/testimonials/");
        driver.navigate().back();
    }

    @Test(description = "Case Studies Test")
    public void casestudiesTest(){
        driver.findElement(By.linkText("Case Studies")).click();
        String casestudiesUrl = driver.getCurrentUrl();
        Assert.assertEquals(casestudiesUrl, "https://qualitestgroup.com/insights/blog/");
        driver.navigate().back();
    }

    @Test(description = "Talent Induction Process Test")
    public void talentAquisitionTest(){
        driver.findElement(By.linkText("Talent Induction Process")).click();
        String talentAquisitionUrl = driver.getCurrentUrl();
        Assert.assertEquals(talentAquisitionUrl, "https://www.qualitestgroup.com/why-qualitest/talent-induction-process/");
        driver.navigate().back();
    }
}
