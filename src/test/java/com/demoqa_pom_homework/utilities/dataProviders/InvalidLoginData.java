package com.demoqa_pom_homework.utilities.dataProviders;

import org.testng.annotations.DataProvider;

public class InvalidLoginData {
    @DataProvider(name = "invalid-data-for-login")
    public Object[][] loginData() {
        return new Object[][]{
                {"user123", "P@ssw0rd1"} ,
                {"coolgamer", "Secure123!"} ,
                {"travelbug", "Rand0mPass"} ,
                {"codingwizard", "Code$ecret42"} ,
                {"fitnessfanatic", "GymTime#2023"}
        };
    }
}
