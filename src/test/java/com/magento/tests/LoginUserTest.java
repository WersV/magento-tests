package com.magento.tests;

import com.magento.pages.HomePage;
import org.testng.annotations.Test;

public class LoginUserTest extends BaseTest{

    @Test
    public void signInTest() {
        driver.get("https://magento.softwaretestingboard.com");
        new HomePage(driver).goToSignInPage();
    }
}
