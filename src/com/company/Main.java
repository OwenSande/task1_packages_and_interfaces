package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Salary {
    double salaryToPay(double hoursSande56272, double rateSande56272);

    default double salaryForOvertime(double overtimeHoursSande56272, double rateSande56272){
        return 1;
    }

    static  int bonus(int yearsOfExperience){
        if(yearsOfExperience > 5){
            return 100;

        }else{
            return 0;
        }

    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        Staff employee = new Staff();

        //employee.initializeSande56272();
        //employee.printSande56272();

        //employee.initialize1Sande56272();
        //employee.print1Sande56272();

        double salary = employee.salaryToPay(180, 20);
        System.out.println("The employee received a salary amounting to " + salary);

        double salaryForOvertime = employee.salaryForOvertime(10, 40);
        System.out.println("The employee received salary for overtime amounting to "+ salaryForOvertime);

        int bonus = Salary.bonus(6);
        System.out.println("The employee received bonus amonting to "+ bonus);
    }



}

