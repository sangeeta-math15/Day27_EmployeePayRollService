package com.bridgelabz.emppayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    List<EmployeeData> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void readEmployeeDataFromConsole() {
        System.out.println("Enter Employee id");
        int id=sc.nextInt();
        System.out.println("Enter Employee Name");
        String Name = sc.next();
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        list.add(new EmployeeData(id, Name, salary));
    }
    public void writeEmployeeDataInConsole() {
        System.out.println("Writing Employee Pay Roll Data \n"+list);
    }
}
