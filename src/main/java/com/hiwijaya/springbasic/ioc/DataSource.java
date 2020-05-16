package com.hiwijaya.springbasic.ioc;

/**
 * @author Happy Indra Wijaya
 */
public class DataSource {

    private String host;
    private String user;
    private String password;

    private static Connection connection;

    public DataSource() { }

    public DataSource(int port) {
        System.out.println("Run on port: " + port);
    }

    public DataSource(ConnectionType type){
        System.out.println("Connection type: " + type.getName());
    }

    public static Connection getInstance(){
        if(connection == null){
            connection = new Connection("localhost");   // default host
        }
        return connection;
    }


    public String getConnection(){
        return "Database connected to " + host;
    }


    public void setHost(String host) {
        this.host = host;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
