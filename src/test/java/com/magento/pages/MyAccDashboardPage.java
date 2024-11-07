package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccDashboardPage {

    @FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
    private WebElement registerInfo;

    public MyAccDashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getInfoAfterRegister() {
        return registerInfo;
    }
}
