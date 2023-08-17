package com.katalon.demo.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject{

    By btnLogin = By.id("btn-make-appointment");
    public By getBtnLogin() {
        return btnLogin;
    }


}
