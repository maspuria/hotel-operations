package com.pluralsight;

public class Employee {
    // field members (backing variables)
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    //Constructors

    //Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    // Derived Getters
    // derived getter to calculate the workers total pay
    public double getTotalPay() {
        double regularHoursPay = getRegularHours() * payRate;
        double overtimeHoursPay = getOvertimeHours() * payRate * 1.5;
        return regularHoursPay + overtimeHoursPay;
    }
    // derived getter to calculate the workers regular hours
    public double getRegularHours(){
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }
    // derived getter to calculate the workers overtime hours they have
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }



}
