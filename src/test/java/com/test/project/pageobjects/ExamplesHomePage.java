package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExamplesHomePage extends BaseClass {

    //https://the-internet.herokuapp.com/
    private final By lblWelcomeHeader = By.xpath("//h1[normalize-space()='Welcome to the-internet']");
    private final By lblAvailableExamplesHeader = By.xpath("//h2[normalize-space()='Available Examples']");
    private final By linkCheckboxes = By.xpath("//a[normalize-space()='Checkboxes']");
    private final By linkDropdown = By.xpath("//a[normalize-space()='Dropdown']");
    private final By linkForgotPW = By.xpath("//a[normalize-space()='Forgot Password']");
    private final By linkInput = By.xpath("//a[normalize-space()='Inputs']");
    private final By linkAddRemoveElements = By.xpath("//a[normalize-space()='Add/Remove Elements']");


    public ExamplesHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isWelcomeHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(lblWelcomeHeader).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isAvailableExampleHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(lblAvailableExamplesHeader).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickCheckboxes() throws Exception {
        try {
            driver.findElement(linkCheckboxes).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickDropdown() throws Exception {
        try {
            driver.findElement(linkDropdown).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickForgotPassword() throws Exception {
        try {
            driver.findElement(linkForgotPW).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickInputs() throws Exception {
        try {
            driver.findElement(linkInput).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAddRemoveElements() throws Exception {
        try {
            driver.findElement(linkAddRemoveElements).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

}
