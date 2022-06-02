package com.bridgelabz;

import java.util.ArrayList;

public class MultilpleCompany implements EmpWageBuilder {

    public void empWage(EmpWageComputation m1){
        System.out.println("Welcome to Employee Wage Computation program ");

        int maxHour, maxDays, wagePerHour;

        System.out.print("Enter Maximum working hours : ");
        maxHour = EmpWageComputation.sc.nextInt();

        System.out.print("Enter Maximum working days : ");
        maxDays = EmpWageComputation.sc.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        wagePerHour = EmpWageComputation.sc.nextInt();

        m1.totalWage(maxDays, maxHour, wagePerHour);

    }

    public static void main(String[] args) {

        EmpWageComputation m1 = new EmpWageComputation();
        MultilpleCompany c1 = new MultilpleCompany();
        c1.empWage(m1);

        ArrayList<EmpWageBuilder> a1 = new ArrayList();
        a1.add(c1);
    }
}
