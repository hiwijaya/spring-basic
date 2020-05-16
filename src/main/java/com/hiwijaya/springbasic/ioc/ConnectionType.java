package com.hiwijaya.springbasic.ioc;

/**
 * @author Happy Indra Wijaya
 */
public enum ConnectionType {

    SINGLETON("singleton"), POOL("pool");

    private String name;

    ConnectionType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
