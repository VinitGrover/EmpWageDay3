package com.bridgelabz;

import java.util.ArrayList;

public class MultilpleCompany {
    public static void main(String[] args) {
        EmpWageBuilder e1 = new EmpWageBuilder();
        e1.empWage();

        ArrayList<EmpWageBuilder> a1 = new ArrayList();
        a1.add(e1);
    }
}
