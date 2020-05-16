package com.hiwijaya.springbasic.ioc;

/**
 * @author Happy Indra Wijaya
 */
public class DataSource {

    private String host;
    private String user;
    private String password;

    private ConnectionType connectionType;

    private Connection connection;


    public DataSource() { }

    public DataSource(String host) {
        this.host = host;
        System.out.println("Host: " + host);
    }

    public DataSource(ConnectionType connectionType){
        this.connectionType = connectionType;
        System.out.println("Connection type: " + connectionType.getName());
    }



    public Connection getInstance(){
        if(connection == null){
            connection = new Connection("jdbc:postgresql://127.0.0.1:5432/library");
        }
        return connection;
    }

    public Connection getConnection(){
        return new Connection(host);
    }

    public String getConnectionType(){
        return connectionType.toString();
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
