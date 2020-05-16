package com.hiwijaya.springbasic.ioc;

/**
 * @author Happy Indra Wijaya
 */
public class Connection {

    private String host;

//    public Connection() {
//
//    }

    public Connection(String host){
        this.host = host;
    }

    public void conect(){
        System.out.println("Connected by singleton object to: " + host);
    }

}
