package com.bridgelabz;

public class EmpWageBuilder extends EmpWageComputation {
    int maxHour, maxDays, wagePerHour;
    void empWage() {
        System.out.println("Welcome to Employee Wage Computation program ");



        System.out.print("Enter Maximum working hours : ");
        maxHour = EmpWageComputation.sc.nextInt();

        System.out.print("Enter Maximum working days : ");
        maxDays = EmpWageComputation.sc.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        wagePerHour = EmpWageComputation.sc.nextInt();

        totalWage(maxDays, maxHour, wagePerHour);

    }
}
