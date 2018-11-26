package com.tws.refactoring.extract_variable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ExtractVariableTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void printPlatofromBrowser() {

        BannerRender bannnerRender = new BannerRender();
        String platform = "MAC";
        String browser = "IE";
        bannnerRender.renderBanner(platform,browser);

        String expectedText = "MAC: IE\r\n";

        assertEquals(expectedText, outContent.toString());
    }

    @Test
    public void printPrice() {

        PriceCalculator priceCalculator = new PriceCalculator();
        int quantity = 1000;
        int itemPrice = 1000;
        double price = priceCalculator.getPrice(quantity, itemPrice);

        double expectedPrice = 975100.0;

        assertEquals(expectedPrice, price,0.001);
    }
}