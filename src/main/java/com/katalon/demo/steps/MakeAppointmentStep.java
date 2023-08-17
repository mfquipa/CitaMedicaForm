package com.katalon.demo.steps;

import com.katalon.demo.pageObject.MakeAppointmetPage;
import com.katalon.demo.utils.EsperaImplicita;
import com.katalon.demo.utils.Excel;
import com.katalon.demo.utils.Random;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MakeAppointmentStep {

    MakeAppointmetPage makeAppointmetPage=new MakeAppointmetPage();

    EsperaImplicita wait = new EsperaImplicita();

    @Step ("List Facility")
    public void clickFacility(){
        wait.esperaImplicita(5);
        List<WebElement> place= makeAppointmetPage.getDriver().findElements(makeAppointmetPage.getTxtFacility());
        place.get(Random.IndexRandom.numeroAleatorioEnRango(0, place.size())).click();
    }

    @Step
    public void clickProgram(){
        wait.esperaImplicita(5);
        List<WebElement> radio= makeAppointmetPage.getDriver().findElements(makeAppointmetPage.getInputProgram());
        radio.get(Random.IndexRandom.numeroAleatorioEnRango(0, radio.size())).click();
    }

    @Step
    public void chooseDate() throws IOException {
        wait.esperaImplicita(5);
        ArrayList<Map<String, String>> data= Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx","Hoja1");
        makeAppointmetPage.getDriver().findElement(makeAppointmetPage.getInputDate()).click();
        makeAppointmetPage.getDriver().findElement(makeAppointmetPage.getInputDate()).sendKeys(String.valueOf(data.get(0).get("Date")));
    }

    @Step
    public void btnBook(){
        makeAppointmetPage.getDriver().findElement(makeAppointmetPage.getBtnBook()).click();
    }


}
