package com.pluralsight;


import java.util.Scanner;

public record CalOne() {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// USER INPUTS :
        System.out.print("Enter the loan amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualRatePercent = scanner.nextDouble();

        System.out.print("Enter the loan term in years: ");
        int years = scanner.nextInt();

        scanner.close();
// CALCULATIONS :
        double r = annualRatePercent / 100.0;
        double i = r / 12.0;
        int n = years * 12;

// FORMULA : M = P * (i(1+i)^n) / ((1+i)^n - 1)
        double onePlusI_n = Math.pow(1 + i, n);
        double monthlyPayment = principal * (i * onePlusI_n) / (onePlusI_n - 1);

// INTEREST CALCULATION :
        double totalInterest = (monthlyPayment * n) - principal;

// RESULTS :

        System.out.printf("Loan:   $%,.2f%n", principal);
        System.out.printf("Annual Interest:   %.3f%%%n", annualRatePercent);
        System.out.printf("Loan Term:   %d years (%d payments)%n", years, n);
        System.out.printf("Monthly Payment:   $%,.2f%n", monthlyPayment);
        System.out.printf("Total Interest:   $%,.2f%n", totalInterest);
    }

}

