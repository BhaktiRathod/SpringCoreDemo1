package com.stackroute;

public class Employee {

    int empId;
    public String getEmpName() {
        return empName; }

    public void setEmpName(String empName) {
        this.empName = empName; }

    String empName;

    public int getEmpId() {
        return empId; }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public Employee() {
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + empName + '\'' +
                '}';
    }
}
