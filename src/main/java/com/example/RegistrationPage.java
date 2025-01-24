package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    private By usernameField= By.id("username");
    private By passwordField= By.id("password");
    private By emailField= By.id("email");
    private By registerButton= By.id("register");
    private By successMessage= By.id("successMessage");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void fillUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    public void fillPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void fillEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void submitForm(){
        driver.findElement(By.id("registerButton")).click();
    }

    public boolean isMessageDisplayed(){
        return driver.findElement(successMessage).isDisplayed();
    }

    public void openUrl(String url){
        driver.get(url);
    }
}
