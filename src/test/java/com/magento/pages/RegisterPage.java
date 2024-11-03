package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "email_address")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passInput;

    @FindBy(id = "password-confirmation")
    private WebElement confirmPassInput;

    @FindBy(xpath = "//button[@title='Create an Account']")
    private WebElement createAccBtn;

    public MyAccDashboardPage registerUser() {

    }
}
