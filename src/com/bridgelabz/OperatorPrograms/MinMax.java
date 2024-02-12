package com.bridgelabz.OperatorPrograms;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();
        int num1 = a+b*c;
        int num2 = c+a/b;
        int num3 = a%b+c;
        int num4 = a*b+c;
        int max1 = Math.max(num1,num2);
        int max2 = Math.max(num3,num4);
        int min1 = Math.min(num1,num2);
        int min2 = Math.min(num3,num4);

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(min1);
        System.out.println(min2);
    }
}
