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

        Connection connection = context.getBean("connection", Connection.class);
        connection.conect();


        // component-scan based
        CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
//        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
        customerRepository.save();

    }

}
