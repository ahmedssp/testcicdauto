package pag;

import com.microsoft.playwright.Page;

public class cart_page {
    public static Page page;

    public cart_page(Page page) {
        this.page = page;
    }

    public void addCart(String username ,String country , String city, String Card,String month,String year){

        page.click("a:has-text('Monitors')");
        page.click("a:has-text('Apple monitor 24')");
        page.click("a:has-text('Add to cart')");
        // Add assertion to verify item added to cart
        page.click("#cartur");
        // waitForURL to your webpage
        page.waitForURL("https://www.demoblaze.com/cart.html");
        // Wait for the button to be visible
        page.waitForSelector("button.btn.btn-success[data-toggle='modal'][data-target='#orderModal']");
        // Click the "Place Order" button
        page.click("button.btn.btn-success[data-toggle='modal'][data-target='#orderModal']");
//        page.click("button[onclick='purchaseOrder()']");
        page.fill("#name", username);
        page.fill("#country", country);
        page.fill("#city", city);
        page.fill("#card", Card);
        page.fill("#month", month);
        page.fill("#year", year);
        page.click("button[onclick='purchaseOrder()']");

    }
}
