package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollMain {
    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        // Create an empty ArrayList to store employee payroll data
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        // Create an instance of EmployeePayrollService
        Scanner consoleInputReader = new Scanner(System.in);
        // Create a Scanner object to read user input from the console
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        // Call the method to read employee payroll data
        employeePayrollService.writeEmployeePayrollData();
        // Call the method to write employee payroll data
    }
}
