package com.hiwijaya.springbasic.ioc;

import org.springframework.stereotype.Component;

/**
 * @author Happy Indra Wijaya
 */
@Component("customerRepository")
public class CustomerRepository {

    private Connection connection;

    // auto inject from bean "connection" (beans.xml)
    public CustomerRepository(Connection connection){
        this.connection = connection;
    }

    public void save(){
        connection.connect();
        System.out.println("Saving customer to database.");
    }


}
