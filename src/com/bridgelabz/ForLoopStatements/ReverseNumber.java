package com.bridgelabz.ForLoopStatements;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scanner.nextInt();
        int rev = 0;
        for(;num>0;){
            rev = rev*10+num%10;
            num = num/10;
        }
        System.out.println("The Reversed Number:"+ rev);
    }
}
