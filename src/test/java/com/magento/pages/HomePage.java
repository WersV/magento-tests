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

    @FindBy(xpath = "//li[@class='greet welcome']//span")
    private WebElement welcomeSpan;

    @FindBy(xpath = "//button[@class='action switch']")
    private WebElement optionsBtn;

    @FindBy(xpath = "//a[contains(text(), 'Sign Out')]")
    private WebElement signOutLink;

    public RegisterPage goToRegisterPage() {
        createAccLink.click();
        return new RegisterPage(driver);
    }

    public SignInPage goToSignInPage() {
        signInLink.click();
        return new SignInPage(driver);
    }

    public WebElement getWelcomeEl() {
        return welcomeSpan;
    }

    public WebElement getSignInEl() {
        return signInLink;
    }

    public HomePage signOutUser() {
        optionsBtn.click();
        signOutLink.click();
        return this;
    }
}
