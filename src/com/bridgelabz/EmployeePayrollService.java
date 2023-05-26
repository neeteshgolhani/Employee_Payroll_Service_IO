package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum ToService {CONSOLE, FILE_IO, DB_IO, REST_IO}

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<>(); // Create an empty ArrayList to store employee payroll data
    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList; // Initialize the employee payroll list with the provided list
    }

    void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt(); // Read employee ID from the console
        consoleInputReader.nextLine();

        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.nextLine(); // Read employee name from the console

        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble(); // Read employee salary from the console
        consoleInputReader.nextLine();

        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
        // Create a new EmployeePayrollData object and add it to the list
    }

    void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll  to Console:");
        for (EmployeePayrollData employee : employeePayrollList) {
            // Iterate over the employee payroll list
            System.out.println("ID: " + employee.getId()); // Print employee ID
            System.out.println("Name: " + employee.getName()); // Print employee name
            System.out.println("Salary: " + employee.getSalary()); // Print employee salary
            System.out.println("---------------------");
        }
    }
}
