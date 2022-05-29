package com.bridgelabz;
import java.util.*;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master Branch");

        Random randNum = new Random();
        int hour;

        for (int i = 0; i < 30; i++) {
            int check = randNum.nextInt(3);

            switch(check){
                case 0 :
                    hour=0;
                    break;
                case 1 :
                    hour=4;
                    break;
                default :
                    hour=8;
            }

            System.out.println("daily wage of employee is : "+(hour*20));

        }

    }
}