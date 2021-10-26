package com.footer.test;

import com.first.test.Setup;
import com.locators.test.FooterLocators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterWhyQualitest extends Setup implements FooterLocators {

    @Test(description = "Testimonials Test")
    public void testimonialsTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Testimonials).click();
        String testimonialsUrl = driver.getCurrentUrl();
        Assert.assertEquals(testimonialsUrl, "https://www.qualitestgroup.com/why-qualitest/testimonials/");
    }

    @Test(description = "Case Studies Test")
    public void casestudiesTest() throws InterruptedException {
        driver.findElement(CaseStudies).click();
        Thread.sleep(3000);
        String casestudiesUrl = driver.getCurrentUrl();
        Assert.assertEquals(casestudiesUrl, "https://qualitestgroup.com/insights/blog/");
    }

    @Test(description = "Talent Induction Process Test")
    public void talentAquisitionTest() throws InterruptedException {
        driver.findElement(TalentInductionProcess).click();
        Thread.sleep(3000);
        String talentAquisitionUrl = driver.getCurrentUrl();
        Assert.assertEquals(talentAquisitionUrl, "http://www.qualitestgroup.com/why-qualitest/talent-induction-process/");
    }
}
