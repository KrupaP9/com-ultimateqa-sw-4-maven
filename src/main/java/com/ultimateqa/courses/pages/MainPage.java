package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class MainPage extends Utility {
    By signInLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']/a");

    public void clickOnLoginLink() {
        clickOnElement(signInLink);
    }
}
