package com.bridgelabz.ForLoopStatements;
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  natural number:");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
               sum= num*(num+1)/2;
        }
        System.out.println("Sum of  natural numbers:" + sum);
    }
}


