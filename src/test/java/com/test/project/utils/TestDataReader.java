package com.test.project.utils;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.util.Map;

public class TestDataReader {

    public String textFilesPath;

    public String lassData;

    private File file;
    protected Map<String, JSONObject> value;

    private final JSONParser parser;
    public TestDataReader() throws Exception {
        try {
            Config.setConfigFilePath("/config/config.properties");
            lassData = Config.getProperty("test.lass.data.path");
            parser = new JSONParser();
        } catch (Exception e) {
            throw e;
        }
    }

    public JSONObject getJSONTestData(String filename, String DataName) throws Exception {

        try {
            file = new File(lassData, filename);
            value = (Map<String, JSONObject>) parser.parse(new FileReader(file));
            return value.get(DataName);

        } catch (Exception e) {
            throw e;
        }
    }

}
