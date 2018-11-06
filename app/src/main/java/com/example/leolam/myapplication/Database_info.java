package com.example.leolam.myapplication;


import com.example.leolam.myapplication.DatabaseClass.BuildingName;

public class Database_info {
    private static String DB_NAME = "ninerquestdb";
    private static String COLLECTION_NAME = "building_list";
    public static String API_KEY = "bN-Q98pVFkV2c3uVdiGkLF_J0nmf-Itu";

    public static String getAddressSingle (BuildingName Bname) {
                String baseURL = String.format("http://api.mlab.com/api/1/databases/%s/collections/%s", DB_NAME,COLLECTION_NAME);
            StringBuilder stringBuilder = new StringBuilder(baseURL);
            stringBuilder.append("/"+Bname.getB_Name()+"?apiKey="+API_KEY);
            return stringBuilder.toString();
    }

    public static String getAddressAPI (BuildingName Bname) {
        String baseURL = String.format("http://api.mlab.com/api/1/databases/%s/collections/%s", DB_NAME,COLLECTION_NAME);
        StringBuilder stringBuilder = new StringBuilder(baseURL);
        stringBuilder.append("?apiKey="+API_KEY);
        return stringBuilder.toString();
    }

}
