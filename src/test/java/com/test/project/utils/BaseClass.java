package com.test.project.utils;

import org.openqa.selenium.WebDriver;

import java.util.TreeMap;

public class BaseClass {

    public static WebDriver driver;
    public static TreeMap<String, String> testData = null;

    public BaseClass(WebDriver driver){

        BaseClass.driver=driver;
    }

}
