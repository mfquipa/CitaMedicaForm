package com.katalon.demo.steps;

import com.katalon.demo.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;


public class OpenSteps {
    LoginPage loginPage = new LoginPage();

    @Step("User open the browser")
    public void openBrowser(){
        loginPage.openUrl("https://katalon-demo-cura.herokuapp.com/");
    }
    @Step
    public void clickMake(){ loginPage.getDriver().findElement(loginPage.getBtnLogin()).click(); }
}
