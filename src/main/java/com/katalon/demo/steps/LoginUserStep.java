package com.katalon.demo.steps;

import com.katalon.demo.pageObject.LoginUserPage;
import com.katalon.demo.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class LoginUserStep {
    LoginUserPage loginUserPage = new LoginUserPage();

    @Step
    public void sendUser() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Hoja1");
        loginUserPage.getDriver().findElement(loginUserPage.getTxtUser()).clear();
        loginUserPage.getDriver().findElement(loginUserPage.getTxtUser()).sendKeys(data.get(0).get("Username"));
    }

    @Step
    public void sendPassword() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Hoja1");
        loginUserPage.getDriver().findElement(loginUserPage.getTxtPassword()).clear();
        loginUserPage.getDriver().findElement(loginUserPage.getTxtPassword()).sendKeys(data.get(0).get("Password"));
    }

    @Step
    public void clickLogin() {
        loginUserPage.getDriver().findElement(loginUserPage.getBtnLogin()).click();
    }

}

