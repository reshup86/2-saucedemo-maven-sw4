package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.VerifyProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    VerifyProductPage verifyProductPage = new VerifyProductPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(verifyProductPage.getTextMessage(),expectedMessage,"Invalid text displayed");
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        int expectedProductNumber = 6;
        Assert.assertEquals(verifyProductPage.getProductsError(),expectedProductNumber,"Invalid data matched");
    }
}
