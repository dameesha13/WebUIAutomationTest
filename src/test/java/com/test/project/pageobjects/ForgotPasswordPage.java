package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BaseClass {

    private final By lblForgotPasswordHeader = By.xpath("//h2[normalize-space()='Forgot Password']");
    private final By txtEmail = By.id("email");
    private final By btnRetrievePassword = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public boolean isForgotPWHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(lblForgotPasswordHeader).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterEmail(String email) throws Exception {
        try {
            driver.findElement(txtEmail).sendKeys(email);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickRetrievePassword() throws Exception {
        try {
            driver.findElement(btnRetrievePassword).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

}
