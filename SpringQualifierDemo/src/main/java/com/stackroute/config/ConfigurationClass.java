package com.stackroute.config;

import com.stackroute.domain.Employee;
import com.stackroute.domain.EmployeeRecord;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
/*
This is Configuration class as beans are declared over here
 */

@Configuration
public class ConfigurationClass {

   // one way of doing by declaring name of the bean another way by adding @Qualifier annotation

    @Bean(name = "bean1")
    public EmployeeRecord getEmployeeRecord(){

        return new EmployeeRecord();
    }

    @Bean(name = "bean2")
    public EmployeeRecord getEmployeeRecord2(){

        return new EmployeeRecord(12,"javaaaa");
    }

    @Bean
    public Employee getEmployee()
    {
        return new Employee();
    }



}
