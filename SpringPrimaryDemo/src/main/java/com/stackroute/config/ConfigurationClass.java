package com.stackroute.config;

import com.stackroute.domain.Employee;
import com.stackroute.domain.EmployeeRecord;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
/*
This is configuration class for configuring all the beans.
 */


@Configuration
public class ConfigurationClass {


    @Bean(name = "bean1")
    public EmployeeRecord getEmployeeRecord(){

        return new EmployeeRecord();
    }

    @Primary
    @Bean(name = "bean2")
    public EmployeeRecord getEmployeeRecord2(){

        return new EmployeeRecord(12,"FSD");
    }

    //@Primary can also be use when AutoWiring is of type By_Type
    @Bean(autowire = Autowire.BY_TYPE)
    public Employee getEmployee()
    {
        return new Employee();
    }




}
