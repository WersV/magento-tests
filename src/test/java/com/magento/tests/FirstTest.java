package com.magento.tests;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

    @Test
    public void test() {
        driver.get("https://magento.softwaretestingboard.com");

        //discount code is 20poff
    }
}
