package com.bridgelabz;

public class EmployeePayrollData {
    private int id;
    private String name;
    private double salary;

    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id; // Assign the provided ID to the instance variable
        this.name = name; // Assign the provided name to the instance variable
        this.salary = salary; // Assign the provided salary to the instance variable
    }

    public int getId() {
        return id; // Return the employee ID
    }

    public String getName() {
        return name; // Return the employee name
    }

    public double getSalary() {
        return salary; // Return the employee salary
    }
}
