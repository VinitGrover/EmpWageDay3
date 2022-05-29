package com.bridgelabz;
import java.util.*;

public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master Branch");

        Random randNum = new Random();

        int hour = 0, sum = 0;

        for (int i = 0; i < 20; i++) {

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

            System.out.println("daily Wages are : "+hour*20);
            sum+=hour*20;
        }

        System.out.println("Total Wages in 20 day period "+sum);

    }
}