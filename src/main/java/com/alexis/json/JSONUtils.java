package com.alexis.json;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by ce6915gp on 9/13/2018.
 */
public class JSONUtils {

    public static String getJSONStringFromFile(String path) {
        Scanner scanner;
        InputStream in = FileHandle.inputStreamFromFile(path);
        scanner = new Scanner(in);
        String json = scanner.useDelimiter("\\Z").next();
        scanner.close();
        //in.close();
        return json;
    }

    public static JSONObject getJSONObjectFromFile(String path){
        return new JSONObject();
    }
}
