package com.hiwijaya.springbasic.ioc;

/**
 * @author Happy Indra Wijaya
 */
public class Connection {

    private String host;

    public Connection(String host){
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void connect(){
        System.out.println("Database connected.");
    }

    public void disconnect(){
        System.out.println("Database disconnected.");
    }

    @Override
    public String toString() {
        return "Connection(" + host + ")";
    }
}
