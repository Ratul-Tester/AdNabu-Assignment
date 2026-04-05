package org.adnabuassignment.tests;

import org.adnabuassignment.base.BaseTest;
import org.adnabuassignment.pages.HomePage;
import org.adnabuassignment.pages.LoginPage;
import org.adnabuassignment.pages.ProductPage;
import org.testng.annotations.*;

public class SearchAddToCartTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;

    @BeforeMethod
    public void startTest() {
        setup();
        // Initialize page objects
        loginPage = new LoginPage(driver, wait);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver, wait);

        // Unlock store before executing test
        loginPage.loginToStore("AdNabuQA");
    }


    @Test
    public void searchAndAddProductToCart() {

        // Search product
        homePage.searchProduct("Skate Board");

        // Select first product
        productPage.selectTheProduct();

        // Add product to cart
        productPage.addToCart();

        // Again Search same product
        homePage.searchProduct("Skate Board");

        // Select first product
        productPage.selectTheProduct();

        // Add product to cart
        productPage.addToCart();

        }

    @AfterTest
    public void endTest() {
        tearDown();
    }
}