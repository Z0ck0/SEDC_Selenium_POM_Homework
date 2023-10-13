package com.demoqa_pom_homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterNewUser {

    private WebDriver driver;
    private WebDriverWait wait;

    private By fName = By.xpath("//*[@id=\"firstname\"]");
    private By lName = By.xpath("//*[@id=\"lastname\"]");
    private By userName = By.xpath("//*[@id=\"userName\"]");
    private By password = By.xpath("//*[@id=\"password\"]");
    private By registerButton = By.xpath("//*[@id=\"register\"]");
    private By reCaptcha = By.xpath("//*[contains(text(), \"Please verify reCaptcha to register!\")]");


    public RegisterNewUser(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void enterFirstName(String fname){
        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(fName));
        firstName.sendKeys(fname);
    }

    public void enterLastName(String lname){
        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(lName));
        lastName.sendKeys(lname);
    }

    public void enterUserName(String usrname){
        WebElement newUserName = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        newUserName.sendKeys(usrname);
    }

    public void enterPassword(String pass){
        WebElement newPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        newPassword.sendKeys(pass);
    }

    public void clickRegisterButton (){
        WebElement newRegister = wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton));
        newRegister.click();
    }

    public String getTextFromRecaptchaVerification() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(reCaptcha)).getText();
    }
}
