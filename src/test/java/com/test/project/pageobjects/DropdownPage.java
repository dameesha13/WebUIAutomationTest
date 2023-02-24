package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BaseClass {

    //https://the-internet.herokuapp.com/dropdown
    private final By lblDropdownHeader = By.xpath("//h3[normalize-space()='Dropdown List']");
    private final By ddDropdown = By.xpath("//select[@id='dropdown']");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDropdownHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(lblDropdownHeader).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public String changeOptionFromDropdown() throws Exception {
        try {
            Select se = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
            se.selectByValue("2");
            String selectedValue = se.getFirstSelectedOption().getText();
            return selectedValue;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getSelectedValueFromDropdown() throws Exception {
        try {
            Select se = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
            se.selectByValue("2");
        } catch (Exception ex) {
            throw ex;
        }
    }

}
