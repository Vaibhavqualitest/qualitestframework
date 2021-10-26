package com.locators.test;

import org.openqa.selenium.By;

public interface FooterLocators {

    //FooterAbout's Locators
    By Company = By.linkText("Company Overview");
    By Leadership = By.linkText("Leadership Team");
    By Career = By.linkText("Careers");
    By DiversityAndInclusion = By.linkText("Diversity & Inclusion");
    By ESGPolicy = By.linkText("ESG Policy");

    //FooterInsights' Locators
    By Blog = By.linkText("Blog");
    By Webinars = By.linkText("Webinars");
    By Podcast = By.linkText("Podcast: The Testing Show");
    By TechnicalHub = By.linkText("Technical Hub");

    //FooterSolutions' Locators
    By YourTechnologies = By.linkText("Your Technologies");
    By YourInitiative = By.linkText("Your Initiatives");
    By Industries = By.linkText("Industries");

    //FooterWhyQualitest's Locators
    By Testimonials = By.linkText("Testimonials");
    By CaseStudies = By.linkText("Case Studies");
    By TalentInductionProcess = By.linkText("Talent Induction Process");
}
