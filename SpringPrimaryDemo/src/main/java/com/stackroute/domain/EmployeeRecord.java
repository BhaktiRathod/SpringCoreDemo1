package com.stackroute.domain;

public class EmployeeRecord {

    private int projectId;
    private String projectName;

    public EmployeeRecord() {
    }

    public EmployeeRecord(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
