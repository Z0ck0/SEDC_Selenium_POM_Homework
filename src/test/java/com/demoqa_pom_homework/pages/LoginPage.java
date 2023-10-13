package com.demoqa_pom_homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;


    private By userName = By.xpath("//*[@id=\"userName\"]");
    private By password = By.xpath("//*[@id=\"password\"]");
    private By loginButton = By.xpath("//*[@id=\"login\"]");
    private By newUser = By.xpath("//*[@id=\"newUser\"]");

    private By verificationMessage = By.xpath("//*[contains(text(), \"Invalid username or password!\")]");


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToLoginPage (){
        driver.navigate().to("https://demoqa.com/login");
    }

    public void enterUsername(String name) {
        WebElement userName1 = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        userName1.sendKeys(name);
    }

    public void enterPassword(String pass) {
        WebElement userPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        userPassword.sendKeys(pass);
    }

    public void clickSubmitButton() {
        WebElement userPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        userPassword.click();
    }

    public void clickNewUserButton() {
        WebElement newUserButton = wait.until(ExpectedConditions.visibilityOfElementLocated(newUser));
        newUserButton.click();
    }


    public String getTextFromVerification() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verificationMessage)).getText();
    }


}
