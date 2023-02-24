package com.test.project.utils;



import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDataHelper extends TestDataReader {

    private final TestDataReader testDataReader;

    public TestDataHelper() throws Exception {
        testDataReader = new TestDataReader();
    }

    public String readTestDataFile(String fileName) throws FileNotFoundException {
        try {
            return new Scanner(new File(textFilesPath, fileName)).useDelimiter("\\Z").next();
        } catch (Exception ex) {
            throw ex;
        }
    }

   public JSONObject getLASSJSONTestData(String DataName) throws Exception {

        try {
            return testDataReader.getJSONTestData("testData", DataName);

        } catch (Exception e) {
            throw e;
        }
    }
}
