package com.proxy.internets;

public class InternetProxy implements Internet{
    private Internet internet = new RealInternet();
    @Override
    public void connectTo(String serverHost) throws Exception {
        if(!isAllowed(serverHost)) throw new Exception("Access Denied");

        internet.connectTo(serverHost);
    }
    private boolean isAllowed(String serverHost){
        // Check if user is allowed to access serverHost
        return true;
    }
}
