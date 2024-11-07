package com.magento.tests;

import com.magento.Models.User;
import com.magento.pages.HomePage;
import com.magento.pages.MyAccDashboardPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void test() {
        driver.get("https://magento.softwaretestingboard.com");

        User user = new User();
        MyAccDashboardPage accDashboardPage = new HomePage(driver).goToRegisterPage().registerUser(user);

        WebElement successfulRegisterInfo = accDashboardPage.getInfoAfterRegister();
        Assert.assertEquals(successfulRegisterInfo.getText(), "Thank you for registering with Main Website Store.");

        //discount code is 20poff
    }
}
