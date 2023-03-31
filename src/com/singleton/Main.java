package com.singleton;

public class Main {
    public static void main(String[] args){
        Configuration configuration = Configuration.getInstance();

        configuration.setProperties("server.host","localhost");
        configuration.setProperties("server.port","8080");

        String host = configuration.getProperty("server.host");
        String port = configuration.getProperty("server.port");

        System.out.println("Server configuration: " + host + ":" + port);
    }
}
