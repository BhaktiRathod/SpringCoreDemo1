package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Spring IOC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");

        Employee emp = (Employee) context.getBean("empbean1");

        System.out.println(emp);


    }
}
