package com.demoqa_pom_homework.tests;

import com.demoqa_pom_homework.utilities.dataProviders.InvalidLoginData;
import com.demoqa_pom_homework.utilities.dataProviders.RegisterUserData;
import org.testng.Assert;
import org.testng.annotations.Test;

// This is the test class for demoqa.com page tests, it extends the BaseTestConfiguration.
public class DemoQAPageTests extends BaseTestConfiguration {

    // This test method clicks on various links and asserts the messages displayed for each link.
    @Test(priority = 1)
    public void LinksPage_APICallVerification() throws InterruptedException {
        linksPage.navigateToLinksPage();

        // Click on each link and assert the displayed message for that link.
        // This test method ensures that all the links on the page work correctly.
        linksPage.clickCreatedLink();
        Assert.assertEquals(linksPage.getCreatedLinkMessage(), "Created");

        linksPage.clickNoContentLink();
        Assert.assertEquals(linksPage.getNoContentLinkMessage(), "No Content");

        linksPage.clickMovedLink();
        Assert.assertEquals(linksPage.getMovedLinkMessage(), "Moved Permanently");

        linksPage.clickBadRequestLink();
        Assert.assertEquals(linksPage.getBadRequestLinkMessage(), "Bad Request");

        linksPage.clickUnauthorizedLink();
        Assert.assertEquals(linksPage.getUnauthorizedLinkMessage(), "Unauthorized");

        linksPage.clickForbiddenLink();
        Assert.assertEquals(linksPage.getForbiddenLinkMessage(), "Forbidden");

        linksPage.clickNotFoundLink();
        Assert.assertEquals(linksPage.getNotFoundLinkMessage(), "Not Found");
    }



    // This test method uses data from the "invalid-data-for-login" data provider to test
    // invalid login scenarios.
    @Test(priority = 2, dataProvider = "invalid-data-for-login", dataProviderClass = InvalidLoginData.class)
    public void LoginPage_InvalidUsernamePasswordValidation(String name, String pass) throws InterruptedException {

        loginPage.navigateToLoginPage();
        loginPage.enterUsername(name);
        loginPage.enterPassword(pass);
        loginPage.clickSubmitButton();

        // Assert that the displayed message is "Invalid username or password!"
        Assert.assertEquals(loginPage.getTextFromVerification(), "Invalid username or password!");
    }



    // This test method uses data from the "data-for-register-new-user" data provider to test
    // the reCAPTCHA verification during user registration.
    @Test(priority = 3, dataProvider = "data-for-register-new-user", dataProviderClass = RegisterUserData.class)
    public void RegistrationPage_RecaptchaVerification(String fname, String lname, String usrname, String pass) throws InterruptedException {

        loginPage.navigateToLoginPage();
        loginPage.clickNewUserButton();
        registerNewUser.enterFirstName(fname);
        registerNewUser.enterLastName(lname);
        registerNewUser.enterUserName(usrname);
        registerNewUser.enterPassword(pass);
        registerNewUser.clickRegisterButton();

        // Assert that the displayed message is "Please verify reCaptcha to register!"
        Assert.assertEquals(registerNewUser.getTextFromRecaptchaVerification(), "Please verify reCaptcha to register!");
    }
}
