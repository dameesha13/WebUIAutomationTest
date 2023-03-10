package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage extends BaseClass {
    private final By lblAddRemoveHeader = By.xpath("//h3[normalize-space()='Add/Remove Elements']");
    private final By btnAddElements = By.xpath("//button[normalize-space()='Add Element']");
    private final By btnRemoveElements = By.xpath("//*[@class=\"added-manually\" and text()='Delete']");

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAddRemoveElementsHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(lblAddRemoveHeader).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAddElement() throws Exception {
        try {
            driver.findElement(btnAddElements).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickDeleteElement() throws Exception {
        try {
            driver.findElement(btnRemoveElements).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

}
