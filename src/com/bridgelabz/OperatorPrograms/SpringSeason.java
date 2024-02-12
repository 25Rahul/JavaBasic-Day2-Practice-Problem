package com.bridgelabz.OperatorPrograms;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month:");
        int m = scanner.nextInt();
        System.out.println("Enter the day:");
        int d = scanner.nextInt();
        boolean isSpring = (m == 3 && d>=20 && d<=31)||
                           (m == 4 && d>=1 && d<=30)||
                           (m == 5 && d>=1 && d<=31)||
                           (m == 6 && d>=1 && d<=20);
        System.out.println(isSpring);
    }
}
