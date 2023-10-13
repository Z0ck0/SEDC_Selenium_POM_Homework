package com.demoqa_pom_homework.tests;

import com.demoqa_pom_homework.utilities.helpers.DriverBase;
import com.demoqa_pom_homework.pages.LinksPage;
import com.demoqa_pom_homework.pages.LoginPage;
import com.demoqa_pom_homework.pages.RegisterNewUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTestConfiguration {

    private WebDriver driver;
    private WebDriverWait wait;

    DriverBase driverBase;

    private String browserName = "chrome";

    //Page Objects
    public LinksPage linksPage;
    public LoginPage loginPage;
    public RegisterNewUser registerNewUser;



    @BeforeMethod
    public void setUp() {
        driverBase = new DriverBase();
        driver = driverBase.initiateDriver(browserName);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Initialize Page Objects
        linksPage = new LinksPage(driver, wait);
        loginPage = new LoginPage(driver,wait);
        registerNewUser = new RegisterNewUser(driver, wait);

        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}