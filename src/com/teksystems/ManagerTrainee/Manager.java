package com.teksystems.ManagerTrainee;

public class Manager extends Employee{

    Manager(Long employeeId, String employeeName, String employeeAddress, Long employeePhone, Double basicSalary){
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    @Override
    public Double calculateTransportAllowance() {
        return 0.15 * basicSalary;
    }
}
