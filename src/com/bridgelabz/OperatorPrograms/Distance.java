package com.bridgelabz.OperatorPrograms;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x = scanner.nextInt();
        System.out.println("Enter value of y:");
        int y = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Euclidean distance from (" + x + ", " + y + ") to the origin (0, 0): " + distance);

    }
}
