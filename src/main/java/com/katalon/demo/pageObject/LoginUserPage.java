package com.katalon.demo.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginUserPage extends PageObject {
    By txtUser = By.id("txt-username");
    By txtPassword = By.id("txt-password");
    By btnLogin = By.id("btn-login");

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getTxtUser() {
        return txtUser;
    }

    public By getTxtPassword() {
        return txtPassword;
    }


}
