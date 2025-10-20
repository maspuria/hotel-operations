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
//    public double getTotalPay() {
//        double totalPay = hoursWorked * payRate;
//        double totalPayWithOvertime =
//    }

    public double getRegularHours(){
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }


}
