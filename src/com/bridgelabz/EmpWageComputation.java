package com.bridgelabz;
import java.util.*;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master Branch");
        Random randNum = new Random();
        int check = randNum.nextInt(2);
        if (check == 0)
            System.out.println("Employee is Absent");
        else
            System.out.println("Employee is Present");
    }
}