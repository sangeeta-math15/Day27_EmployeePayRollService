package com.bridgelabz.emppayroll;

public class EmployeePayRollMain {
    //Driver Code
    public static void main(String[] args) {
        EmployeePayRollService employeePayRollService = new EmployeePayRollService();
        System.out.println("Welcome to Employee Payroll Service");
        employeePayRollService.readEmployeeDataFromConsole();
        employeePayRollService.writeEmployeeDataInConsole();
    }
}
