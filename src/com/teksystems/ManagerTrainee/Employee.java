package com.teksystems.ManagerTrainee;

public class Employee {

    //fields
    public Long employeeId;
    public String employeeName;
    public String employeeAddress;
    public Long employeePhone;
    public Double basicSalary;
    public Double specialAllowance = 250.80;
    public Double Hra = 1000.50;

    //constructors
    Employee(Long employeeId, String employeeName, String employeeAddress, Long employeePhone, Double basicSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    //method
    public Double calculateSalary(){
        return basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
    }

    public Double calculateTransportAllowance(){
        return basicSalary * .10;
    }

}
