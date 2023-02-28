package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputsPage extends BaseClass {
    private final By lblInputsHeader = By.xpath("//h3[normalize-space()='Inputs']");
    private final By lblNumber = By.xpath("//p[normalize-space()='Number']");
    private final By txtNumber = By.xpath("//input[@type='number']");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInputHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(lblInputsHeader).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterNumber(String number) throws Exception {
        try {
            driver.findElement(txtNumber).sendKeys(number);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isNumberLabelDisplayed() throws Exception {
        try {
            return driver.findElement(lblNumber).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

}
