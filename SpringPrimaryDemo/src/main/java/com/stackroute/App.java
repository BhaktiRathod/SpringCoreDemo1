package com.stackroute;

import com.stackroute.config.ConfigurationClass;
import com.stackroute.domain.Employee;
import com.stackroute.domain.EmployeeRecord;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Employee employee = (Employee) context.getBean("getEmployee");
        employee.setEmpName("John");
        employee.setEmpId(123);
        EmployeeRecord employeeRecord = employee.getEmployeeRecord();
//        employeeRecord.setProjectName("java");
//        employeeRecord.setProjectId(12);

        System.out.println(employee);
    }
}
