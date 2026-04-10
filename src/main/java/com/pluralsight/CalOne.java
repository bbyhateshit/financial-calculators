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


    }
}
