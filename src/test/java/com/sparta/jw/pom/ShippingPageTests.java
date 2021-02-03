package com.sparta.jw.pom;

import com.sparta.jw.pom.pages.ShippingPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShippingPageTests {
    static WebDriver webDriver;
    private ShippingPage shippingPage;

    @BeforeEach
    public void setup() {
        webDriver = new ChromeDriver();
        shippingPage = new ShippingPage(webDriver);
    }

    @Test
    @DisplayName("Test with POM")
    void commentsLinkTestWithPOM() {
        shippingPage.confirmCheckbox();
        shippingPage.proceedToCheckout();
        System.out.println(shippingPage.getUrl());
    }
}