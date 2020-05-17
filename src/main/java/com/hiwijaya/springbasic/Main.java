package com.hiwijaya.springbasic;

import com.hiwijaya.springbasic.ioc.Connection;
import com.hiwijaya.springbasic.ioc.CustomerRepository;
import com.hiwijaya.springbasic.ioc.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Happy Indra Wijaya
 */
public class Main {

    public static void main(String[] args) {

        // known as Spring Container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource.getConnection());

        DataSource poolSource = context.getBean("poolSource", DataSource.class);
        System.out.println(poolSource.getConnectionType());

//        Connection connection = context.getBean("connection", Connection.class);
//        System.out.println(connection.getHost());


        // component-scan based
        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);  // context.getBean("customerRepository", CustomerRepository.class);
        customerRepository.save();

    }

}
