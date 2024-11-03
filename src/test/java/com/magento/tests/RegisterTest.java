package com.magento.tests;

import com.magento.Models.User;
import com.magento.pages.HomePage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void test() {
        driver.get("https://magento.softwaretestingboard.com");

        User user = new User();
        new HomePage(driver).goToRegisterPage().registerUser(user);
        //discount code is 20poff
    }
}
