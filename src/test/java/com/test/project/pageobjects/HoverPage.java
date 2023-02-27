package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class HoverPage extends BaseClass {

    private final By lblHoverHeader = By.xpath("//h3[normalize-space()='Hovers']");
    private final By hoverText = By.xpath("//h5[normalize-space()='name: user1']");

    public HoverPage(WebDriver driver) {
        super(driver);
    }

    public boolean isHoverHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(lblHoverHeader).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void hoverImage() throws Exception {
        try {
            Actions builder = new Actions(driver);
            WebElement we = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
            Action perf= builder.moveToElement(we).build();
            perf.perform();
            Thread.sleep(1000);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isHoverTextDisplayed() throws Exception {
        try {
            return driver.findElement(hoverText).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

}
