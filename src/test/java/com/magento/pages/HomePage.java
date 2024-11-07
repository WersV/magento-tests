package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[text()='Create an Account']")
    private WebElement createAccLink;

    @FindBy(xpath = "//a[contains(text(), 'Sign In')]")
    private WebElement signInLink;

    public RegisterPage goToRegisterPage() {
        createAccLink.click();
        return new RegisterPage(driver);
    }

    public SignInPage goToSignInPage() {
        signInLink.click();
        return new SignInPage(driver);
    }
}
