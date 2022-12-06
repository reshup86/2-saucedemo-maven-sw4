package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.id("login-button");


    public void enterUserName(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickLoginButton(){
        clickOnElement(loginButton);
    }

}
