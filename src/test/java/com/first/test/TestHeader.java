package com.first.test;

import com.locators.test.HeaderLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestHeader extends Setup implements HeaderLocators {

    @Test(description = "News Test")
    public void newsTest(){
        driver.findElement(News).click();
        String urlNews = driver.getCurrentUrl();
        Assert.assertEquals(urlNews, "https://qualitestgroup.com/news-center/");
    }

    @Test(description = "Career Test")
    public void careerTest(){
        driver.findElement(Career).click();
        String urlCareers = driver.getCurrentUrl();
        Assert.assertEquals(urlCareers, "https://qualitestgroup.com/careers/");
    }
}




    //    public SeleniumWait wait;
//    public TestHeader verifyDetailsOfPdfRegistration(String text) {
//
//        isElementDisplayed("careerMsg");
//        return this;
//    }
//
//    protected boolean isElementDisplayed(String elementName) throws NoSuchElementException {
//        boolean result = wait.waitForElementToBeVisible(element(elementName)).isDisplayed();
//        assertTrue(result, "ASSERT FAILED: element '" + elementName + "' is not displayed.");
//        logMessage("[ASSERT PASSED]: element " + elementName + " is displayed");
//        return result;
//    }
//
//    protected WebElement element(String elementToken) throws NoSuchElementException {
//        return element(elementToken, "");
//    }
//
//    protected WebElement element(String elementToken, String replacement) throws NoSuchElementException {
//        WebElement elem = null;
//        By locator = getLocator(elementToken, replacement);
//        try {
//            elem = wait.waitForElementToBeVisible(webdriver.findElement(locator));
//        } catch (TimeoutException excp) {
//            throw new NoSuchElementException("Element " + elementToken + " with locator "
//                    + locator.toString().substring(2) + " not found on the " + this.pageName + " !!!");
//        }
//        return elem;
//    }
//
//    protected By getLocator(String elementToken, String replacement) {
//        String[] locator = pageObjectReader.getElementFromFile(elementToken).toArray(new String[2]);
//        locator[1] = locator[1].replaceAll("\\$\\{.+\\}", replacement);
//        return getBy(locator[0].trim(), locator[1].trim());
//    }
//
//    private By getBy(String locatorType, String locatorValue) {
//        switch (Locators.valueOf(locatorType)) {
//            case id:
//                return By.id(locatorValue);
//            case xpath:
//                return By.xpath(locatorValue);
//            case css:
//                return By.cssSelector(locatorValue);
//            case name:
//                return By.name(locatorValue);
//            case classname:
//                return By.className(locatorValue);
//            case linktext:
//                return By.linkText(locatorValue);
//            default:
//                return By.id(locatorValue);
//        }
//    }
