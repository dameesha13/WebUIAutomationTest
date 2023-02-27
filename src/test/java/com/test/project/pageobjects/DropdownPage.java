package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DropdownPage extends BaseClass {

    private final By lblDropdownHeader = By.xpath("//h3[normalize-space()='Dropdown List']");
    private final By ddSelectedValue = By.xpath("//*[@id=\"dropdown\"]/option[@selected=\"selected\"]");

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

    public boolean isDropdownSelectedValueDisplayed() throws Exception {
        try {
            return driver.findElement(ddSelectedValue).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void changeOptionFromDropdown() throws Exception {
        try {
            List<WebElement> itemsInDropdown = driver
                    .findElements(By.xpath("//*[@id=\"dropdown\"]/option"));
            int size = itemsInDropdown.size();
            int randnMumber = ThreadLocalRandom.current().nextInt(1, size);
            itemsInDropdown.get(randnMumber).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

}
