package com.bridgelabz;
import java.util.*;

public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master Branch");

        Random randNum = new Random();

        int i = 0, hour = 0, sum = 0, maxHour=0;

        while ( i<20 && maxHour<100 ) {


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
            i++;
            maxHour+=hour;
        }

        System.out.println("Total Wages in 20 day period "+sum);

    }
}