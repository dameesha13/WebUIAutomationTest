package com.test.project.functions;

import com.test.project.pageobjects.InputsPage;
import org.openqa.selenium.WebDriver;

public class InputFunction {
    private final InputsPage inputsPage;

    public InputFunction(WebDriver driver) {
        inputsPage = new InputsPage(driver);
    }

    public void inputNumber(String number) throws Exception {
        try {
            inputsPage.enterNumber(number);
            Thread.sleep(1000);
        } catch (Exception ex) {
            throw ex;
        }
    }

}
