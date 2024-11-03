package com.magento.tests;

import com.magento.pages.HomePage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void test() {
        driver.get("https://magento.softwaretestingboard.com");

        new HomePage(driver).goToRegisterPage();
        //discount code is 20poff
    }
}
