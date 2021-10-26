package com.footer.test;

import com.first.test.Setup;
import com.locators.test.FooterLocators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterAbout extends Setup implements FooterLocators {

    @Test(description = "Company Overview Test")
    public void companyOverviewTest(){
        driver.findElement(Company).click();
        String companyOverviewUrl = driver.getCurrentUrl();
        Assert.assertEquals(companyOverviewUrl, "https://qualitestgroup.com/about/");
    }

    @Test(description = "Leadership Team Test")
    public void leadershipTeamTest(){
        driver.findElement(Leadership).click();
        String leadershipTeamUrl = driver.getCurrentUrl();
        Assert.assertEquals(leadershipTeamUrl, "https://qualitestgroup.com/team/");
    }
    @Test(description = "News Center Test")
    public void newsCenterTest(){
        driver.findElement(By.linkText("News Center")).click();
        String newsCenterUrl = driver.getCurrentUrl();
        Assert.assertEquals(newsCenterUrl, "https://qualitestgroup.com/news-center/");
    }

    @Test(description = "Career Test")
    public void careerTest(){
        driver.findElement(Career).click();
        String urlCareers = driver.getCurrentUrl();
        Assert.assertEquals(urlCareers, "https://qualitestgroup.com/careers/");
    }

    @Test(description = "Diversity & Inclusion Test")
    public void diversityInclusionTest(){
        driver.findElement(DiversityAndInclusion).click();
        String diversityInclusionUrl = driver.getCurrentUrl();
        Assert.assertEquals(diversityInclusionUrl, "https://qualitestgroup.com/about-us/diversity-and-inclusion/");
    }
    @Test(description = "ESG Policy Test")
    public void esgPolicyTest(){
        driver.findElement(ESGPolicy).click();
        String esgPolicyUrl = driver.getCurrentUrl();
        Assert.assertEquals(esgPolicyUrl, "https://qualitestgroup.com/about-us/environmental-social-governance-policy/");
    }
}
