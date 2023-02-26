package com.test.project.tests;

import com.test.project.functions.ForgotPasswordFunction;
import com.test.project.pageobjects.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.test.project.utils.DriverSetup.setUp;

public class ExampleTest {

    static Logger log = Logger.getLogger(ExampleTest.class);
    WebDriver driver;
    private ForgotPasswordFunction forgotPasswordFunction;
    private CheckboxPage checkboxPage;
    private DropdownPage dropdownPage;
    private ForgotPasswordPage forgotPasswordPage;
    private ExamplesHomePage examplesHomePage;
    private InputsPage inputsPage;
    private AddRemoveElementsPage addRemoveElementsPage;


    /* Before Method*/
    @BeforeMethod
    public void beforeMethod() throws Exception {
        driver = setUp();
        forgotPasswordFunction = new ForgotPasswordFunction(driver);
        checkboxPage = new CheckboxPage(driver);
        examplesHomePage = new ExamplesHomePage(driver);
        dropdownPage = new DropdownPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
        inputsPage = new InputsPage(driver);
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
    }

    /* Req1: To Verify the login and logout  */
    @Test
    public void verifyCheckBoxFunctionality() throws Exception {
        try {
            examplesHomePage.clickCheckboxes();
            checkboxPage.isCheckboxHeaderDisplayed();
            Thread.sleep(1000);
            Assert.assertTrue(checkboxPage.clickCheckboxTwo());
        } catch (Exception e) {
            log.info("verifyCheckBoxFunctionality : FAIL");
            throw e;
        }
    }

    @Test
    public void verifyDropdownFunctionality() throws Exception {
        try {
            examplesHomePage.clickDropdown();
            dropdownPage.isDropdownHeaderDisplayed();
            Thread.sleep(1000);
            dropdownPage.changeOptionFromDropdown();//need to assert selected value
        } catch (Exception e) {
            log.info("verifyCheckBoxFunctionality : FAIL");
            throw e;
        }
    }

    @Test
    public void verifyForgotPasswordFunctionality() throws Exception {
        try {
            examplesHomePage.clickForgotPassword();
            forgotPasswordPage.isForgotPWDisplayed();
            forgotPasswordFunction.forgotPassword("abc@gmail.com");
        } catch (Exception e) {
            log.info("verifyCheckBoxFunctionality : FAIL");
            throw e;
        }
    }

    @Test
    public void verifyInputsFunctionality() throws Exception {
        try {
            examplesHomePage.clickInputs();
            inputsPage.isInputHeaderDisplayed();
            Thread.sleep(1000);
            forgotPasswordFunction.inputNumber("13");
        } catch (Exception e) {
            log.info("verifyCheckBoxFunctionality : FAIL");
            throw e;
        }
    }

    @Test
    public void verifyAddRemoveElementsFunctionality() throws Exception {
        try {
            examplesHomePage.clickAddRemoveElements();
            addRemoveElementsPage.isCheckboxHeaderDisplayed();
            Thread.sleep(1000);
            addRemoveElementsPage.clickAddElement();
            addRemoveElementsPage.clickDeleteElement();
        } catch (Exception e) {
            log.info("verifyCheckBoxFunctionality : FAIL");
            throw e;
        }
    }

    /* After Method*/
    @AfterMethod
    public void afterTest() {
        driver.close();
    }
}
