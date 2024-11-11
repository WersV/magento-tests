package com.magento.tests;

import com.magento.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserTest extends BaseTest{


    @Test
    public void signInUser() {
        driver.get("https://magento.softwaretestingboard.com");
        HomePage homePage = new HomePage(driver).goToSignInPage().logIn("11test@email.com", "SecretPassword1");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.attributeContains(homePage.getWelcomeEl(),"textContent", "Welcome"));
        Assert.assertTrue(homePage.getWelcomeEl().getAttribute("textContent").contains("Welcome"));
    }

    @Test(dependsOnMethods = {"signInUser"})
    public void signOutUser() {
        HomePage homePage = new HomePage(driver).signOutUser();
        Assert.assertTrue(homePage.getSignInEl().isDisplayed());
    }
}
