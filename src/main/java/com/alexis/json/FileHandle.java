package com.alexis.json;

import java.io.InputStream;

/**
 * Created by ce6915gp on 9/13/2018.
 */
public class FileHandle {

    public static InputStream inputStreamFromFile(String path){

        try {

            InputStream inputStream = FileHandle.class.getResourceAsStream(path);
            return inputStream;

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
