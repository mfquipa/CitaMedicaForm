package com.katalon.demo.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmationPage extends PageObject {

    By btnConfirm = By.xpath("//a[@class='btn btn-default']");

    public By getBtnConfirm() {
        return btnConfirm;
    }
}
