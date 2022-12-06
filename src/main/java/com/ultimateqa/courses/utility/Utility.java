package com.ultimateqa.courses.utility;

import com.ultimateqa.courses.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends ManageBrowser {
    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement elementLink = driver.findElement(by);
        elementLink.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
}
