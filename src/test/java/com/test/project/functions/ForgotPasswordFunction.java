package com.test.project.functions;

import com.test.project.pageobjects.ForgotPasswordPage;
import com.test.project.pageobjects.InputsPage;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordFunction {
    private final ForgotPasswordPage forgotPasswordPage;
    private final InputsPage inputsPage;

    public ForgotPasswordFunction(WebDriver driver) {
        forgotPasswordPage= new ForgotPasswordPage(driver);
        inputsPage = new InputsPage(driver);
    }

    public void forgotPassword(String email) throws Exception {
        try {
            forgotPasswordPage.enterEmail(email);
            Thread.sleep(1000);
            forgotPasswordPage.clickRetrievePassword();
        } catch (Exception ex) {
            throw ex;
        }
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
