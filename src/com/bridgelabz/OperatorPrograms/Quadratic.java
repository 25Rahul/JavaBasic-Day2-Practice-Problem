package com.bridgelabz.OperatorPrograms;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a:");
        double a = scanner.nextInt();
        System.out.println("Enter value of b:");
        double b = scanner.nextInt();
        System.out.println("Enter value of c:");
        double c = scanner.nextInt();
        double delta = (b*b)-4*a*c;

        double root1 =  (-b + Math.sqrt(delta))/(2*a);
        double root2 =  (-b - Math.sqrt(delta))/(2*a);
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }
}
