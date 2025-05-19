package pag;

import com.microsoft.playwright.Page;

public class homepage {
   public static Page page;

    public homepage(Page page) {
        this.page = page;
    }

    public cart_page login(String username, String password) {
        String loginButtonSelector = "#login2";
        String usernameFieldSelector = "#loginusername";
        String passwordFieldSelector = "#loginpassword";
        String loginSubmitButtonSelector = "button[onclick='logIn()']";

        page.click(loginButtonSelector);
        page.fill(usernameFieldSelector, username);
        page.fill(passwordFieldSelector, password);
        page.click(loginSubmitButtonSelector);

        return new cart_page(page);
    }

    public void registration(String username, String password) {
        String registrationButtonSelector = "#signin2";
        String usernameFieldSelector = "#sign-username";
        String passwordFieldSelector = "#sign-password";
        String registrationSubmitButtonSelector = "button[onclick='register()']";

        page.click(registrationButtonSelector);
        page.fill(usernameFieldSelector, username);
        page.fill(passwordFieldSelector, password);
        page.click(registrationSubmitButtonSelector);
    }}
