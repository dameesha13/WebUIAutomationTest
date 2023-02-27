package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CheckboxPage extends BaseClass {

    private final By lblCheckboxesHeader = By.xpath(" //h3[normalize-space()='Checkboxes']");
    private final By chkCheckboxOneOrTwo = By.xpath("(//input[@type='checkbox'])");
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

    public boolean isCheckboxDisplayed() throws Exception {
        try {
            return driver.findElement(chkCheckboxOneOrTwo).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

   public void clickCheckbox() throws Exception {
        try {
            driver.findElement(chkCheckboxOneOrTwo).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isSelectedCheckbox() throws Exception {
        try {
            return driver.findElement(chkCheckboxTwo).isSelected();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickRandomCheckbox() throws Exception {
        try {
            List<WebElement> checkboxes = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
            int size = checkboxes.size();
            int randomNumber = ThreadLocalRandom.current().nextInt(0, size);
            if(!checkboxes.get(randomNumber).isSelected())
            {
                checkboxes.get(randomNumber).click();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

}
