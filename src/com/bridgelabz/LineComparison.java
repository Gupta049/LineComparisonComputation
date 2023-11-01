package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinate value for first line");
        System.out.print("Enter the x1 co-ordinate of first point ");
        double x1 = sc.nextDouble();
        System.out.print("Enter the y1 co-ordinate of first point ");
        double y1 = sc.nextDouble();
        System.out.print("Enter the x2 co-ordinate of Second point ");
        double x2 = sc.nextDouble();
        System.out.print("Enter the y2 co-ordinate of Second point ");
        double y2 = sc.nextDouble();
        double lengthOfFirstLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Calculate the length for first line is " + lengthOfFirstLine);
        String l1 = String.valueOf(lengthOfFirstLine);
        System.out.println("Enter the cordinate value for Second line");
        System.out.print("Enter the X1 co-ordinate of first point ");
        double X1 = sc.nextDouble();
        System.out.print("Enter the Y1 co-ordinate of first point ");
        double Y1 = sc.nextDouble();
        System.out.print("Enter the X2 co-ordinate of Second point ");
        double X2 = sc.nextDouble();
        System.out.print("Enter the Y2 co-ordinate of Second point ");
        double Y2 = sc.nextDouble();
        double lengthOfSecondLine = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
        String l2 = String.valueOf(lengthOfSecondLine);
        System.out.println("Calculate the length for second line is " + lengthOfSecondLine);


        if (l1.equals(l2)) {
            System.out.println("two line are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }
}
