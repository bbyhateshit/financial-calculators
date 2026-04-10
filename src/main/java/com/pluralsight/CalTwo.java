package com.pluralsight;

import java.util.Scanner;

public class CalTwo {


public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);


// USER INPUTS :
            System.out.print("Enter the deposit amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate: ");
            double ratePercent = scanner.nextDouble();

            System.out.print("Enter the number of years until maturity: ");
            int years = scanner.nextInt();


// CALCULATIONS :
            double r = ratePercent / 100.0;
            int totalDays = 365 * years;
            double futureValue = principal * Math.pow(1 + (r / 365.0), totalDays);
            double interestEarned = futureValue - principal;

// RESULTS :

            System.out.printf("  Initial Deposit:      $%,.2f%n", principal);
            System.out.printf("  Annual Interest Rate:  %.2f%%%n", ratePercent);
            System.out.printf("  Term:                  %d year(s)%n", years);
            System.out.printf("  Compounding:           Daily (365 days/year)%n");
            System.out.println("------------------------------------------");
            System.out.printf("  Future Value (FV):    $%,.2f%n", futureValue);
            System.out.printf("  Total Interest Earned: $%,.2f%n", interestEarned);


            scanner.close();
        }
}






