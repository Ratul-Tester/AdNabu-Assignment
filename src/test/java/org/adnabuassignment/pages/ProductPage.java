package org.adnabuassignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By selectProduct = By.xpath("/html/body/main/section/div/div[2]/div/div/ul/li[1]/div/div/div[2]/div[1]/h3/a");
    By addToCartButton = By.xpath("/html/body/main/section[1]/section/div/div[2]/product-info/div[4]/product-form/form/div/button");
    By closingCartButton = By.xpath("/html/body/cart-drawer/div/div[2]/div[1]/button");

    public ProductPage(WebDriver driver, WebDriverWait wait) {

        this.driver = driver;
        this.wait = wait;
    }

    public void selectTheProduct() {

        wait.until(ExpectedConditions.elementToBeClickable(selectProduct)).click();
    }

    public void addToCart() {

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(closingCartButton)).click();
    }


}