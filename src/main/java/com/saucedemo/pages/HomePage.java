package com.saucedemo.pages;

import com.saucedemo.uitilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void enterpassword(String password){
        sendTextToElement(passwordField,password);

    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }


}