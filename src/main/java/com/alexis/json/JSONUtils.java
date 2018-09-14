package com.alexis.json;

import com.alexis.json.org.json.JSONObject;

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
        return new JSONObject(getJSONStringFromFile(path));
    }

    public static boolean objectExists(JSONObject jsonObject, String key){
        Object o;
        try{
            o = jsonObject.get(key);
        }catch (Exception e){
            return false;
        }
        return o!= null;
    }
}
