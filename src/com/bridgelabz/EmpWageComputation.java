package com.bridgelabz;
import java.util.*;

class EmpWageComputation {

    void totalWage(int i, int maxHour) {

        Random randNum = new Random();
        int j = 0, hour = 0, sum = 0, maximumHour = 0;

        while (j < i && maximumHour < maxHour) {

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
            System.out.println("daily Wages are : " + hour * 20);
            sum += hour * 20;
            j++;
            maxHour += hour;
        }
        System.out.println("Total Wages in 20 day period " + sum);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master Branch");
        EmpWageComputation emp1 = new EmpWageComputation();
        emp1.totalWage(20, 100);
    }
}

