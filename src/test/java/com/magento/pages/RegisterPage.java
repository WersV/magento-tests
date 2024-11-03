package com.magento.pages;

import com.magento.Models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
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

    public MyAccDashboardPage registerUser(User user) {
        firstNameInput.sendKeys(user.getFirstName());
        lastNameInput.sendKeys(user.getLastName());
        emailInput.sendKeys(user.getEmail());
        passInput.sendKeys(user.getPassword());
        confirmPassInput.sendKeys(user.getPassword());
        createAccBtn.click();
        return new MyAccDashboardPage(driver);
    }
}
