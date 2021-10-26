package com.locators.test;

import org.openqa.selenium.By;

public interface HeaderLocators {
    //TestHeader's Locators
    By Career = By.linkText("Careers");
    By News = By.cssSelector("#mega-menu-item-14712 > a");

    //TestHeaderSecond's Locators
    By Solution = By.linkText("Solutions");
    By Industry = By.linkText("Industries");
    By Engage = By.linkText("How We Engage");
    By Products = By.linkText("Products");
    By Partner = By.linkText("Partners");
    By Insight = By.linkText("Insights");
    By Logo = By.id("qualitest_logo");
    By SearchSymbol = By.cssSelector("#search_toggle > i");
    By SearchBoxField = By.id("search_input");
    By SearchButton = By.id("search_button");
    By Contact = By.cssSelector("#updated_nav > div.main-nav__search > a.main-nav-btn > span");
}
