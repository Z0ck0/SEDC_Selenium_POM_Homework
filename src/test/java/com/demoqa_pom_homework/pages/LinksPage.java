package com.demoqa_pom_homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {

    private WebDriver driver;
    private WebDriverWait wait;


    private By createdLink = By.xpath("//*[@id=\"created\"]");
    private By noContentLink = By.xpath("//*[@id=\"no-content\"]");
    private By movedLink = By.xpath("//*[@id=\"moved\"]");
    private By badRequestLink = By.xpath("//*[@id=\"bad-request\"]");
    private By unautorizedLink = By.xpath("//*[@id=\"unauthorized\"]");
    private By forbiddenLink = By.xpath("//*[@id=\"forbidden\"]");
    private By notFoundLink = By.xpath("//*[@id=\"invalid-url\"]");


    public LinksPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToLinksPage() {
        driver.navigate().to("https://demoqa.com/links");
    }


    public void clickCreatedLink() {
        WebElement createdLinkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(createdLink));
        createdLinkElement.click();
    }

    public void clickNoContentLink() {
        WebElement noContentLinkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(noContentLink));
        noContentLinkElement.click();
    }

    public void clickMovedLink() {
        WebElement movedLinkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(movedLink));
        movedLinkElement.click();
    }

    public void clickBadRequestLink() {
        WebElement badRequestLinkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(badRequestLink));
        badRequestLinkElement.click();
    }

    public void clickUnauthorizedLink() {
        WebElement unautorizedLinkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(unautorizedLink));
        unautorizedLinkElement.click();
    }

    public void clickForbiddenLink() {
        WebElement forbiddenLinkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(forbiddenLink));
        forbiddenLinkElement.click();
    }

    public void clickNotFoundLink() {
        WebElement notFoundLinkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(notFoundLink));
        notFoundLinkElement.click();
    }


    //*[@id="linkResponse"]/b[2]
    private By createdLinkMessage = By.xpath("//*[@id=\"linkResponse\"]/b[contains(text(), \"Created\")]");
    private By noContentLinkMessage = By.xpath("//*[@id=\"linkResponse\"]/b[contains(text(), \"No Content\")]");
    private By movedLinkMessage = By.xpath("//*[@id=\"linkResponse\"]/b[contains(text(), \"Moved Permanently\")]");
    private By badRequestLinkMessage = By.xpath("//*[@id=\"linkResponse\"]/b[contains(text(), \"Bad Request\")]");
    private By unauthorizedLinkMessage = By.xpath("//*[@id=\"linkResponse\"]/b[contains(text(), \"Unauthorized\")]");
    private By forbiddenLinkMessage = By.xpath("//*[@id=\"linkResponse\"]/b[contains(text(), \"Forbidden\")]");
    private By notFoundLinkMessage = By.xpath("//*[@id=\"linkResponse\"]/b[contains(text(), \"Not Found\")]");


    public String getCreatedLinkMessage() {
        WebElement respondCreateMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(createdLinkMessage));
        return respondCreateMessageElement.getText();
    }

    public String getNoContentLinkMessage() {
        WebElement respondNoContentMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(noContentLinkMessage));
        return respondNoContentMessage.getText();
    }

    public String getMovedLinkMessage() {
        WebElement respondMovedMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(movedLinkMessage));
        return respondMovedMessage.getText();
    }

    public String getBadRequestLinkMessage() {
        WebElement respondBadRequestMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(badRequestLinkMessage));
        return respondBadRequestMessage.getText();
    }

    public String getUnauthorizedLinkMessage() {
        WebElement respondUnauthorizedMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(unauthorizedLinkMessage));
        return respondUnauthorizedMessage.getText();
    }

    public String getForbiddenLinkMessage() {
        WebElement respondForbiddenMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(forbiddenLinkMessage));
        return respondForbiddenMessage.getText();
    }

    public String getNotFoundLinkMessage() {
        WebElement respondNotFoundMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(notFoundLinkMessage));
        return respondNotFoundMessage.getText();
    }

}



