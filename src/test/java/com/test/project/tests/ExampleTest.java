package com.test.project.tests;

import com.test.project.functions.ForgotPasswordFunction;
import com.test.project.functions.InputFunction;
import com.test.project.pageobjects.*;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static com.test.project.utils.DriverSetup.setUp;

public class ExampleTest {

    static Logger log = Logger.getLogger(ExampleTest.class);
    WebDriver driver;
    private ForgotPasswordFunction forgotPasswordFunction;
    private InputFunction inputFunction;
    private CheckboxPage checkboxPage;
    private DropdownPage dropdownPage;
    private ForgotPasswordPage forgotPasswordPage;
    private ExamplesHomePage examplesHomePage;
    private InputsPage inputsPage;
    private HoverPage hoverPage;
    private AddRemoveElementsPage addRemoveElementsPage;


    /* Before Method*/
    @BeforeMethod
    public void beforeMethod() throws Exception {
        driver = setUp();
        forgotPasswordFunction = new ForgotPasswordFunction(driver);
        inputFunction = new InputFunction(driver);
        checkboxPage = new CheckboxPage(driver);
        examplesHomePage = new ExamplesHomePage(driver);
        dropdownPage = new DropdownPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
        inputsPage = new InputsPage(driver);
        hoverPage = new HoverPage(driver);
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
    }

    /* To Verify the Checkbox functionality  */
    @Test
    public void verifyCheckBoxFunctionality() throws Exception {
        try {
            examplesHomePage.clickCheckboxes();
            checkboxPage.isCheckboxHeaderDisplayed();
            Thread.sleep(2000);
            Assert.assertTrue(checkboxPage.isSelectedCheckbox());
        } catch (Exception e) {
            log.info("verifyCheckBoxFunctionality : FAIL");
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("c://FailedCheckboxTest.png"));
            throw e;
        }
    }

    /* To Verify the Dropdown functionality  */
    @Test
    public void verifyDropdownFunctionality() throws Exception {
        try {
            examplesHomePage.clickDropdown();
            dropdownPage.isDropdownHeaderDisplayed();
            dropdownPage.changeOptionFromDropdown();
            Thread.sleep(2000);
            Assert.assertTrue(dropdownPage.isDropdownSelectedValueDisplayed());
        } catch (Exception e) {
            log.info("verifyDropdownFunctionality : FAIL");
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("c://FailedDropdownTest.png"));
            throw e;
        }
    }

    /* To Verify the Forgot password functionality  */
    @Test
    public void verifyForgotPasswordFunctionality() throws Exception {
        try {
            examplesHomePage.clickForgotPassword();
            forgotPasswordPage.isForgotPWHeaderDisplayed();
            Thread.sleep(2000);
            forgotPasswordFunction.forgotPassword("abc@gmail.com");
        } catch (Exception e) {
            log.info("verifyForgotPasswordFunctionality : FAIL");
            throw e;
        }
    }

    /* To Verify the Inputs functionality  */
    @Test
    public void verifyInputsFunctionality() throws Exception {
        try {
            examplesHomePage.clickInputs();
            inputsPage.isInputHeaderDisplayed();
            Thread.sleep(2000);
            inputFunction.inputNumber("13");
        } catch (Exception e) {
            log.info("verifyInputsFunctionality : FAIL");
            throw e;
        }
    }

    /* To Verify the Add/Remove elements functionality  */
    @Test
    public void verifyAddRemoveElementsFunctionality() throws Exception {
        try {
            examplesHomePage.clickAddRemoveElements();
            addRemoveElementsPage.isAddRemoveElementsHeaderDisplayed();
            addRemoveElementsPage.clickAddElement();
            Thread.sleep(2000);
            addRemoveElementsPage.clickDeleteElement();
            Thread.sleep(2000);
        } catch (Exception e) {
            log.info("verifyAddRemoveElementsFunctionality : FAIL");
            throw e;
        }
    }

    /* To Verify the Hover functionality  */
    @Test
    public void verifyHoverFunctionality() throws Exception {
        try {
            examplesHomePage.clickHovers();
            hoverPage.isHoverHeaderDisplayed();
            hoverPage.hoverImage();
            Thread.sleep(2000);
            Assert.assertTrue(hoverPage.isHoverTextDisplayed());
        } catch (Exception e) {
            log.info("verifyHoverFunctionality : FAIL");
            throw e;
        }
    }

    /* After Method*/
    @AfterMethod
    public void afterTest() {
        driver.close();
    }
}
