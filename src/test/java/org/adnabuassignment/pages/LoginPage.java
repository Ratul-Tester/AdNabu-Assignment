package org.adnabuassignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    // URL
    String loginURL = "https://adnabu-store-assignment1.myshopify.com/password";

    // Locators
    By passwordField = By.id("password");
    By enterButton = By.xpath("//button[@type='submit']");

    // Constructor
    public LoginPage(WebDriver driver, WebDriverWait wait) {

        this.driver = driver;
        this.wait = wait;
    }

    // Open login page
    public void openLoginPage() {

        driver.get(loginURL);
    }

    // Enter password
    public void enterPassword(String password) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(passwordField)
        ).sendKeys("AdNabuQA");
    }

    // Click enter button
    public void clickEnterButton() {

        wait.until(
                ExpectedConditions.elementToBeClickable(enterButton)
        ).click();
    }

    // Complete login action
    public void loginToStore(String password) {

        openLoginPage();

        enterPassword(password);

        clickEnterButton();
    }

}
