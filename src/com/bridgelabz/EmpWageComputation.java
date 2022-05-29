package com.bridgelabz;
import java.util.*;


public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master Branch");

        Random randNum = new Random();

        int hour = 0;

        for (int i = 0; i < 30; i++) {
            int check = randNum.nextInt(3);

            if (check == 0)
                hour = 0;
            else if (check == 1)
                hour = 4;
            else
                hour = 8;
        }
        System.out.println("daily wage of employee is : " + (hour * 20));
    }
}