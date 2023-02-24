package com.test.project.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

    static WebDriver driver;

    public static WebDriver setUp() {

        //set driver location
        System.setProperty("webdriver.chrome.driver", "/Users/dameesha/Downloads/driver/chromedriver");

        //Initialize the webDriver
        driver = new ChromeDriver();

        //Pass the url
        driver.get("https://the-internet.herokuapp.com/");

        //Maximize the Window
        driver.manage().window().maximize();

        return driver;

    }

}
