package com.bridgelabz;
import java.util.*;

class EmpWageComputation {

    static Scanner sc = new Scanner(System.in);

    void totalWage(int maxDays, int maxHour, int wagePerHour) {

        Random randNum = new Random();
        int j = 0, hour = 0, sum = 0, maximumHour = 0;

        while (j < maxDays && maximumHour < maxHour) {

            int check = randNum.nextInt(3);

            switch (check) {
                case 0:
                    hour = 0;
                    break;
                case 1:
                    hour = 4;
                    break;
                default:
                    hour = 8;
            }
            System.out.println("daily Wages are : " + hour * wagePerHour);
            sum += hour * wagePerHour;
            j++;
            maximumHour += hour;
        }
        System.out.println("Total Wages of employee is :  " + sum);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master Branch");
        EmpWageComputation emp1 = new EmpWageComputation();

        System.out.print("Enter Maximum working hours : ");
        int maxHour = sc.nextInt();

        System.out.print("Enter Maximum working days : ");
        int maxDays = sc.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        int wagePerHour = sc.nextInt();


        emp1.totalWage(maxDays, maxHour, wagePerHour);
    }
}

