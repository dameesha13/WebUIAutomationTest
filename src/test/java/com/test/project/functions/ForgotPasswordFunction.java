package com.test.project.functions;

import com.test.project.pageobjects.ForgotPasswordPage;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordFunction {
    private final ForgotPasswordPage forgotPasswordPage;

    public ForgotPasswordFunction(WebDriver driver) {
        forgotPasswordPage = new ForgotPasswordPage(driver);
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
}
