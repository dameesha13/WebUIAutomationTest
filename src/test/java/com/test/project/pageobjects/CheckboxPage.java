package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage extends BaseClass {

    //https://the-internet.herokuapp.com/checkboxes
    private final By lblCheckboxesHeader = By.xpath(" //h3[normalize-space()='Checkboxes']");
    private final By chkCheckboxOne = By.xpath("(//input[@type='checkbox'])[1]");
    private final By chkCheckboxTwo = By.xpath("(//input[@type='checkbox'])[2]");
    private final By lblCheckboxOne = By.xpath("//*[@id=\"checkboxes\" and text()=' checkbox 1']");
    private final By getLblCheckboxTwo = By.xpath("//*[@id=\"checkboxes\"]/text()[2]");

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCheckboxHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(lblCheckboxesHeader).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean clickCheckboxOne() throws Exception {
        try {
            return driver.findElement(chkCheckboxOne).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean clickCheckboxTwo() throws Exception {
        try {
            return driver.findElement(chkCheckboxTwo).isSelected();
        } catch (Exception ex) {
            throw ex;
        }
    }

}
