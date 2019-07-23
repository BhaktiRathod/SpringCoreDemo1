package com.stackroute.domain;

public class Employee {

    int empId;
    String empName;

    public Employee(){

    }

    public Employee(int empId , String empName){
        this.empId = empId;
        this.empName = empName;
    }
    public String getEmpName() {
        return empName; }

    public void setEmpName(String empName) {
        this.empName = empName; }

        public int getEmpId() {
        return empId; }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + empName + '\'' +
                '}';
    }


}
