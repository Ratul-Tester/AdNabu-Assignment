package org.adnabuassignment.tests;

import org.adnabuassignment.base.BaseTest;
import org.adnabuassignment.pages.HomePage;
import org.adnabuassignment.pages.ProductPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SearchAddToCartTest extends BaseTest {

    HomePage homePage;
    ProductPage productPage;

    @BeforeTest
    public void startTest() {
        setup();
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver, wait);
    }

    @Test
    public void searchAndAddProductToCart() {

        homePage.searchProduct("Shoes");

        productPage.selectFirstProduct();

        productPage.addToCart();

        assertTrue(productPage.isCartUpdated());
    }

    @AfterTest
    public void endTest() {
        tearDown();
    }
}