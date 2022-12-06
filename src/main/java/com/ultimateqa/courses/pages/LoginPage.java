package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By welcomeBackText = By.className("page__heading");
    By signInLinkOnLoginPage = By.xpath("//button[contains(text(),'Sign in')]");
    By invalidEmailOrPasswordText = By.className("form-error__list-item");

    public void sendTextToEmailField(String text) {
        sendTextToElement(emailField, text);
    }

    public void sendTextToPasswordField(String text) {
        sendTextToElement(passwordField, text);
    }

    public void clickOnSignInLinkOnLoginPage() {
        clickOnElement(signInLinkOnLoginPage);
    }

    public String getTextFromWelcomeBack() {
        return getTextFromElement(welcomeBackText);
    }

    public String getTextFromInvalidEmailOrPasswordText() {
        return getTextFromElement(invalidEmailOrPasswordText);
    }
}
