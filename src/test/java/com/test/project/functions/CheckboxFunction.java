package com.test.project.functions;

import com.test.project.pageobjects.CheckboxPage;
import com.test.project.pageobjects.ForgotPasswordPage;
import com.test.project.pageobjects.InputsPage;
import org.openqa.selenium.WebDriver;

public class CheckboxFunction {
    private final CheckboxPage checkboxPage;

    public CheckboxFunction(WebDriver driver) {
        checkboxPage= new CheckboxPage(driver);
    }

    public void checkboxIsNotSelectedThenClick(String email) throws Exception {
        try {
            if(checkboxPage.isCheckboxDisplayed())
            {
                System.out.println("Checkbox is displayed. Clicking on it now");
                checkboxPage.clickCheckbox();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

}
