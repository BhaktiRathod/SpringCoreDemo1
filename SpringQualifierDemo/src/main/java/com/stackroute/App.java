package com.stackroute;

import com.stackroute.config.ConfigurationClass;
import com.stackroute.domain.Employee;
import com.stackroute.domain.EmployeeRecord;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * In this code we are Creating object of ApplicationContext from the class AnnotationConfigApplicationContext
 * as we are working with java config class and not xml file
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Employee employee = (Employee) context.getBean("getEmployee");
        employee.setEmpName("John");
        employee.setEmpId(123);
        EmployeeRecord employeeRecord = employee.getEmployeeRecord();
       employeeRecord.setProjectName("java");
       employeeRecord.setProjectId(12);

        System.out.println(employee);

    }
}
