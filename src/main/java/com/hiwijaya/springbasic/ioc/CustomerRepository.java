package com.hiwijaya.springbasic.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Happy Indra Wijaya
 */
@Component("customerRepository")
public class CustomerRepository {

    @Autowired @Qualifier("poolConnection")
    private Connection connection;

    // auto inject from bean "connection" (beans.xml)
    public CustomerRepository(Connection connection){
        this.connection = connection;
    }

    public void save(){
        connection.connect();
        System.out.println(connection.getHost());
        System.out.println("Saving customer to database.");
    }

}
