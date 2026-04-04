package org.adnabuassignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By firstProduct = By.cssSelector(".product-item");
    By addToCartButton = By.name("add");
    By cartCount = By.className("cart-count");

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void selectFirstProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }

    public boolean isCartUpdated() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cartCount)).isDisplayed();
    }
}