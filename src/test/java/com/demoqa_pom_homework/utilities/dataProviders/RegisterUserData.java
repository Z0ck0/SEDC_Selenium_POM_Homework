package com.demoqa_pom_homework.utilities.dataProviders;

import org.testng.annotations.DataProvider;

public class RegisterUserData {
    @DataProvider(name = "data-for-register-new-user")
    public Object[][] registerData() {
        return new Object[][]{
                {"Emma", "Johnson", "emma.johnson89", "P@ssw0rd123"} ,
                {"Liam", "Smith", "liam.smith75", "SecurePass456"} ,
                {"Olivia", "Williams", "olivia.williams22", "MySecret123!"} ,
                {"Noah", "Brown", "noah.brown33", "4YourEyesOnly"} ,
                {"Ava", "Davis", "ava.davis01", "StrongP@ss789"}
        };
    }
}
