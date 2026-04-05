package org.adnabuassignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    WebDriver driver;

    By searchIcon = By.xpath("/html/body/div/sticky-header/header/div/details-modal/details/summary/span");
    By searchField = By.xpath("/html/body/div/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/input[1]");
    By searchButton = By.xpath("/html/body/div/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/button[2]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(searchIcon).click();
        driver.findElement(searchField).sendKeys(productName);
        driver.findElement(searchButton).click();
    }
}