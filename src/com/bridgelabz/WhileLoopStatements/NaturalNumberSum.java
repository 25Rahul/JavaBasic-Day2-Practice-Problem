package com.bridgelabz.WhileLoopStatements;
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  natural number:");
        int num = scanner.nextInt();
        int i =0;
        int sum=0;
        while(i<num){
            sum = num*(num+1)/2;
            i++;
        }
        System.out.println("Sum of  natural numbers:" + sum);
    }
}
