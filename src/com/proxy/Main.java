package com.proxy;

import com.proxy.internets.Internet;
import com.proxy.internets.InternetProxy;

public class Main {
    public static void main(String[] args){
        Internet internet = new InternetProxy();
        try{
            internet.connectTo("google.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
