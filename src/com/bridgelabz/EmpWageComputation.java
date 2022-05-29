package com.bridgelabz;
import java.util.*;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master Branch");

        Random randNum = new Random();
        int hour;

        for (int i = 0; i <= 30; i++) {
            int check = randNum.nextInt(2);
            if (check == 0){
                hour=8;
            }
            else{
                hour=0;
            }
            System.out.println("daily wage of employee is : "+(hour*20));
        }
    }
}
