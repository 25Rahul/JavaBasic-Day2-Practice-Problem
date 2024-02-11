package com.bridgelabz.IfElseStatements;
import java.util.Scanner;
public class NumberToWord{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single digit number: ");
        int num = scanner.nextInt();
        String[] words = {"zero","one","two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if(num>=0 && num<=9){
           System.out.println("In words:" + words[num]);
        }
        else{
            System.out.println("Invalid input. Please enter a single digit number.");
        }

    }
}

