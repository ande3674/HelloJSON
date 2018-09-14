package com.alexis.json;

import com.alexis.json.org.json.*;

public class Main {

    public static void main(String[] args) {
        JSONObject obj = JSONUtils.getJSONObjectFromFile("assets/obj.json");
         String[] names = JSONObject.getNames(obj);

         for (String s : names) {
             System.out.println(s + " : " + obj.get(s));
         }

        System.out.println("\n");

         JSONArray ja = obj.getJSONArray("Array");
         for (int i = 0 ; i < ja.length(); i++){
             System.out.println(ja.get(i));
         }

    }
}
