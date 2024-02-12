package com.bridgelabz.ForLoopStatements;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scanner.nextInt();
        int dummy = num;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(rev == dummy){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
