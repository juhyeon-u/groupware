package com.ksmartech.groupware.model;

public class EmployeeDto {
    private String employeeId;
    private String positionId;
    private String dutyId;
    private String groupId;
    private String employeeName;
    private String employeeEmail;
    private String employeePwd;
    private String employeeJoinDate;
    private String employeeLeaveDate;
    private String employeePhonenumber;
    private String employeeBirth;
    private String employeeState;

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeId='" + employeeId + '\'' +
                ", positionId='" + positionId + '\'' +
                ", dutyId='" + dutyId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeePwd='" + employeePwd + '\'' +
                ", employeeJoinDate='" + employeeJoinDate + '\'' +
                ", employeeLeaveDate='" + employeeLeaveDate + '\'' +
                ", employeePhonenumber='" + employeePhonenumber + '\'' +
                ", employeeBirth='" + employeeBirth + '\'' +
                ", employeeState='" + employeeState + '\'' +
                '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePwd() {
        return employeePwd;
    }

    public void setEmployeePwd(String employeePwd) {
        this.employeePwd = employeePwd;
    }

    public String getEmployeeJoinDate() {
        return employeeJoinDate;
    }

    public void setEmployeeJoinDate(String employeeJoinDate) {
        this.employeeJoinDate = employeeJoinDate;
    }

    public String getEmployeeLeaveDate() {
        return employeeLeaveDate;
    }

    public void setEmployeeLeaveDate(String employeeLeaveDate) {
        this.employeeLeaveDate = employeeLeaveDate;
    }

    public String getEmployeePhonenumber() {
        return employeePhonenumber;
    }

    public void setEmployeePhonenumber(String employeePhonenumber) {
        this.employeePhonenumber = employeePhonenumber;
    }

    public String getEmployeeBirth() {
        return employeeBirth;
    }

    public void setEmployeeBirth(String employeeBirth) {
        this.employeeBirth = employeeBirth;
    }

    public String getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(String employeeState) {
        this.employeeState = employeeState;
    }
}
