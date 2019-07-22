package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {



    private int empId;
    private String empName;

    @Autowired
    @Qualifier("bean1")
    private EmployeeRecord employeeRecord;

    public Employee() {
    }

    public Employee(int empId, String empName, EmployeeRecord employeeRecord) {
        this.empId = empId;
        this.empName = empName;
        this.employeeRecord = employeeRecord;
    }

    public EmployeeRecord getEmployeeRecord() {
        return employeeRecord;
    }


    public void setEmployeeRecord(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", employeeRecord=" + employeeRecord +
                '}';
    }
}
