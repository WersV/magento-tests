package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccDashboardPage {

    public MyAccDashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
