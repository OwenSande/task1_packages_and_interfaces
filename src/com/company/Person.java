package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String surnameSande56272;
    String nameSande56272;
    String streetSande56272;
    String zipCode56272;
    String city56272;

    public  void initializeSande56272() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Retrieving data about a person. ");
        System.out.println("Enter your surname ");
        surnameSande56272 = br.readLine();
        System.out.println("Enter your name ");
        nameSande56272 = br.readLine();
        System.out.println("Enter the street ");
        streetSande56272 = br.readLine();
        System.out.println("Enter your zipCode ");
        zipCode56272 = br.readLine();
        System.out.println("Enter the city ");
        city56272 = br.readLine();
    }

    public  void printSande56272(){
        System.out.println("Displaying data");
        System.out.println("=========");
        System.out.println("Surname "+ surnameSande56272);
        System.out.println("Name "+ nameSande56272);
        System.out.println("Street  "+ streetSande56272);
        System.out.println("Zipcode "+ zipCode56272);
        System.out.println("city "+ city56272);

    }
}

class Staff extends Person implements Salary{
    String educationSande56272;
    String positionSande56272;

    public void initialize1Sande56272() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your education ");
        educationSande56272 = br.readLine();
        System.out.println("Enter your position ");
        positionSande56272 = br.readLine();
    }

    public void print1Sande56272(){
        printSande56272();
        System.out.println("Education "+ educationSande56272);
        System.out.println("Position "+ positionSande56272);

    }
    @Override
    public double salaryToPay(double hoursSande56272, double rateSande56272){
        return hoursSande56272 * rateSande56272;
    }

    @Override
    public  double salaryForOvertime(double overtimeHoursSande56272, double rateSande56272){
        return overtimeHoursSande56272 * (1.5 * rateSande56272);
    }
}
