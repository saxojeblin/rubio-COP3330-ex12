/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        double p, rate, convertRate, years, total;
        String strP, strRate, strYears;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        strP = sc.next();
        System.out.print("Enter the rate of interest: ");
        strRate = sc.next();
        System.out.print("Enter the number of years: ");
        strYears = sc.next();

        p = Double.parseDouble(strP);
        rate = Double.parseDouble(strRate);
        convertRate = rate / 100;
        years = Double.parseDouble(strYears);

        total = p * (1 + convertRate * years);

        System.out.printf("After %.0f years at %.2f%%, the investment will be worth $%.2f.", years, rate, total);
    }
}
