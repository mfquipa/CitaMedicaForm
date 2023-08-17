package com.katalon.demo.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MakeAppointmetPage extends PageObject {
    By inputFacility = By.xpath("//option [@value]");

    By inputProgram = By.xpath("//input[@name='programs']");
    By inputDate = By.xpath("//input[@id='txt_visit_date']");
    By btnBook = By.xpath("//button[@id='btn-book-appointment']");

    public By getTxtFacility() {
        return inputFacility;
    }
    public By getInputProgram() {
        return inputProgram;
    }

    public By getInputDate() {
        return inputDate;
    }

    public By getBtnBook() {
        return btnBook;
    }
}
