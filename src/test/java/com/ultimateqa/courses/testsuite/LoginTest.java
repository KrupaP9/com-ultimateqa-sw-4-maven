package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.pages.MainPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    //method to navigate to the login page
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        mainPage.clickOnLoginLink();
        String expectedWelcome = "Welcome Back!";
        String actualWelcome = loginPage.getTextFromWelcomeBack();
        Assert.assertEquals(actualWelcome,expectedWelcome,"Welcome not displayed");
    }
    //method to verify an error message when an invalid email or password is entered
    @Test
    public void verifyTheErrorMessage() throws InterruptedException{
        mainPage.clickOnLoginLink();
        loginPage.sendTextToEmailField("johnsmith0123@gmail.com");
        loginPage.sendTextToPasswordField("password123");
        Thread.sleep(1000);
        loginPage.clickOnSignInLinkOnLoginPage();
        String expectedErrorMessage = "Invalid email or password.";
        String actualErrorMessage = loginPage.getTextFromInvalidEmailOrPasswordText();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Error message not displayed");
    }
}
