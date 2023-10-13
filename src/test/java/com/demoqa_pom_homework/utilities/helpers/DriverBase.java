package com.demoqa_pom_homework.utilities.helpers;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DriverBase {

    private WebDriver driver;
    private ChromeOptions options;
    private FirefoxOptions firefoxOptions;

    public WebDriver initiateDriver(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            options = new ChromeOptions();
            options.addArguments( "--start-maximized", "--disable-popup-blocking", "--incognito");
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--start-maximized", "--disable-popup-blocking");
            driver = new FirefoxDriver(firefoxOptions);

        } else if (browserName.equalsIgnoreCase("edge")) {

        } else {
            System.out.println("Invalid browser name provided");
        }
        return driver;
    }
}
