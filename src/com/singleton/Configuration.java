package com.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    // Private static instance of the singleton
    private static Configuration instance = null;
    private final Map<String,String> configs;
    // Private constructor to prevent instantiation from outside the class
    private Configuration(){
        // Initialize configuration properties
        configs = new HashMap<>();
    }
    // Public static methode to get the singleton instance.
    // Synchronized modifier is used to provide thread-safe access to shared resources.
    public static synchronized Configuration getInstance(){
        if(instance == null) instance = new Configuration();
        return new Configuration();
    }
    // Other configuration methods
    public void setProperties(String key, String value){
        // Set configuration property
        configs.put(key,value);
    }
    public String getProperty(String key){
        // Get configuration property
        return configs.get(key);
    }
}
