package com.stackroute.simplebeandemo;

import com.stackroute.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * In this demo we are using Application context as the Spring IOC container
 * which is creating the employee objects from the employeeBean.xml file.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");

        Employee emp = (Employee) context.getBean("empbean1");

        System.out.println(emp);

        Employee emp1 = (Employee) context.getBean("empbean3");

        System.out.println(emp1);


    }
}
